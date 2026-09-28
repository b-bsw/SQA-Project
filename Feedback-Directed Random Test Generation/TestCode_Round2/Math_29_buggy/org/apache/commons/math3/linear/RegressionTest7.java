package org.apache.commons.math3.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (int) (short) 10);
        int int3 = openMapRealVector2.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector6.append((double) 1L);
        org.apache.commons.math3.linear.RealVector realVector12 = openMapRealVector10.mapSubtract((double) 1.0f);
        int int13 = openMapRealVector10.getMinIndex();
        double double14 = openMapRealVector2.getDistance(openMapRealVector10);
        double double15 = openMapRealVector2.getL1Norm();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector14.mapSubtract(0.13333333333333333d);
        org.apache.commons.math3.linear.RealVector realVector18 = realVector16.mapSubtract(10.488088481701515d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector21);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector21.append(openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector36);
        org.apache.commons.math3.linear.RealVector realVector39 = openMapRealVector21.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector31);
        org.apache.commons.math3.linear.RealVector realVector41 = openMapRealVector21.mapDivide((double) 20);
        openMapRealVector21.set((double) 11);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double47 = openMapRealVector46.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector46.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector50);
        double[] doubleArray52 = openMapRealVector46.toArray();
        double[] doubleArray53 = openMapRealVector46.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector46.mapAddToSelf((double) 'a');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double59 = openMapRealVector58.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector58.mapAddToSelf(1.0d);
        int int62 = openMapRealVector58.getDimension();
        openMapRealVector58.setEntry(0, 970.0d);
        double double66 = openMapRealVector55.getLInfDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector21.subtract(openMapRealVector58);
        double[] doubleArray68 = openMapRealVector58.toArray();
        // The following exception was thrown during execution in test generation
        try {
            double double69 = realVector16.cosine((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero norm");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector41);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 873.0d + "'", double66 == 873.0d);
        org.junit.Assert.assertNotNull(openMapRealVector67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 970.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector2);
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector20.mapMultiplyToSelf(Double.POSITIVE_INFINITY);
        double[] doubleArray23 = openMapRealVector20.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector24.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector28.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        double[] doubleArray34 = openMapRealVector28.toArray();
        openMapRealVector28.set(10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector28.append((double) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector28.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector25.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector39);
        int int41 = openMapRealVector39.getMinIndex();
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double45 = openMapRealVector39.walkInOptimizedOrder(realVectorChangingVisitor42, 108, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (108)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertNotNull(openMapRealVector40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(110, 1.0E-12d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        java.lang.Double[] doubleArray24 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        openMapRealVector17.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        openMapRealVector17.set(14.142135623730951d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector17.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector38.append(openMapRealVector43);
        double double46 = openMapRealVector43.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector48 = openMapRealVector43.mapDivide((double) 0L);
        int int49 = openMapRealVector43.getMaxIndex();
        org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector43.mapSubtract((double) 1L);
        org.apache.commons.math3.linear.RealVector realVector53 = openMapRealVector43.mapDivideToSelf(1000.0d);
        org.apache.commons.math3.linear.RealVector realVector54 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(realVector53);
        double double55 = realVector53.getNorm();
        org.apache.commons.math3.linear.RealMatrix realMatrix56 = openMapRealVector35.outerProduct(realVector53);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertNotNull(realVector51);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(realVector54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix56);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        double[] doubleArray9 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, (double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, 3067.409330363328d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(19, 150.0d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(15);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator48 = openMapRealVector45.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector45.mapMultiplyToSelf((double) (short) 0);
        openMapRealVector45.set(306.7409330363328d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(realVector50);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        boolean boolean11 = openMapRealVector9.isDefaultValue((double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator13 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry14 = openMapRealVector12.new OpenMapEntry(iterator13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector24.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double29 = openMapRealVector25.getL1Distance(openMapRealVector28);
        double double30 = openMapRealVector25.getMaxValue();
        boolean boolean31 = openMapRealVector25.isInfinite();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor32 = openMapRealVector25.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35, 100);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.append(openMapRealVector48);
        int int51 = openMapRealVector50.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50, (int) (byte) 0);
        double double54 = openMapRealVector50.getMinValue();
        boolean boolean55 = openMapRealVector39.equals((java.lang.Object) openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector25.add(openMapRealVector50);
        double double57 = openMapRealVector12.getL1Distance(openMapRealVector56);
        org.apache.commons.math3.linear.RealVector realVector59 = openMapRealVector12.mapMultiplyToSelf((double) 39);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(entryItor32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 19 + "'", int51 == 19);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 22.0d + "'", double57 == 22.0d);
        org.junit.Assert.assertNotNull(realVector59);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 100.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector12.unitVector();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor14 = openMapRealVector13.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapDivide(3.1622776601683795d);
        double double17 = realVector16.getMaxValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertNotNull(entryItor14);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.31622776601683794d + "'", double17 == 0.31622776601683794d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (short) -1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector15.unitVector();
        boolean boolean17 = openMapRealVector16.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        int int28 = openMapRealVector27.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double34 = openMapRealVector33.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector33);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector33.append(openMapRealVector38);
        int int41 = openMapRealVector40.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector30.add(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector44.append((double) (short) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector44.append((double) 'a');
        double[] doubleArray55 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) 1, (double) (byte) 1);
        org.apache.commons.math3.linear.RealVector realVector67 = openMapRealVector65.mapMultiplyToSelf(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator68 = openMapRealVector65.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector61.add(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector48.append((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        boolean boolean71 = openMapRealVector16.equals((java.lang.Object) openMapRealVector65);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator72 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry73 = openMapRealVector16.new OpenMapEntry(iterator72);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector67);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertNotNull(openMapRealVector70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        int int5 = openMapRealVector4.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double9 = openMapRealVector8.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector8);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector8.append(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector8.mapAddToSelf((double) 100L);
        boolean boolean18 = openMapRealVector4.equals((java.lang.Object) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector4.append((double) 0);
        double double22 = openMapRealVector4.getEntry(5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(15, (int) ' ');
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        double double12 = openMapRealVector9.getNorm();
        org.apache.commons.math3.linear.RealVector realVector14 = openMapRealVector9.mapSubtractToSelf((double) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector9.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(openMapRealVector18);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        openMapRealVector2.set(10.0d);
        double[] doubleArray11 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector21.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector25.mapSubtract(10.0d);
        double double29 = openMapRealVector14.getL1Distance(openMapRealVector25);
        double double30 = openMapRealVector14.getNorm();
        double double31 = openMapRealVector2.getL1Distance((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector2.mapAddToSelf((double) 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(openMapRealVector33);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(100, (int) (byte) 1, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.mapAdd(10.0d);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray12, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector15.mapAdd((double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15, 0);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = openMapRealVector5.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector19);
        double double22 = openMapRealVector19.getEntry((int) (short) 0);
        org.junit.Assert.assertNotNull(openMapRealVector5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(20, 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector5.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        double[] doubleArray11 = openMapRealVector5.toArray();
        openMapRealVector5.set(10.0d);
        double[] doubleArray14 = openMapRealVector5.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector2.append(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector18.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector22);
        openMapRealVector18.setEntry(5, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector2.append((org.apache.commons.math3.linear.RealVector) openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double12 = openMapRealVector11.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector11.append(openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector22.append(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector19.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector27.copy();
        double[] doubleArray32 = openMapRealVector27.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray32, 1100.0d);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector2.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.append(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector47.mapAddToSelf(1100.0d);
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector2.add((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector29);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        int int12 = openMapRealVector9.getMinIndex();
        double[] doubleArray13 = openMapRealVector9.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray13, 306.7409330363328d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        int int44 = openMapRealVector43.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43, (int) (byte) 0);
        double double47 = openMapRealVector43.getMinValue();
        double double48 = openMapRealVector9.getL1Distance(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        int int60 = openMapRealVector59.getMinIndex();
        int int61 = openMapRealVector59.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector64.append(openMapRealVector69);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double80 = openMapRealVector79.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.append(openMapRealVector79);
        org.apache.commons.math3.linear.RealVector realVector82 = openMapRealVector64.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector74);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector64.mapDivide((double) 20);
        double double85 = openMapRealVector59.getL1Distance(openMapRealVector64);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator86 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry87 = openMapRealVector59.new OpenMapEntry(iterator86);
        double double88 = openMapRealVector49.getL1Distance(openMapRealVector59);
        double[] doubleArray89 = openMapRealVector59.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, (int) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector93 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, 0);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator94 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry95 = openMapRealVector93.new OpenMapEntry(iterator94);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12, 34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31, 100);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector35.mapDivideToSelf((double) 10.0f);
        org.apache.commons.math3.linear.RealVector realVector39 = realVector37.mapDivide((double) (short) -1);
        int int40 = realVector37.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector37);
        org.apache.commons.math3.linear.RealVector realVector42 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector41);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor43 = openMapRealVector41.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector28.add(openMapRealVector41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 54 != 110");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 109 + "'", int40 == 109);
        org.junit.Assert.assertNotNull(realVector42);
        org.junit.Assert.assertNotNull(entryItor43);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double[] doubleArray1 = new double[] { 0.00909090909090909d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        int int13 = openMapRealVector12.getMinIndex();
        int int14 = openMapRealVector12.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector17.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector12.append((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.append(openMapRealVector44);
        int int47 = openMapRealVector46.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector46, (int) (byte) 0);
        double double50 = openMapRealVector46.getMinValue();
        double double51 = openMapRealVector12.getL1Distance(openMapRealVector46);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector12.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector60.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.append(openMapRealVector60);
        int int63 = openMapRealVector62.getMinIndex();
        int int64 = openMapRealVector62.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double68 = openMapRealVector67.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector67);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double73 = openMapRealVector72.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector67.append(openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double78 = openMapRealVector77.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector77);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double83 = openMapRealVector82.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector77.append(openMapRealVector82);
        org.apache.commons.math3.linear.RealVector realVector85 = openMapRealVector67.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector77);
        org.apache.commons.math3.linear.RealVector realVector87 = openMapRealVector67.mapDivide((double) 20);
        double double88 = openMapRealVector62.getL1Distance(openMapRealVector67);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator89 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry90 = openMapRealVector62.new OpenMapEntry(iterator89);
        double double91 = openMapRealVector52.getL1Distance(openMapRealVector62);
        org.apache.commons.math3.linear.RealVector realVector93 = openMapRealVector62.mapDivideToSelf((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = openMapRealVector2.getL1Distance(realVector93);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 1 != 20");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.00909090909090909d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 19 + "'", int47 == 19);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 19 + "'", int63 == 19);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20 + "'", int64 == 20);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector84);
        org.junit.Assert.assertNotNull(realVector85);
        org.junit.Assert.assertNotNull(realVector87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertNotNull(realVector93);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(0, (double) 34);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator3 = openMapRealVector2.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6, 100);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector13 = openMapRealVector10.mapSubtract((double) 1.0f);
        boolean boolean15 = openMapRealVector10.isDefaultValue(Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector2.append(openMapRealVector10);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor17 = openMapRealVector10.sparseIterator();
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = openMapRealVector10.walkInOptimizedOrder(realVectorPreservingVisitor18, 40, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: initial row 40 after final row 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertNotNull(entryItor17);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        double double2 = openMapRealVector1.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector4 = openMapRealVector1.mapSubtractToSelf(4.47213595499958d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(realVector4);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        double double4 = openMapRealVector3.getLInfNorm();
        boolean boolean5 = openMapRealVector3.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector3.mapAdd((double) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector9 = openMapRealVector3.mapDivide(1.0d);
        double[] doubleArray10 = openMapRealVector3.toArray();
        int int11 = openMapRealVector3.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 0, 30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector3.append(openMapRealVector14);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(openMapRealVector7);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(openMapRealVector15);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.append(openMapRealVector30);
        int int33 = openMapRealVector32.getMinIndex();
        int int34 = openMapRealVector32.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector47.append(openMapRealVector52);
        org.apache.commons.math3.linear.RealVector realVector55 = openMapRealVector37.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector32.append((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector59.append(openMapRealVector64);
        int int67 = openMapRealVector66.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66, (int) (byte) 0);
        double double70 = openMapRealVector66.getMinValue();
        double double71 = openMapRealVector32.getL1Distance(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector32.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector2.append(openMapRealVector32);
        openMapRealVector2.unitize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertNotNull(realVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 19 + "'", int67 == 19);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(openMapRealVector73);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator53 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry54 = openMapRealVector2.new OpenMapEntry(iterator53);
        boolean boolean56 = openMapRealVector2.isDefaultValue((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector58 = openMapRealVector2.mapDivideToSelf((double) (byte) 0);
        double double59 = realVector58.getMinValue();
        org.apache.commons.math3.linear.RealVector realVector61 = realVector58.mapDivide((double) 34);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor62 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = realVector61.walkInDefaultOrder(realVectorChangingVisitor62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(realVector58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(realVector61);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.append(openMapRealVector30);
        int int33 = openMapRealVector32.getMinIndex();
        int int34 = openMapRealVector32.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector47.append(openMapRealVector52);
        org.apache.commons.math3.linear.RealVector realVector55 = openMapRealVector37.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector32.append((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector59.append(openMapRealVector64);
        int int67 = openMapRealVector66.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66, (int) (byte) 0);
        double double70 = openMapRealVector66.getMinValue();
        double double71 = openMapRealVector32.getL1Distance(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector32.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector2.append(openMapRealVector32);
        org.apache.commons.math3.linear.RealVector realVector75 = openMapRealVector32.mapSubtractToSelf(110.0d);
        org.apache.commons.math3.linear.RealVector realVector77 = openMapRealVector32.mapSubtractToSelf((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertNotNull(realVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 19 + "'", int67 == 19);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(openMapRealVector73);
        org.junit.Assert.assertNotNull(realVector75);
        org.junit.Assert.assertNotNull(realVector77);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector14.mapDivide((double) 20);
        double double35 = openMapRealVector9.getL1Distance(openMapRealVector14);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator36 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry37 = openMapRealVector9.new OpenMapEntry(iterator36);
        openMapRealVector9.addToEntry((int) (short) 10, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.RealVector realVector42 = openMapRealVector9.mapDivide(269.6664606509308d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector9.copy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(realVector42);
        org.junit.Assert.assertNotNull(openMapRealVector43);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 100, (int) (byte) 0, (double) '4');
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openMapRealVector3.walkInDefaultOrder(realVectorPreservingVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 0.6666666666666666d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 29);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (short) -1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector15.unitVector();
        boolean boolean17 = openMapRealVector16.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        int int28 = openMapRealVector27.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double34 = openMapRealVector33.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector33);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector33.append(openMapRealVector38);
        int int41 = openMapRealVector40.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector30.add(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector44.append((double) (short) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector44.append((double) 'a');
        double[] doubleArray55 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) 1, (double) (byte) 1);
        org.apache.commons.math3.linear.RealVector realVector67 = openMapRealVector65.mapMultiplyToSelf(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator68 = openMapRealVector65.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector61.add(openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector48.append((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        boolean boolean71 = openMapRealVector16.equals((java.lang.Object) openMapRealVector65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = openMapRealVector16.getDistance(openMapRealVector72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector67);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertNotNull(openMapRealVector70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.apache.commons.math3.linear.RealVector realVector57 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        boolean boolean59 = openMapRealVector35.isDefaultValue((double) 'a');
        openMapRealVector35.set(979.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector52);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 9810.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(100, 9);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openMapRealVector2.walkInOptimizedOrder(realVectorPreservingVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        openMapRealVector82.unitize();
        org.apache.commons.math3.linear.RealVector realVector88 = openMapRealVector82.mapMultiply((double) ' ');
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = realVector88.walkInDefaultOrder(realVectorChangingVisitor89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 19 + "'", int58 == 19);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 20 + "'", int59 == 20);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector79);
        org.junit.Assert.assertNotNull(realVector80);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertNotNull(openMapRealVector82);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertNotNull(openMapRealVector85);
        org.junit.Assert.assertNotNull(realVector88);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(100, 190.0d);
        boolean boolean3 = openMapRealVector2.isNaN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector2.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector2);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openMapRealVector2.walkInDefaultOrder(realVectorChangingVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openMapRealVector3);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray8, (double) (byte) 10);
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
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector14.mapDivide((double) 20);
        openMapRealVector10.setSubVector(0, realVector34);
        int int36 = realVector34.getMinIndex();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.lang.Double[] doubleArray46 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray46);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48);
        org.apache.commons.math3.linear.RealVector realVector50 = openMapRealVector47.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector47);
        double double52 = openMapRealVector51.getL1Norm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector53 = openMapRealVector2.add((org.apache.commons.math3.linear.RealVector) openMapRealVector51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        double double4 = openMapRealVector3.getLInfNorm();
        boolean boolean5 = openMapRealVector3.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector3.mapAdd((double) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector9 = openMapRealVector3.mapDivide(1.0d);
        double[] doubleArray10 = openMapRealVector3.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(openMapRealVector7);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        double double6 = openMapRealVector5.getNorm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(141, 110);
        int int3 = openMapRealVector2.getMaxIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 140 + "'", int3 == 140);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        openMapRealVector32.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(0, (double) 100L);
        double double57 = openMapRealVector32.getL1Distance(openMapRealVector56);
        org.apache.commons.math3.linear.RealVector realVector59 = openMapRealVector32.mapSubtract(0.09090909090909091d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector32.append(20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(realVector59);
        org.junit.Assert.assertNotNull(openMapRealVector61);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        double double9 = openMapRealVector2.getSparsity();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector2.iterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector20.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double25 = openMapRealVector21.getL1Distance(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector2.append((org.apache.commons.math3.linear.RealVector) openMapRealVector21);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector2.mapSubtractToSelf(97.0d);
        int int29 = openMapRealVector2.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32, 100);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector39 = openMapRealVector36.mapSubtract((double) 1.0f);
        openMapRealVector36.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.getSubVector(1, 29);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector36.mapMultiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.mapAdd(10.0d);
        double double48 = openMapRealVector2.getL1Distance(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2070.0d + "'", double48 == 2070.0d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector7.getL1Norm();
        double double11 = openMapRealVector7.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector7.append(openMapRealVector15);
        openMapRealVector16.set(306.7409330363328d);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector16.mapMultiplyToSelf((double) (short) 100);
        java.lang.Double[] doubleArray21 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, 1100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, 970.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector16.append(openMapRealVector32);
        openMapRealVector33.unitize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(openMapRealVector33);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray43, (double) 9);
        org.apache.commons.math3.linear.RealVector realVector48 = openMapRealVector46.mapSubtractToSelf(Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) 1, (double) (byte) 1);
        org.apache.commons.math3.linear.RealVector realVector56 = openMapRealVector54.mapMultiplyToSelf(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator57 = openMapRealVector54.new OpenMapSparseIterator();
        double double58 = openMapRealVector54.getNorm();
        java.lang.Double[] doubleArray65 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray65);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray65, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray65, 3.1622776601683795d);
        double double71 = openMapRealVector54.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector70);
        org.apache.commons.math3.linear.RealVector realVector72 = openMapRealVector46.combineToSelf((double) 10L, (double) (byte) 1, (org.apache.commons.math3.linear.RealVector) openMapRealVector54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector73 = openMapRealVector9.add((org.apache.commons.math3.linear.RealVector) openMapRealVector54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 20 != 6");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertNotNull(realVector56);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 14.142135623730951d + "'", double71 == 14.142135623730951d);
        org.junit.Assert.assertNotNull(realVector72);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.apache.commons.math3.linear.RealVector realVector26 = openMapRealVector24.mapSubtractToSelf((double) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24, (int) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector36);
        int int39 = openMapRealVector38.getMinIndex();
        int int40 = openMapRealVector38.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector43.append(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double59 = openMapRealVector58.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector53.append(openMapRealVector58);
        org.apache.commons.math3.linear.RealVector realVector61 = openMapRealVector43.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector38.append((org.apache.commons.math3.linear.RealVector) openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector38.copy();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator64 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry65 = openMapRealVector38.new OpenMapEntry(iterator64);
        openMapEntry65.setIndex((int) ' ');
        openMapEntry65.setIndex((int) '#');
        boolean boolean70 = openMapRealVector24.equals((java.lang.Object) openMapEntry65);
        // The following exception was thrown during execution in test generation
        try {
            openMapEntry65.setValue(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19 + "'", int39 == 19);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector60);
        org.junit.Assert.assertNotNull(realVector61);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertNotNull(openMapRealVector63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(99, 0.00909090909090909d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        double double13 = openMapRealVector5.getMinValue();
        double double14 = openMapRealVector5.getMaxValue();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor15 = openMapRealVector5.sparseIterator();
        openMapRealVector5.set((double) 11);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = openMapRealVector2.dotProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 99 != 10");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(entryItor15);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (double) 109);
        double double3 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator4 = openMapRealVector2.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.RealVector realVector5 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector2);
        int int6 = openMapRealVector2.getMaxIndex();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.lang.Double[] doubleArray24 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        openMapRealVector17.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        double double32 = openMapRealVector17.getL1Norm();
        boolean boolean33 = openMapRealVector17.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector17.mapAdd((double) (short) 10);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector17.mapSubtract(1.0E-12d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector40.append((double) 1L);
        double double45 = openMapRealVector40.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double59 = openMapRealVector58.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector58);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double64 = openMapRealVector63.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector58.append(openMapRealVector63);
        org.apache.commons.math3.linear.RealVector realVector66 = openMapRealVector48.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
        double double67 = realVector66.getMinValue();
        double double68 = openMapRealVector40.getLInfDistance(realVector66);
        org.apache.commons.math3.linear.RealMatrix realMatrix69 = openMapRealVector17.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double73 = openMapRealVector72.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double78 = openMapRealVector77.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector72.append(openMapRealVector77);
        double double80 = openMapRealVector79.getLInfNorm();
        double double81 = openMapRealVector17.getL1Distance(openMapRealVector79);
        double double82 = openMapRealVector79.getMinValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector65);
        org.junit.Assert.assertNotNull(realVector66);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(32, 19);
        double double51 = openMapRealVector47.getDistance(openMapRealVector50);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator52 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry53 = openMapRealVector50.new OpenMapEntry(iterator52);
        // The following exception was thrown during execution in test generation
        try {
            openMapEntry53.setValue(35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(109);
        int int2 = openMapRealVector1.getDimension();
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector12.copy();
        openMapRealVector12.setEntry(3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector1.add(openMapRealVector12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 109 != 6");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector13);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        openMapRealVector6.setEntry(1, (double) (short) 0);
        boolean boolean12 = openMapRealVector6.isInfinite();
        java.lang.Double[] doubleArray13 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray13, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector17 = openMapRealVector15.mapSubtractToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector6.append(realVector17);
        double double19 = realVector17.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector21 = realVector17.mapDivide((double) 108);
        org.apache.commons.math3.linear.RealVector realVector23 = realVector17.mapMultiplyToSelf((double) 100L);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = realVector17.walkInOptimizedOrder(realVectorPreservingVisitor24, 29, 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (29)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(realVector21);
        org.junit.Assert.assertNotNull(realVector23);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(50, 0.9090909090909091d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5, 100);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector9.mapDivideToSelf((double) 10.0f);
        openMapRealVector9.setEntry(1, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector9.mapAddToSelf((-1.0d));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector2.append(openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        int int28 = openMapRealVector27.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double34 = openMapRealVector33.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector33);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector33.append(openMapRealVector38);
        int int41 = openMapRealVector40.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector30.add(openMapRealVector40);
        boolean boolean46 = openMapRealVector40.isDefaultValue((double) (byte) 0);
        double double47 = openMapRealVector40.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector49 = openMapRealVector40.mapMultiply(99.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double50 = openMapRealVector16.getDistance(openMapRealVector40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (21)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(realVector49);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        openMapRealVector2.set(10.0d);
        double[] doubleArray11 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector21.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector25.mapSubtract(10.0d);
        double double29 = openMapRealVector14.getL1Distance(openMapRealVector25);
        double double30 = openMapRealVector14.getNorm();
        double double31 = openMapRealVector2.getL1Distance((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.RealVector realVector33 = openMapRealVector14.mapDivide(4.47213595499958d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector36.unitVector();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor40 = openMapRealVector36.iterator();
        double double41 = openMapRealVector14.getDistance(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector44.append(openMapRealVector49);
        double double52 = openMapRealVector44.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector60.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector55.append(openMapRealVector60);
        int int63 = openMapRealVector62.getMinIndex();
        int int64 = openMapRealVector62.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double68 = openMapRealVector67.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector67);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double73 = openMapRealVector72.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector67.append(openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double78 = openMapRealVector77.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector77);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double83 = openMapRealVector82.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector77.append(openMapRealVector82);
        org.apache.commons.math3.linear.RealVector realVector85 = openMapRealVector67.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector77);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector62.append((org.apache.commons.math3.linear.RealVector) openMapRealVector67);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector44.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector67);
        int int88 = openMapRealVector67.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector36.append(openMapRealVector67);
        double double90 = openMapRealVector36.getL1Norm();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertNotNull(entryItor40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 19 + "'", int63 == 19);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20 + "'", int64 == 20);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector84);
        org.junit.Assert.assertNotNull(realVector85);
        org.junit.Assert.assertNotNull(openMapRealVector86);
        org.junit.Assert.assertNotNull(openMapRealVector87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertNotNull(openMapRealVector89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 100.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        boolean boolean4 = openMapRealVector3.isInfinite();
        boolean boolean5 = openMapRealVector3.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector3);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor7 = openMapRealVector6.iterator();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryItor7);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector82.mapAddToSelf((-1.0d));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector82.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math3.linear.OpenMapRealVector(0, (double) 100L);
        org.apache.commons.math3.linear.RealVector realVector94 = openMapRealVector92.mapMultiplyToSelf((double) 32);
        openMapRealVector92.set(3.1622776601683795d);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = openMapRealVector89.getDistance(openMapRealVector92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (0)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 19 + "'", int58 == 19);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 20 + "'", int59 == 20);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector79);
        org.junit.Assert.assertNotNull(realVector80);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertNotNull(openMapRealVector82);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertNotNull(openMapRealVector85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector88);
        org.junit.Assert.assertNotNull(openMapRealVector89);
        org.junit.Assert.assertNotNull(realVector94);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector14.mapDivide((double) 20);
        double double35 = openMapRealVector9.getL1Distance(openMapRealVector14);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator36 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry37 = openMapRealVector9.new OpenMapEntry(iterator36);
        openMapRealVector9.addToEntry((int) (short) 10, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(110);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.mapAddToSelf(109.0d);
        org.apache.commons.math3.linear.RealMatrix realMatrix45 = openMapRealVector9.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector44);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor46 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double47 = openMapRealVector9.walkInDefaultOrder(realVectorChangingVisitor46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realMatrix45);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        org.apache.commons.math3.linear.RealVector realVector47 = openMapRealVector25.mapMultiply(19.0d);
        double double48 = realVector47.getMinValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector7.mapAdd(1100.0d);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor51 = openMapRealVector7.sparseIterator();
        boolean boolean52 = openMapRealVector7.isInfinite();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector50);
        org.junit.Assert.assertNotNull(entryItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        int int8 = openMapRealVector2.getMinIndex();
        boolean boolean9 = openMapRealVector2.isInfinite();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        double double11 = openMapRealVector9.getMinValue();
        double double12 = openMapRealVector9.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector9.mapMultiplyToSelf(9202.227991089983d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 14.142135623730951d + "'", double12 == 14.142135623730951d);
        org.junit.Assert.assertNotNull(realVector16);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        int int44 = openMapRealVector43.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double55 = openMapRealVector54.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector49.append(openMapRealVector54);
        int int57 = openMapRealVector56.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector56, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector46.add(openMapRealVector56);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator61 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry62 = openMapRealVector56.new OpenMapEntry(iterator61);
        double double63 = openMapRealVector14.getDistance(openMapRealVector56);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double72 = openMapRealVector71.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector66.append(openMapRealVector71);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double77 = openMapRealVector76.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector76);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double82 = openMapRealVector81.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector76.append(openMapRealVector81);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector66.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector76);
        org.apache.commons.math3.linear.RealVector realVector86 = openMapRealVector66.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector88 = openMapRealVector66.mapAdd((double) 'a');
        double double89 = openMapRealVector14.getDistance(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector66.append(1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 19 + "'", int57 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector60);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector83);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertNotNull(realVector86);
        org.junit.Assert.assertNotNull(openMapRealVector88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector91);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(109, (double) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        int int13 = openMapRealVector12.getMinIndex();
        int int14 = openMapRealVector12.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector17.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector12.append((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector12.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector2.append((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector12.unitVector();
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor40 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = openMapRealVector39.walkInOptimizedOrder(realVectorPreservingVisitor40, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertNotNull(openMapRealVector39);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        int int12 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector15.append(openMapRealVector20);
        org.apache.commons.math3.linear.RealVector realVector24 = openMapRealVector20.mapSubtract(1.0d);
        double double25 = openMapRealVector20.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector28);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double34 = openMapRealVector33.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector28.append(openMapRealVector33);
        int int36 = openMapRealVector35.getMinIndex();
        int int37 = openMapRealVector35.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector40.append(openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector50.append(openMapRealVector55);
        org.apache.commons.math3.linear.RealVector realVector58 = openMapRealVector40.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector35.append((org.apache.commons.math3.linear.RealVector) openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector20.append(openMapRealVector40);
        int int61 = openMapRealVector60.getMinIndex();
        org.apache.commons.math3.linear.RealVector realVector63 = openMapRealVector60.mapMultiplyToSelf((double) 'a');
        double double64 = openMapRealVector60.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector60);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, 0);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double71 = openMapRealVector9.walkInDefaultOrder(realVectorPreservingVisitor68, (int) (byte) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19 + "'", int36 == 19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector57);
        org.junit.Assert.assertNotNull(realVector58);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertNotNull(openMapRealVector60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 19 + "'", int61 == 19);
        org.junit.Assert.assertNotNull(realVector63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector65);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.RealVector realVector6 = openMapRealVector2.mapMultiply((double) 10L);
        openMapRealVector2.setEntry((int) (byte) 1, Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        double double14 = openMapRealVector13.getLInfNorm();
        boolean boolean15 = openMapRealVector13.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector13.mapAdd((double) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector13.mapDivide(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = openMapRealVector2.cosine(realVector19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero norm");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(realVector19);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        openMapRealVector6.setEntry(1, (double) (short) 0);
        boolean boolean12 = openMapRealVector6.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector6.append((double) (byte) 0);
        double double16 = openMapRealVector6.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(109);
        double[] doubleArray19 = openMapRealVector18.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector6.add((org.apache.commons.math3.linear.RealVector) openMapRealVector18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 110 != 109");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 1, 0, 1.0E-12d);
        int int4 = openMapRealVector3.getMaxIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        double double7 = openMapRealVector6.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAddToSelf(0.09090909090909091d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector13 = openMapRealVector6.add((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 11 != 100");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09090909090909091d + "'", double7 == 0.09090909090909091d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector2.mapAddToSelf(1.0d);
        double double6 = openMapRealVector5.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector5.mapAddToSelf((double) 34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double12 = openMapRealVector11.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector11.append(openMapRealVector16);
        double double19 = openMapRealVector16.getL1Norm();
        double double20 = openMapRealVector16.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector16.append(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector16.append(20.0d);
        org.apache.commons.math3.linear.RealVector realVector30 = openMapRealVector28.mapDivideToSelf(0.09090909090909091d);
        org.apache.commons.math3.linear.RealVector realVector31 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector8.add(openMapRealVector28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 11");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(openMapRealVector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertNotNull(openMapRealVector28);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(realVector31);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.23537557657892524d);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray19, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector12.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector23);
        double double25 = openMapRealVector23.getMinValue();
        boolean boolean27 = openMapRealVector23.isDefaultValue(0.3333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.mapAddToSelf((double) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(32, 19);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector14.mapSubtract((double) 54);
        boolean boolean17 = openMapRealVector11.equals((java.lang.Object) openMapRealVector14);
        double[] doubleArray23 = new double[] { 29, 100, (byte) 10, (byte) -1, 10.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector11.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 5");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector11);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 29.0d, 100.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector59.append(openMapRealVector64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector69);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector69.append(openMapRealVector74);
        org.apache.commons.math3.linear.RealVector realVector77 = openMapRealVector59.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector69);
        org.apache.commons.math3.linear.RealVector realVector79 = openMapRealVector59.mapDivide((double) 20);
        org.apache.commons.math3.linear.RealVector realVector80 = openMapRealVector35.add((org.apache.commons.math3.linear.RealVector) openMapRealVector59);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor81 = realVector80.iterator();
        int int82 = realVector80.getMaxIndex();
        org.apache.commons.math3.linear.RealVector realVector84 = realVector80.mapSubtractToSelf((double) (byte) 10);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor85 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = realVector80.walkInDefaultOrder(realVectorChangingVisitor85, 0, 30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (30)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector52);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector76);
        org.junit.Assert.assertNotNull(realVector77);
        org.junit.Assert.assertNotNull(realVector79);
        org.junit.Assert.assertNotNull(realVector80);
        org.junit.Assert.assertNotNull(entryItor81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 9 + "'", int82 == 9);
        org.junit.Assert.assertNotNull(realVector84);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.apache.commons.math3.linear.RealVector realVector23 = openMapRealVector21.mapDivide(20.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector21, (int) (short) 10);
        org.apache.commons.math3.linear.RealVector realVector27 = openMapRealVector25.mapDivide(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(realVector27);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = openMapRealVector24.walkInOptimizedOrder(realVectorChangingVisitor25, (int) (short) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector9.mapAddToSelf(1.0d);
        java.lang.Double[] doubleArray25 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray25, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray25, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray32, (double) 109);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector35.mapMultiplyToSelf((double) 10L);
        double double38 = openMapRealVector30.getL1Distance(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector41);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector41, 100);
        org.apache.commons.math3.linear.RealVector realVector46 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(100, (int) (byte) 1, (double) (-1.0f));
        double[] doubleArray58 = new double[] { (byte) 1, 1.0E-12d, 29, Double.POSITIVE_INFINITY, 1.0d, 10 };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray58);
        double double60 = openMapRealVector51.getDistance(openMapRealVector59);
        openMapRealVector45.setSubVector(5, (org.apache.commons.math3.linear.RealVector) openMapRealVector59);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector30.append(openMapRealVector45);
        org.apache.commons.math3.linear.RealVector realVector64 = openMapRealVector62.mapSubtract((double) 1);
        boolean boolean65 = openMapRealVector9.equals((java.lang.Object) realVector64);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector67 = realVector64.mapToSelf(univariateFunction66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(realVector46);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0E-12d, 29.0d, Double.POSITIVE_INFINITY, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + Double.POSITIVE_INFINITY + "'", double60 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector2.mapSubtract((double) (-1));
        org.apache.commons.math3.linear.RealVector realVector10 = realVector8.mapSubtractToSelf((double) 19);
        org.apache.commons.math3.linear.RealVector realVector12 = realVector8.mapSubtract((double) 10L);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = realVector12.walkInDefaultOrder(realVectorChangingVisitor13, 3, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector12);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        org.apache.commons.math3.linear.RealVector realVector27 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector26);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double29 = realVector27.walkInDefaultOrder(realVectorChangingVisitor28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertNotNull(realVector27);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(19, (double) (short) 10);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(20, 99, 0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.mapAdd((double) '#');
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = openMapRealVector5.walkInDefaultOrder(realVectorChangingVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openMapRealVector5);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector13.mapDivideToSelf((double) (byte) 0);
        org.apache.commons.math3.linear.RealVector realVector18 = openMapRealVector13.mapMultiplyToSelf((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector13.mapDivide((double) (short) 100);
        double[] doubleArray21 = openMapRealVector13.toArray();
        openMapRealVector13.unitize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        org.apache.commons.math3.linear.RealVector realVector47 = openMapRealVector27.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector27.mapAdd((double) 'a');
        org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector49.mapSubtractToSelf((double) '#');
        double[] doubleArray52 = openMapRealVector49.toArray();
        double double53 = openMapRealVector18.getL1Distance((org.apache.commons.math3.linear.RealVector) openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector51);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 62.0d, 62.0d, 62.0d, 62.0d, 62.0d, 62.0d, 62.0d, 62.0d, 62.0d, 62.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 620.0d + "'", double53 == 620.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        double double25 = openMapRealVector24.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector28.mapAddToSelf(1.0d);
        int int32 = openMapRealVector28.getDimension();
        openMapRealVector28.setEntry(0, 970.0d);
        org.apache.commons.math3.linear.RealVector realVector36 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector28);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector24.projection(realVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        double double42 = openMapRealVector41.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector45.append(openMapRealVector50);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor53 = openMapRealVector52.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector52.append((double) 100);
        org.apache.commons.math3.linear.RealVector realVector57 = openMapRealVector55.mapSubtractToSelf((double) (short) 100);
        boolean boolean58 = openMapRealVector41.equals((java.lang.Object) openMapRealVector55);
        boolean boolean59 = openMapRealVector55.isNaN();
        org.apache.commons.math3.linear.RealVector realVector61 = openMapRealVector55.mapSubtract(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector24.append(realVector61);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 306.7409330363328d + "'", double25 == 306.7409330363328d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(realVector36);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector52);
        org.junit.Assert.assertNotNull(entryItor53);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realVector61);
        org.junit.Assert.assertNotNull(openMapRealVector62);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) '4', 10, 10.488088481701515d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        int int7 = openMapRealVector6.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector10.append(openMapRealVector15);
        int int18 = openMapRealVector17.getMinIndex();
        int int19 = openMapRealVector17.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector22.append(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector32.append(openMapRealVector37);
        org.apache.commons.math3.linear.RealVector realVector40 = openMapRealVector22.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector17.append((org.apache.commons.math3.linear.RealVector) openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector44.append(openMapRealVector49);
        int int52 = openMapRealVector51.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector51, (int) (byte) 0);
        double double55 = openMapRealVector51.getMinValue();
        double double56 = openMapRealVector17.getL1Distance(openMapRealVector51);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector51.mapAdd((double) (byte) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector6.append((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector59.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double64 = openMapRealVector63.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double69 = openMapRealVector68.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector63.append(openMapRealVector68);
        int int71 = openMapRealVector70.getMinIndex();
        int int72 = openMapRealVector70.getDimension();
        double double73 = openMapRealVector70.getNorm();
        org.apache.commons.math3.linear.RealVector realVector75 = openMapRealVector70.mapSubtractToSelf((double) '#');
        boolean boolean76 = openMapRealVector59.equals((java.lang.Object) openMapRealVector70);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector70);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertNotNull(realVector40);
        org.junit.Assert.assertNotNull(openMapRealVector41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 19 + "'", int52 == 19);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector58);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertNotNull(entryItor60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 19 + "'", int71 == 19);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20 + "'", int72 == 20);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(realVector75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector7.getL1Norm();
        double double11 = openMapRealVector7.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector7.append(openMapRealVector15);
        openMapRealVector15.unitize();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator18 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry19 = openMapRealVector15.new OpenMapEntry(iterator18);
        double double20 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector15.mapDivideToSelf((double) 10L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25, 100);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector29.mapDivideToSelf((double) 10.0f);
        double double32 = openMapRealVector29.getSparsity();
        boolean boolean33 = openMapRealVector29.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = openMapRealVector15.getLInfDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 20 != 110");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48, 1000.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector3, (int) (short) 0);
        openMapRealVector3.set((double) (short) 0);
        boolean boolean9 = openMapRealVector3.equals((java.lang.Object) 1100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector3.copy();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(openMapRealVector10);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.append((double) (short) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector26.append((double) 'a');
        double double31 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor32 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double33 = openMapRealVector26.walkInOptimizedOrder(realVectorPreservingVisitor32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertNotNull(openMapRealVector28);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector7.getL1Norm();
        double double11 = openMapRealVector7.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        double double16 = openMapRealVector7.getDistance(openMapRealVector14);
        boolean boolean17 = openMapRealVector7.isInfinite();
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
        org.apache.commons.math3.linear.RealVector realVector52 = openMapRealVector32.mapDivide((double) 20);
        double double53 = openMapRealVector27.getL1Distance(openMapRealVector32);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator54 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry55 = openMapRealVector27.new OpenMapEntry(iterator54);
        openMapRealVector27.addToEntry((int) (short) 10, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector(110);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector60.mapAddToSelf(109.0d);
        org.apache.commons.math3.linear.RealMatrix realMatrix63 = openMapRealVector27.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector65 = openMapRealVector7.add((org.apache.commons.math3.linear.RealVector) openMapRealVector64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 110");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertNotNull(realMatrix63);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.mapAddToSelf((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector33.mapDivideToSelf(551.5623264872248d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertNotNull(realVector37);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        org.apache.commons.math3.linear.RealVector realVector80 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        double double81 = openMapRealVector65.getSparsity();
        double double82 = openMapRealVector65.getLInfNorm();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(realVector73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertNotNull(realVector79);
        org.junit.Assert.assertNotNull(realVector80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapMultiplyToSelf((double) 100L);
        java.lang.Class<?> wildcardClass9 = openMapRealVector6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(99);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math3.linear.RealVector realVector4 = openMapRealVector1.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector3);
        boolean boolean5 = openMapRealVector3.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double9 = openMapRealVector8.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector8);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector8.append(openMapRealVector13);
        double double16 = openMapRealVector15.getLInfNorm();
        double double18 = openMapRealVector15.getEntry((int) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector15.mapAdd((double) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector3.append(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24, 100);
        double double29 = openMapRealVector28.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector28.mapSubtract((double) 1.0f);
        openMapRealVector28.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector28.getSubVector(1, 29);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector28.mapMultiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector28.mapAdd(10.0d);
        int int40 = openMapRealVector28.getDimension();
        double double41 = openMapRealVector21.getDistance(openMapRealVector28);
        org.apache.commons.math3.linear.RealVector realVector43 = openMapRealVector28.mapDivide(1100.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 110 + "'", int40 == 110);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(realVector43);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector((int) ' ', (double) (short) -1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector1.append((org.apache.commons.math3.linear.RealVector) openMapRealVector4);
        org.junit.Assert.assertNotNull(openMapRealVector5);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        java.lang.Double[] doubleArray24 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        openMapRealVector17.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        double double32 = openMapRealVector17.getL1Norm();
        boolean boolean33 = openMapRealVector17.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector17.mapAdd((double) (short) 10);
        boolean boolean37 = openMapRealVector17.isDefaultValue((double) (byte) 0);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray38);
        double double41 = openMapRealVector17.getDistance(openMapRealVector40);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42);
        boolean boolean48 = openMapRealVector17.equals((java.lang.Object) doubleArray42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42, 19.0d);
        double double51 = openMapRealVector50.getMinValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        int int5 = openMapRealVector4.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double9 = openMapRealVector8.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector8);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector8.append(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector8.mapAddToSelf((double) 100L);
        boolean boolean18 = openMapRealVector4.equals((java.lang.Object) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector4.append((double) 0);
        double double21 = openMapRealVector4.getSparsity();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector12);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector12.mapMultiply((double) ' ');
        double double17 = openMapRealVector12.getNorm();
        double double18 = openMapRealVector9.dotProduct(openMapRealVector12);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = openMapRealVector12.walkInDefaultOrder(realVectorPreservingVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.mapAddToSelf((double) 100L);
        openMapRealVector11.addToEntry(0, (double) (short) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor25 = openMapRealVector24.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector24.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30, 100);
        double double35 = openMapRealVector34.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double39 = openMapRealVector38.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double44 = openMapRealVector43.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector38.append(openMapRealVector43);
        int int46 = openMapRealVector45.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector45, (int) (byte) 0);
        double double49 = openMapRealVector45.getMinValue();
        boolean boolean50 = openMapRealVector34.equals((java.lang.Object) openMapRealVector45);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector24.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector45);
        double double52 = openMapRealVector11.getL1Distance(openMapRealVector45);
        double double53 = openMapRealVector45.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double57 = openMapRealVector56.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector56);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector56.append(openMapRealVector61);
        int int64 = openMapRealVector63.getMinIndex();
        int int65 = openMapRealVector63.getDimension();
        double double66 = openMapRealVector63.getNorm();
        org.apache.commons.math3.linear.RealVector realVector68 = openMapRealVector63.mapSubtractToSelf((double) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector63.unitVector();
        org.apache.commons.math3.linear.RealVector realVector70 = openMapRealVector45.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector70);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(entryItor25);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 19 + "'", int46 == 19);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1100.0d + "'", double52 == 1100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 19 + "'", int64 == 19);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20 + "'", int65 == 20);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertNotNull(realVector70);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        java.lang.Double[] doubleArray24 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        openMapRealVector17.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        double double32 = openMapRealVector17.getL1Norm();
        boolean boolean33 = openMapRealVector17.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector17.mapAdd((double) (short) 10);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector17.mapDivideToSelf(3067.409330363328d);
        org.apache.commons.math3.linear.RealVector realVector39 = openMapRealVector17.mapDivideToSelf(1.0E-12d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector42.append(openMapRealVector47);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor50 = openMapRealVector49.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector53, 100);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector60 = openMapRealVector57.mapSubtract((double) 1.0f);
        openMapRealVector57.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector49.append(openMapRealVector57);
        java.lang.Double[] doubleArray64 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray64, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray64, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector69);
        openMapRealVector57.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector69);
        double double72 = openMapRealVector57.getL1Norm();
        boolean boolean73 = openMapRealVector57.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector57.mapAdd((double) (short) 10);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator76 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry77 = openMapRealVector57.new OpenMapEntry(iterator76);
        org.apache.commons.math3.linear.RealVector realVector78 = openMapRealVector17.add((org.apache.commons.math3.linear.RealVector) openMapRealVector57);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(entryItor50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(openMapRealVector75);
        org.junit.Assert.assertNotNull(realVector78);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        double double15 = openMapRealVector10.getMaxValue();
        boolean boolean16 = openMapRealVector10.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        openMapRealVector10.set(4.47213595499958d);
        double[] doubleArray20 = openMapRealVector10.toArray();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d, 4.47213595499958d }, 1.0E-15);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, 9);
        double double12 = openMapRealVector11.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.13333333333333333d + "'", double12 == 0.13333333333333333d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector12.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.mapAdd((double) 29);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor16 = openMapRealVector15.sparseIterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(entryItor16);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector9 = openMapRealVector6.mapSubtract((double) 1.0f);
        openMapRealVector6.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.getSubVector(1, 29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector13.unitVector();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero norm");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(openMapRealVector13);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(29, (int) ' ');
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator3 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry4 = openMapRealVector2.new OpenMapEntry(iterator3);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector53);
        int int56 = openMapRealVector55.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.append(openMapRealVector66);
        int int69 = openMapRealVector68.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector68, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector58.add(openMapRealVector68);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator73 = openMapRealVector68.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector2.append(openMapRealVector68);
        int int75 = openMapRealVector68.getMaxIndex();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator76 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry77 = openMapRealVector68.new OpenMapEntry(iterator76);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = openMapEntry77.getIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 19 + "'", int56 == 19);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 19 + "'", int69 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 19 + "'", int75 == 19);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(140, 20);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 140);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(100, 306.7409330363328d);
        org.apache.commons.math3.linear.RealVector realVector4 = openMapRealVector2.mapSubtract((-52.0d));
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = realVector4.walkInDefaultOrder(realVectorPreservingVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector4);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (short) -1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = openMapRealVector15.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector18);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor20 = openMapRealVector15.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector15.mapSubtractToSelf(1.0E-12d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(entryItor20);
        org.junit.Assert.assertNotNull(realVector22);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) 100, (double) 27);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector14.mapSubtract(0.13333333333333333d);
        org.apache.commons.math3.linear.RealVector realVector18 = realVector16.mapSubtract(10.488088481701515d);
        java.lang.Class<?> wildcardClass19 = realVector16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector9.copy();
        openMapRealVector9.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector9.unitVector();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(openMapRealVector36);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 110);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 11);
        openMapRealVector5.set(100.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        java.lang.Double[] doubleArray24 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        openMapRealVector17.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        double double32 = openMapRealVector17.getL1Norm();
        boolean boolean33 = openMapRealVector17.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector17.mapAdd((double) (short) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector35.append((double) 5);
        double double38 = openMapRealVector35.getNorm();
        openMapRealVector35.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator40 = openMapRealVector35.new OpenMapSparseIterator();
        // The following exception was thrown during execution in test generation
        try {
            openMapSparseIterator40.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(openMapRealVector35);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 104.88088481701516d + "'", double38 == 104.88088481701516d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 109);
        boolean boolean11 = openMapRealVector10.isInfinite();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        openMapRealVector6.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector10.append(openMapRealVector15);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor18 = openMapRealVector17.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector17.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector23, 100);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector36);
        int int39 = openMapRealVector38.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector38, (int) (byte) 0);
        double double42 = openMapRealVector38.getMinValue();
        boolean boolean43 = openMapRealVector27.equals((java.lang.Object) openMapRealVector38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector17.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector38);
        openMapRealVector44.set((double) (byte) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector6.append((org.apache.commons.math3.linear.RealVector) openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector55.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector50.append(openMapRealVector55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double61 = openMapRealVector60.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector60);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double66 = openMapRealVector65.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector60.append(openMapRealVector65);
        org.apache.commons.math3.linear.RealVector realVector68 = openMapRealVector50.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector60);
        org.apache.commons.math3.linear.RealVector realVector70 = openMapRealVector50.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector50.mapAdd((double) 'a');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector72.mapAdd((double) (short) 10);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor75 = openMapRealVector72.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector44.append((org.apache.commons.math3.linear.RealVector) openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector77 = openMapRealVector76.unitVector();
        java.lang.Double[] doubleArray84 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray84);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray84, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector87, 9);
        org.apache.commons.math3.linear.RealVector realVector91 = openMapRealVector89.mapMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector92 = openMapRealVector77.ebeDivide(realVector91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 30 != 15");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(entryItor18);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19 + "'", int39 == 19);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector57);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector67);
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(realVector70);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertNotNull(entryItor75);
        org.junit.Assert.assertNotNull(openMapRealVector76);
        org.junit.Assert.assertNotNull(openMapRealVector77);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(realVector91);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector4 = openMapRealVector2.mapSubtractToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) (short) 10);
        double double7 = openMapRealVector2.getSparsity();
        int int8 = openMapRealVector2.getDimension();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector4);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        int int21 = openMapRealVector20.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.append(openMapRealVector31);
        int int34 = openMapRealVector33.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector33, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector23.add(openMapRealVector33);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector40.append(openMapRealVector45);
        int int48 = openMapRealVector47.getMinIndex();
        int int49 = openMapRealVector47.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double63 = openMapRealVector62.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double68 = openMapRealVector67.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector62.append(openMapRealVector67);
        org.apache.commons.math3.linear.RealVector realVector70 = openMapRealVector52.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector47.append((org.apache.commons.math3.linear.RealVector) openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double80 = openMapRealVector79.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.append(openMapRealVector79);
        int int82 = openMapRealVector81.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector81, (int) (byte) 0);
        double double85 = openMapRealVector81.getMinValue();
        double double86 = openMapRealVector47.getL1Distance(openMapRealVector81);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector47.copy();
        double double88 = openMapRealVector33.getL1Distance(openMapRealVector87);
        double double89 = openMapRealVector7.getDistance(openMapRealVector33);
        org.apache.commons.math3.linear.RealVector realVector91 = openMapRealVector7.mapDivide(22.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 19 + "'", int34 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 19 + "'", int48 == 19);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector69);
        org.junit.Assert.assertNotNull(realVector70);
        org.junit.Assert.assertNotNull(openMapRealVector71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 19 + "'", int82 == 19);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(realVector91);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector22.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector22.unitVector();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray48, (double) '4');
        int int52 = openMapRealVector51.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector(34, (double) (short) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55, (int) (short) 0);
        double double58 = openMapRealVector51.getL1Distance(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(1, 11, 0.9999999999999999d);
        double[] doubleArray4 = openMapRealVector3.toArray();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = openMapRealVector22.walkInOptimizedOrder(realVectorChangingVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(openMapRealVector22);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(19, (int) (short) 10, (double) 100.0f);
        openMapRealVector3.addToEntry(5, (double) 0.0f);
        double double7 = openMapRealVector3.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector9 = openMapRealVector3.mapSubtractToSelf((-1.0d));
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = realVector9.walkInOptimizedOrder(realVectorChangingVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(realVector9);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.append((double) (short) 100);
        double double29 = openMapRealVector28.getNorm();
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray36, (double) (-1.0f));
        boolean boolean41 = openMapRealVector39.isDefaultValue((double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector28.append((org.apache.commons.math3.linear.RealVector) openMapRealVector39);
        org.apache.commons.math3.linear.RealVector realVector44 = openMapRealVector28.mapSubtractToSelf((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertNotNull(openMapRealVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector44);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(29, (int) (short) 100, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector3, 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector5.copy();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator7 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry8 = openMapRealVector6.new OpenMapEntry(iterator7);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator9 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry10 = openMapRealVector6.new OpenMapEntry(iterator9);
        openMapEntry10.setIndex(1);
        org.junit.Assert.assertNotNull(openMapRealVector6);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector10.append(openMapRealVector15);
        int int18 = openMapRealVector17.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17, (int) (byte) 0);
        double double21 = openMapRealVector17.getMinValue();
        boolean boolean22 = openMapRealVector6.equals((java.lang.Object) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator23 = openMapRealVector6.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        int int35 = openMapRealVector34.getMinIndex();
        int int36 = openMapRealVector34.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.append(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double55 = openMapRealVector54.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector49.append(openMapRealVector54);
        org.apache.commons.math3.linear.RealVector realVector57 = openMapRealVector39.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector34.append((org.apache.commons.math3.linear.RealVector) openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.append(openMapRealVector66);
        int int69 = openMapRealVector68.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector68, (int) (byte) 0);
        double double72 = openMapRealVector68.getMinValue();
        double double73 = openMapRealVector34.getL1Distance(openMapRealVector68);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector34.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector34.mapAddToSelf((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector77 = openMapRealVector24.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 110 != 20");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertNotNull(openMapRealVector58);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 19 + "'", int69 == 19);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertNotNull(openMapRealVector76);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double52 = openMapRealVector51.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double56 = openMapRealVector51.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector55);
        double[] doubleArray57 = openMapRealVector51.toArray();
        double double58 = openMapRealVector51.getSparsity();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor59 = openMapRealVector51.iterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector7.append(openMapRealVector51);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double64 = openMapRealVector63.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector63, 100);
        org.apache.commons.math3.linear.RealVector realVector69 = openMapRealVector67.mapDivideToSelf((double) 10.0f);
        openMapRealVector67.setEntry(1, (double) (short) 0);
        boolean boolean73 = openMapRealVector67.isInfinite();
        java.lang.Double[] doubleArray74 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray74, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector78 = openMapRealVector76.mapSubtractToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector67.append(realVector78);
        double double80 = realVector78.getL1Norm();
        org.apache.commons.math3.linear.RealVector realVector82 = realVector78.mapDivide((double) 108);
        org.apache.commons.math3.linear.RealVector realVector84 = realVector78.mapMultiplyToSelf((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector7.ebeMultiply(realVector84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(entryItor59);
        org.junit.Assert.assertNotNull(openMapRealVector60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(realVector69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector78);
        org.junit.Assert.assertNotNull(openMapRealVector79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(realVector84);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        double double7 = openMapRealVector5.getMinValue();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor8 = openMapRealVector5.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double12 = openMapRealVector11.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector11.append(openMapRealVector16);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = openMapRealVector5.dotProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 10");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(entryItor8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector((int) '#');
        int int2 = openMapRealVector1.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5, 100);
        org.apache.commons.math3.linear.RealVector realVector10 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector5);
        double double11 = openMapRealVector1.getL1Distance(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        int int22 = openMapRealVector21.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector21, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double28 = openMapRealVector27.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector27.append(openMapRealVector32);
        int int35 = openMapRealVector34.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector34, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector24.add(openMapRealVector34);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator39 = openMapRealVector34.new OpenMapSparseIterator();
        boolean boolean40 = openMapRealVector34.isNaN();
        double double41 = openMapRealVector5.getDistance(openMapRealVector34);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator42 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry43 = openMapRealVector34.new OpenMapEntry(iterator42);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector34.mapDivideToSelf((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(realVector45);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(110, (double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        int int13 = openMapRealVector12.getMinIndex();
        int int14 = openMapRealVector12.getDimension();
        double double15 = openMapRealVector12.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector12.append((double) 100L);
        double[] doubleArray24 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        double double26 = openMapRealVector12.getL1Distance(openMapRealVector25);
        openMapRealVector25.set((double) ' ');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25, 28);
        org.apache.commons.math3.linear.RealMatrix realMatrix31 = openMapRealVector2.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector2.getSubVector((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = openMapRealVector34.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 56.0d + "'", double26 == 56.0d);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        double double15 = openMapRealVector10.getMaxValue();
        boolean boolean16 = openMapRealVector10.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10, 100);
        org.apache.commons.math3.linear.RealVector realVector20 = openMapRealVector10.mapDivideToSelf(0.9999999999999998d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator22 = openMapRealVector10.new OpenMapSparseIterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realVector20);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.mapAddToSelf((double) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(32, 19);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector26.mapSubtract((double) 54);
        boolean boolean29 = openMapRealVector23.equals((java.lang.Object) openMapRealVector26);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor30 = openMapRealVector23.sparseIterator();
        double double31 = openMapRealVector9.getL1Distance(openMapRealVector23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertNotNull(openMapRealVector23);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(entryItor30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1000.0d + "'", double31 == 1000.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector3.copy();
        org.apache.commons.math3.linear.RealVector realVector6 = openMapRealVector3.mapMultiplyToSelf((double) 10.0f);
        double double7 = realVector6.getMaxValue();
        java.lang.Double[] doubleArray8 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray8, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray8);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray8, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        int int15 = openMapRealVector14.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector18.append(openMapRealVector23);
        int int26 = openMapRealVector25.getMinIndex();
        int int27 = openMapRealVector25.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector30.append(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector40.append(openMapRealVector45);
        org.apache.commons.math3.linear.RealVector realVector48 = openMapRealVector30.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector25.append((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        int int60 = openMapRealVector59.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, (int) (byte) 0);
        double double63 = openMapRealVector59.getMinValue();
        double double64 = openMapRealVector25.getL1Distance(openMapRealVector59);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector59.mapAdd((double) (byte) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector14.append((org.apache.commons.math3.linear.RealVector) openMapRealVector66);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor68 = openMapRealVector67.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double72 = openMapRealVector71.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector71);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double77 = openMapRealVector76.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = openMapRealVector71.append(openMapRealVector76);
        int int79 = openMapRealVector78.getMinIndex();
        int int80 = openMapRealVector78.getDimension();
        double double81 = openMapRealVector78.getNorm();
        org.apache.commons.math3.linear.RealVector realVector83 = openMapRealVector78.mapSubtractToSelf((double) '#');
        boolean boolean84 = openMapRealVector67.equals((java.lang.Object) openMapRealVector78);
        boolean boolean86 = openMapRealVector67.isDefaultValue((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = realVector6.cosine((org.apache.commons.math3.linear.RealVector) openMapRealVector67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero norm");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector4);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector66);
        org.junit.Assert.assertNotNull(openMapRealVector67);
        org.junit.Assert.assertNotNull(entryItor68);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 19 + "'", int79 == 19);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 20 + "'", int80 == 20);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(realVector83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(6, 0, 313.06548835666956d);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator4 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry5 = openMapRealVector3.new OpenMapEntry(iterator4);
        double double6 = openMapRealVector3.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, 100);
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector13.mapDivideToSelf((double) 10.0f);
        openMapRealVector13.setEntry(1, (double) (short) 0);
        boolean boolean19 = openMapRealVector13.isInfinite();
        java.lang.Double[] doubleArray20 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray20, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector24 = openMapRealVector22.mapSubtractToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector13.append(realVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector3.append(realVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector29.mapAddToSelf(1.0d);
        double double33 = openMapRealVector32.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector32.mapAddToSelf((double) 34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector3.add(openMapRealVector37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 10");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(openMapRealVector35);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        int int44 = openMapRealVector43.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43, (int) (byte) 0);
        double double47 = openMapRealVector43.getMinValue();
        double double48 = openMapRealVector9.getL1Distance(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        int int60 = openMapRealVector59.getMinIndex();
        int int61 = openMapRealVector59.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector64.append(openMapRealVector69);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double80 = openMapRealVector79.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.append(openMapRealVector79);
        org.apache.commons.math3.linear.RealVector realVector82 = openMapRealVector64.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector74);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector64.mapDivide((double) 20);
        double double85 = openMapRealVector59.getL1Distance(openMapRealVector64);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator86 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry87 = openMapRealVector59.new OpenMapEntry(iterator86);
        double double88 = openMapRealVector49.getL1Distance(openMapRealVector59);
        double[] doubleArray89 = openMapRealVector59.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, (int) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector93 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector95 = openMapRealVector59.append((double) (short) 10);
        int int96 = openMapRealVector59.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector97 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 20 + "'", int96 == 20);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) 1L);
        double double7 = openMapRealVector6.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.mapAddToSelf(0.09090909090909091d);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.iterator();
        boolean boolean11 = openMapRealVector9.isNaN();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09090909090909091d + "'", double7 == 0.09090909090909091d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector14.mapDivide((double) 20);
        double double35 = openMapRealVector9.getL1Distance(openMapRealVector14);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator36 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry37 = openMapRealVector9.new OpenMapEntry(iterator36);
        openMapRealVector9.addToEntry((int) (short) 10, Double.POSITIVE_INFINITY);
        boolean boolean42 = openMapRealVector9.isDefaultValue(10.0d);
        org.apache.commons.math3.linear.RealVector realVector44 = openMapRealVector9.mapDivideToSelf(0.05d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realVector44);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.RealVector realVector11 = openMapRealVector7.mapSubtract(1.0d);
        double double12 = openMapRealVector7.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator13 = openMapRealVector7.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector7);
        openMapRealVector14.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(0, (double) 34);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator19 = openMapRealVector18.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector22, 100);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector29 = openMapRealVector26.mapSubtract((double) 1.0f);
        boolean boolean31 = openMapRealVector26.isDefaultValue(Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector18.append(openMapRealVector26);
        boolean boolean34 = openMapRealVector18.isDefaultValue((double) 0L);
        boolean boolean35 = openMapRealVector18.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector18.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector36.append(168008.9283341811d);
        org.apache.commons.math3.linear.RealMatrix realMatrix39 = openMapRealVector14.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector38);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertNotNull(realMatrix39);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        double[] doubleArray9 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, (double) 'a');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9, 873.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        openMapEntry30.setIndex(1);
        openMapEntry30.setIndex(141);
        java.lang.Class<?> wildcardClass35 = openMapEntry30.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(110, (double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        int int13 = openMapRealVector12.getMinIndex();
        int int14 = openMapRealVector12.getDimension();
        double double15 = openMapRealVector12.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector12.append((double) 100L);
        double[] doubleArray24 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray24);
        double double26 = openMapRealVector12.getL1Distance(openMapRealVector25);
        openMapRealVector25.set((double) ' ');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25, 28);
        org.apache.commons.math3.linear.RealMatrix realMatrix31 = openMapRealVector2.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector2.mapAddToSelf(547.7225575051662d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 56.0d + "'", double26 == 56.0d);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(openMapRealVector33);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        int int44 = openMapRealVector43.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43, (int) (byte) 0);
        double double47 = openMapRealVector43.getMinValue();
        double double48 = openMapRealVector9.getL1Distance(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        int int60 = openMapRealVector59.getMinIndex();
        int int61 = openMapRealVector59.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double65 = openMapRealVector64.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector64);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double70 = openMapRealVector69.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector64.append(openMapRealVector69);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double80 = openMapRealVector79.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.append(openMapRealVector79);
        org.apache.commons.math3.linear.RealVector realVector82 = openMapRealVector64.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector74);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector64.mapDivide((double) 20);
        double double85 = openMapRealVector59.getL1Distance(openMapRealVector64);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator86 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry87 = openMapRealVector59.new OpenMapEntry(iterator86);
        double double88 = openMapRealVector49.getL1Distance(openMapRealVector59);
        double[] doubleArray89 = openMapRealVector59.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, (int) '#');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector92 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector91);
        org.apache.commons.math3.linear.RealVector realVector94 = openMapRealVector91.mapSubtract((-1.0E-12d));
        org.apache.commons.math3.linear.RealVector realVector96 = realVector94.mapMultiply((double) 6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 19 + "'", int60 == 19);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector81);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(realVector84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector94);
        org.junit.Assert.assertNotNull(realVector96);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = openMapRealVector13.walkInOptimizedOrder(realVectorChangingVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector53);
        int int56 = openMapRealVector55.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector61.append(openMapRealVector66);
        int int69 = openMapRealVector68.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector68, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector58.add(openMapRealVector68);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator73 = openMapRealVector68.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector2.append(openMapRealVector68);
        int int75 = openMapRealVector68.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector68);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealVector76.addToEntry(110, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (110)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 19 + "'", int56 == 19);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 19 + "'", int69 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector72);
        org.junit.Assert.assertNotNull(openMapRealVector74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 19 + "'", int75 == 19);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector4);
        org.apache.commons.math3.linear.RealVector realVector7 = openMapRealVector4.mapDivideToSelf((-0.9999904429912063d));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double16 = openMapRealVector15.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector10.append(openMapRealVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double21 = openMapRealVector20.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector25.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector20.append(openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector10.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector20);
        org.apache.commons.math3.linear.RealVector realVector30 = openMapRealVector10.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector10.mapAdd((double) 'a');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator37 = openMapRealVector35.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.RealVector realVector38 = openMapRealVector10.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        double double39 = openMapRealVector10.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10, 29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector4.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 39");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(realVector38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 3.1622776601683795d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator13 = openMapRealVector12.new OpenMapSparseIterator();
        openMapRealVector12.set(122.0d);
        int int16 = openMapRealVector12.getMinIndex();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector4 = openMapRealVector2.mapSubtractToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append((double) (short) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(realVector4);
        org.junit.Assert.assertNotNull(openMapRealVector6);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 168008.9283341811d);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray12, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector15, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector18 = openMapRealVector11.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        double double15 = openMapRealVector10.getMaxValue();
        boolean boolean16 = openMapRealVector10.isInfinite();
        int int17 = openMapRealVector10.getMaxIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector10.getSubVector((int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector3, (int) (short) 0);
        openMapRealVector3.set((double) (short) 0);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator8 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry9 = openMapRealVector3.new OpenMapEntry(iterator8);
        openMapEntry9.setIndex(109);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = openMapEntry9.getIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.3333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.append(openMapRealVector24);
        double double27 = openMapRealVector19.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double31 = openMapRealVector30.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector30);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector30.append(openMapRealVector35);
        int int38 = openMapRealVector37.getMinIndex();
        int int39 = openMapRealVector37.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double48 = openMapRealVector47.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector42.append(openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double53 = openMapRealVector52.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double58 = openMapRealVector57.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.append(openMapRealVector57);
        org.apache.commons.math3.linear.RealVector realVector60 = openMapRealVector42.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector37.append((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector19.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        double double63 = openMapRealVector62.getLInfNorm();
        org.apache.commons.math3.linear.RealVector realVector65 = openMapRealVector62.mapMultiply((double) 10.0f);
        double double66 = openMapRealVector62.getL1Norm();
        double double67 = openMapRealVector16.getDistance(openMapRealVector62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(109);
        double double70 = openMapRealVector62.getL1Distance(openMapRealVector69);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 19 + "'", int38 == 19);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(openMapRealVector61);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(realVector65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 14.212670403551895d + "'", double67 == 14.212670403551895d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double[] doubleArray5 = new double[] { 29, 100, (byte) 10, (byte) -1, 10.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray5);
        int int7 = openMapRealVector6.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector6.append(269.6664606509308d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(6, 109, 10.0d);
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector13.mapMultiply(14.142135623730951d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector18.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector22);
        double[] doubleArray24 = openMapRealVector18.toArray();
        openMapRealVector18.set(10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector18.append((double) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector18.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        double[] doubleArray35 = openMapRealVector32.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray35, (double) (-1L));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector40);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double46 = openMapRealVector45.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector40.append(openMapRealVector45);
        double double48 = openMapRealVector40.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double52 = openMapRealVector51.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector51);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double57 = openMapRealVector56.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector51.append(openMapRealVector56);
        int int59 = openMapRealVector58.getMinIndex();
        int int60 = openMapRealVector58.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double64 = openMapRealVector63.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double69 = openMapRealVector68.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector63.append(openMapRealVector68);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double74 = openMapRealVector73.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector73);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double79 = openMapRealVector78.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector73.append(openMapRealVector78);
        org.apache.commons.math3.linear.RealVector realVector81 = openMapRealVector63.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector73);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector58.append((org.apache.commons.math3.linear.RealVector) openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector40.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector63);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator84 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry85 = openMapRealVector63.new OpenMapEntry(iterator84);
        double double86 = openMapRealVector37.getL1Distance(openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector18.subtract(openMapRealVector37);
        double double88 = openMapRealVector13.getDistance(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector9.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector13);
        boolean boolean90 = openMapRealVector89.isNaN();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 29.0d, 100.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector28);
        org.junit.Assert.assertNotNull(openMapRealVector29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 19 + "'", int59 == 19);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20 + "'", int60 == 20);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector80);
        org.junit.Assert.assertNotNull(realVector81);
        org.junit.Assert.assertNotNull(openMapRealVector82);
        org.junit.Assert.assertNotNull(openMapRealVector83);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 31.622776601683793d + "'", double88 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(openMapRealVector89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        openMapRealVector2.set(10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector2.append((double) (byte) 0);
        int int13 = openMapRealVector12.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector16.append(openMapRealVector21);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.append(openMapRealVector31);
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector16.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector26);
        org.apache.commons.math3.linear.RealVector realVector36 = openMapRealVector16.mapDivide((double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector16.mapAdd((double) 'a');
        openMapRealVector38.set(168008.9283341811d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector41 = openMapRealVector12.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 11 != 10");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertNotNull(realVector36);
        org.junit.Assert.assertNotNull(openMapRealVector38);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(39, 5);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        int int5 = openMapRealVector4.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 1, 0, 1.0E-12d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector11);
        int int13 = openMapRealVector11.getDimension();
        boolean boolean14 = openMapRealVector11.isNaN();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor15 = openMapRealVector11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector4.combine(0.6666666666666666d, 313.06548835666956d, (org.apache.commons.math3.linear.RealVector) openMapRealVector11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(entryItor15);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        openMapRealVector2.set(10.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector2.append((double) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector2.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector16);
        double[] doubleArray19 = openMapRealVector16.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray19, (double) (-1L));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector24);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.append(openMapRealVector29);
        double double32 = openMapRealVector24.getLInfNorm();
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector42.append((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector24.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator68 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry69 = openMapRealVector47.new OpenMapEntry(iterator68);
        double double70 = openMapRealVector21.getL1Distance(openMapRealVector47);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector2.subtract(openMapRealVector21);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor72 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = openMapRealVector2.walkInOptimizedOrder(realVectorPreservingVisitor72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 19 + "'", int43 == 19);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector64);
        org.junit.Assert.assertNotNull(realVector65);
        org.junit.Assert.assertNotNull(openMapRealVector66);
        org.junit.Assert.assertNotNull(openMapRealVector67);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector71);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, 22.0d);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openMapRealVector2.walkInOptimizedOrder(realVectorChangingVisitor3, 0, 39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (39)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        int int44 = openMapRealVector43.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector43, (int) (byte) 0);
        double double47 = openMapRealVector43.getMinValue();
        double double48 = openMapRealVector9.getL1Distance(openMapRealVector43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector49.mapSubtractToSelf((double) 109);
        double double53 = openMapRealVector49.getEntry((int) (short) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        org.apache.commons.math3.linear.RealVector realVector58 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector57);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (-1), Double.POSITIVE_INFINITY);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor63 = openMapRealVector62.sparseIterator();
        org.apache.commons.math3.linear.RealVector realVector64 = openMapRealVector57.add((org.apache.commons.math3.linear.RealVector) openMapRealVector62);
        boolean boolean65 = openMapRealVector49.equals((java.lang.Object) openMapRealVector62);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 19 + "'", int44 == 19);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-109.0d) + "'", double53 == (-109.0d));
        org.junit.Assert.assertNotNull(realVector58);
        org.junit.Assert.assertNotNull(entryItor63);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double14 = openMapRealVector10.getL1Distance(openMapRealVector13);
        double double15 = openMapRealVector10.getMaxValue();
        boolean boolean16 = openMapRealVector10.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector10);
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector17.mapMultiplyToSelf((double) 6);
        org.apache.commons.math3.linear.RealVector realVector21 = realVector19.mapMultiplyToSelf(9.0d);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector23 = realVector19.mapToSelf(univariateFunction22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(realVector21);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, (int) (byte) 0);
        double double13 = openMapRealVector9.getMinValue();
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector9.mapMultiply((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realVector15);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        double[] doubleArray5 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray5, (double) (-1L));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray5, 1100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        int int21 = openMapRealVector20.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector20, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector26.append(openMapRealVector31);
        int int34 = openMapRealVector33.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector33, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector23.add(openMapRealVector33);
        double double38 = openMapRealVector23.getMinValue();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealVector9.setSubVector(109, (org.apache.commons.math3.linear.RealVector) openMapRealVector23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (109)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 19 + "'", int34 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, Double.POSITIVE_INFINITY);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector18);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double24 = openMapRealVector23.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector18.append(openMapRealVector23);
        int int26 = openMapRealVector25.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector25, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double32 = openMapRealVector31.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector31);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector31.append(openMapRealVector36);
        int int39 = openMapRealVector38.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector38, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector28.add(openMapRealVector38);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.append((double) (short) 100);
        double double45 = openMapRealVector44.getNorm();
        java.lang.Double[] doubleArray52 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray52);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray52, (double) (-1.0f));
        boolean boolean57 = openMapRealVector55.isDefaultValue((double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector44.append((org.apache.commons.math3.linear.RealVector) openMapRealVector55);
        openMapRealVector58.set(873.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector61 = openMapRealVector15.add((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 27");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19 + "'", int39 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(openMapRealVector58);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.mapAdd((double) (short) 10);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor27 = openMapRealVector24.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector((int) '#');
        int int32 = openMapRealVector31.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35, 100);
        org.apache.commons.math3.linear.RealVector realVector40 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        double double41 = openMapRealVector31.getL1Distance(openMapRealVector35);
        org.apache.commons.math3.linear.RealVector realVector42 = openMapRealVector24.combine(4.47213595499958d, 110.0d, (org.apache.commons.math3.linear.RealVector) openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector24.mapAdd(306.7409330363328d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertNotNull(entryItor27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 34 + "'", int32 == 34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(realVector40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(realVector42);
        org.junit.Assert.assertNotNull(openMapRealVector44);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9, 9);
        double double12 = openMapRealVector11.getSparsity();
        boolean boolean14 = openMapRealVector11.isDefaultValue(54436.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.13333333333333333d + "'", double12 == 0.13333333333333333d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        double[] doubleArray5 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray5, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        double[] doubleArray17 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray17, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector9.append((org.apache.commons.math3.linear.RealVector) openMapRealVector20);
        org.apache.commons.math3.linear.RealVector realVector23 = openMapRealVector21.mapSubtract((double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector23);
        org.apache.commons.math3.linear.RealVector realVector26 = realVector23.mapDivide(269.6664606509308d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(realVector26);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13, 100);
        org.apache.commons.math3.linear.RealVector realVector18 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(100, (int) (byte) 1, (double) (-1.0f));
        double[] doubleArray30 = new double[] { (byte) 1, 1.0E-12d, 29, Double.POSITIVE_INFINITY, 1.0d, 10 };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray30);
        double double32 = openMapRealVector23.getDistance(openMapRealVector31);
        openMapRealVector17.setSubVector(5, (org.apache.commons.math3.linear.RealVector) openMapRealVector31);
        org.apache.commons.math3.linear.RealMatrix realMatrix34 = openMapRealVector10.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        double double35 = openMapRealVector17.getMaxValue();
        boolean boolean37 = openMapRealVector17.isDefaultValue((double) 32);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 1.0E-12d, 29.0d, Double.POSITIVE_INFINITY, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + Double.POSITIVE_INFINITY + "'", double32 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + Double.POSITIVE_INFINITY + "'", double35 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 0.13333333333333333d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector13.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector24.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 100, 0.0d);
        double double29 = openMapRealVector25.getL1Distance(openMapRealVector28);
        double double30 = openMapRealVector25.getMaxValue();
        boolean boolean31 = openMapRealVector25.isInfinite();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor32 = openMapRealVector25.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector25.mapAdd((-1.0E-12d));
        org.apache.commons.math3.linear.RealVector realVector36 = openMapRealVector34.mapDivideToSelf((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = openMapRealVector14.dotProduct(realVector36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 20");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(openMapRealVector25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(entryItor32);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(realVector36);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = openMapRealVector12.walkInDefaultOrder(realVectorPreservingVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator4 = openMapRealVector2.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        double double7 = openMapRealVector2.getEntry(3);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.mapAdd((double) 1L);
        double double10 = openMapRealVector9.getL1Norm();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 1100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double37 = openMapRealVector36.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector36);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double42 = openMapRealVector41.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.append(openMapRealVector41);
        org.apache.commons.math3.linear.RealVector realVector45 = openMapRealVector41.mapSubtract(1.0d);
        org.apache.commons.math3.linear.RealMatrix realMatrix46 = openMapRealVector33.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector41);
        double double47 = openMapRealVector41.getMaxValue();
        boolean boolean49 = openMapRealVector41.isDefaultValue((double) 'a');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector41.mapToSelf(univariateFunction50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector43);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector59, 100);
        org.apache.commons.math3.linear.RealVector realVector65 = openMapRealVector63.mapDivideToSelf((double) 10.0f);
        org.apache.commons.math3.linear.RealVector realVector67 = realVector65.mapDivide((double) (short) -1);
        int int68 = realVector65.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector65);
        org.apache.commons.math3.linear.RealVector realVector70 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector69);
        org.apache.commons.math3.linear.RealMatrix realMatrix71 = openMapRealVector56.outerProduct(realVector70);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector56.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector72);
        openMapRealVector72.unitize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector52);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(openMapRealVector54);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(realVector65);
        org.junit.Assert.assertNotNull(realVector67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 109 + "'", int68 == 109);
        org.junit.Assert.assertNotNull(realVector70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(openMapRealVector72);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.getSubVector(9, 140);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (148)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        openMapRealVector6.setEntry(1, (double) (short) 0);
        boolean boolean12 = openMapRealVector6.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector6.append((double) (byte) 0);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator16 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry17 = openMapRealVector15.new OpenMapEntry(iterator16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector15.unitVector();
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = openMapRealVector18.walkInDefaultOrder(realVectorChangingVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(openMapRealVector18);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 100);
        double double10 = openMapRealVector6.getEntry((int) (short) 0);
        double[] doubleArray17 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray17);
        double double19 = openMapRealVector6.getL1Distance(openMapRealVector18);
        boolean boolean20 = openMapRealVector6.isNaN();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector6.copy();
        openMapRealVector6.unitize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 56.0d + "'", double19 == 56.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(openMapRealVector21);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector7.getL1Norm();
        double double11 = openMapRealVector7.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector7.append(openMapRealVector15);
        org.apache.commons.math3.linear.RealVector realVector18 = openMapRealVector16.mapDivide((double) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector16.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 0, (int) 'a', (double) (byte) -1);
        org.apache.commons.math3.linear.RealVector realVector27 = openMapRealVector25.mapMultiplyToSelf((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector29 = realVector27.mapSubtractToSelf(878.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector30 = openMapRealVector16.combineToSelf(0.223606797749979d, (double) 110, realVector29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 30 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector16);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector29);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.mapAddToSelf((double) 100L);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator36 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry37 = openMapRealVector33.new OpenMapEntry(iterator36);
        openMapEntry37.setIndex(99);
        openMapEntry37.setIndex(15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertNotNull(openMapRealVector35);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double[] doubleArray6 = new double[] { 0, (byte) 10, 1.0d, (byte) 10, (byte) 0, '#' };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13, 100);
        org.apache.commons.math3.linear.RealVector realVector18 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(100, (int) (byte) 1, (double) (-1.0f));
        double[] doubleArray30 = new double[] { (byte) 1, 1.0E-12d, 29, Double.POSITIVE_INFINITY, 1.0d, 10 };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray30);
        double double32 = openMapRealVector23.getDistance(openMapRealVector31);
        openMapRealVector17.setSubVector(5, (org.apache.commons.math3.linear.RealVector) openMapRealVector31);
        org.apache.commons.math3.linear.RealMatrix realMatrix34 = openMapRealVector10.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector10);
        boolean boolean36 = openMapRealVector10.isNaN();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 1.0E-12d, 29.0d, Double.POSITIVE_INFINITY, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + Double.POSITIVE_INFINITY + "'", double32 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        int int7 = openMapRealVector2.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector2.copy();
        double double9 = openMapRealVector8.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double13 = openMapRealVector12.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector12.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector16);
        double[] doubleArray18 = openMapRealVector12.toArray();
        openMapRealVector12.set(10.0d);
        double[] doubleArray21 = openMapRealVector12.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray21, (double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector23.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector8.add(openMapRealVector23);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealVector23.setEntry((int) '4', 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(openMapRealVector8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(openMapRealVector25);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((int) '#', 18, 20.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 1);
        boolean boolean2 = openMapRealVector1.isNaN();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) 'a', (double) 54);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openMapRealVector2.walkInDefaultOrder(realVectorChangingVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector9.copy();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor35 = openMapRealVector34.sparseIterator();
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor36 = openMapRealVector34.iterator();
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray43);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray43, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.mapAdd((double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector46, 0);
        org.apache.commons.math3.linear.RealMatrix realMatrix51 = openMapRealVector34.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector46);
        double double52 = openMapRealVector46.getSparsity();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(openMapRealVector33);
        org.junit.Assert.assertNotNull(openMapRealVector34);
        org.junit.Assert.assertNotNull(entryItor35);
        org.junit.Assert.assertNotNull(entryItor36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector48);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (byte) 1);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector14.mapDivide(99.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(realVector16);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector((-1), 99, (-1.0E-12d));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector3);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        boolean boolean11 = openMapRealVector2.equals((java.lang.Object) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector21.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector25.mapSubtract(10.0d);
        double double29 = openMapRealVector14.getL1Distance(openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector25.mapSubtract((double) 'a');
        org.apache.commons.math3.linear.RealMatrix realMatrix32 = openMapRealVector2.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        int int33 = openMapRealVector2.getDimension();
        org.apache.commons.math3.linear.RealVector realVector34 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double43 = openMapRealVector42.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector37.append(openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector45.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector53.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 1, 100, 9752.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector57.append(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector2.append(openMapRealVector57);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator64 = openMapRealVector63.new OpenMapSparseIterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertNotNull(openMapRealVector56);
        org.junit.Assert.assertNotNull(openMapRealVector57);
        org.junit.Assert.assertNotNull(openMapRealVector62);
        org.junit.Assert.assertNotNull(openMapRealVector63);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, 168008.9283341811d);
        org.apache.commons.math3.linear.RealVectorPreservingVisitor realVectorPreservingVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealVector11.walkInDefaultOrder(realVectorPreservingVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        double[] doubleArray9 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.mapAddToSelf((double) 'a');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector21.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector25.mapSubtract(10.0d);
        double double29 = openMapRealVector14.getL1Distance(openMapRealVector25);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double33 = openMapRealVector32.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector32);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector37.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector32.append(openMapRealVector37);
        int int40 = openMapRealVector39.getMinIndex();
        int int41 = openMapRealVector39.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector44.append(openMapRealVector49);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double55 = openMapRealVector54.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector54);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector54.append(openMapRealVector59);
        org.apache.commons.math3.linear.RealVector realVector62 = openMapRealVector44.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector54);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector39.append((org.apache.commons.math3.linear.RealVector) openMapRealVector44);
        org.apache.commons.math3.linear.RealVector realVector64 = openMapRealVector14.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector44);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator65 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry66 = openMapRealVector14.new OpenMapEntry(iterator65);
        double double67 = openMapRealVector14.getNorm();
        openMapRealVector14.set(105.08092119885512d);
        double double70 = openMapRealVector2.getDistance(openMapRealVector14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector61);
        org.junit.Assert.assertNotNull(realVector62);
        org.junit.Assert.assertNotNull(openMapRealVector63);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 25.554116580720635d + "'", double70 == 25.554116580720635d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor10 = openMapRealVector9.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector9.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector12.unitVector();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.mapAdd((double) 29);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22, (double) 9);
        org.apache.commons.math3.linear.RealVector realVector27 = openMapRealVector25.mapSubtractToSelf(Double.NaN);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) 1, (double) (byte) 1);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector33.mapMultiplyToSelf(0.0d);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator36 = openMapRealVector33.new OpenMapSparseIterator();
        double double37 = openMapRealVector33.getNorm();
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray44, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray44, 3.1622776601683795d);
        double double50 = openMapRealVector33.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector49);
        org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector25.combineToSelf((double) 10L, (double) (byte) 1, (org.apache.commons.math3.linear.RealVector) openMapRealVector33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector52 = openMapRealVector15.add(realVector51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 21 != 6");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(entryItor10);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertNotNull(openMapRealVector15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 14.142135623730951d + "'", double50 == 14.142135623730951d);
        org.junit.Assert.assertNotNull(realVector51);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(53, (int) (short) 100);
        openMapRealVector2.addToEntry(5, (double) 15);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 0.0f);
        org.apache.commons.math3.linear.RealVector realVector13 = openMapRealVector11.mapMultiplyToSelf((double) (byte) 100);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = realVector13.walkInOptimizedOrder(realVectorChangingVisitor14, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(realVector13);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.mapAdd((double) (short) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29, 100);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector29.mapSubtract((double) (-1));
        org.apache.commons.math3.linear.RealVector realVector37 = realVector35.mapSubtractToSelf((double) 19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector26.ebeMultiply(realVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector38.copy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector19);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(openMapRealVector38);
        org.junit.Assert.assertNotNull(openMapRealVector39);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        int int10 = openMapRealVector9.getMinIndex();
        int int11 = openMapRealVector9.getDimension();
        double double12 = openMapRealVector9.getNorm();
        double double13 = openMapRealVector9.getNorm();
        openMapRealVector9.setEntry(0, (double) (byte) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector19);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double25 = openMapRealVector24.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.append(openMapRealVector24);
        int int27 = openMapRealVector26.getMinIndex();
        int int28 = openMapRealVector26.getDimension();
        double double29 = openMapRealVector26.getNorm();
        double double30 = openMapRealVector26.getNorm();
        openMapRealVector26.setEntry(0, (double) (byte) 100);
        boolean boolean34 = openMapRealVector9.equals((java.lang.Object) (byte) 100);
        boolean boolean35 = openMapRealVector9.isInfinite();
        double double36 = openMapRealVector9.getSparsity();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator37 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry38 = openMapRealVector9.new OpenMapEntry(iterator37);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.05d + "'", double36 == 0.05d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector9.copy();
        double double11 = openMapRealVector9.getMinValue();
        openMapRealVector9.addToEntry((int) (byte) 1, Double.NaN);
        double double15 = openMapRealVector9.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.mapAdd(306.7409330363328d);
        org.apache.commons.math3.linear.RealVector realVector19 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector18);
        java.lang.Double[] doubleArray20 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector24 = openMapRealVector18.subtract((org.apache.commons.math3.linear.RealVector) openMapRealVector23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3333333333333333d + "'", double15 == 0.3333333333333333d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new java.lang.Double[] {});
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) 29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector3.copy();
        org.apache.commons.math3.linear.RealVector realVector6 = openMapRealVector3.mapMultiplyToSelf((double) 10.0f);
        double double7 = realVector6.getMaxValue();
        double double8 = realVector6.getNorm();
        double double9 = realVector6.getNorm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(openMapRealVector4);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        boolean boolean11 = openMapRealVector9.isDefaultValue((double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator13 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry14 = openMapRealVector12.new OpenMapEntry(iterator13);
        org.apache.commons.math3.linear.RealVector realVector16 = openMapRealVector12.mapDivideToSelf(0.0d);
        openMapRealVector12.unitize();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = openMapRealVector12.getEntry(50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: index (50)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(realVector16);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.mapAddToSelf((double) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector14.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double26 = openMapRealVector21.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector28 = openMapRealVector25.mapSubtract(10.0d);
        double double29 = openMapRealVector14.getL1Distance(openMapRealVector25);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector14.mapDivide((-1.0d));
        double double32 = openMapRealVector2.getL1Distance((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double36 = openMapRealVector35.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector35);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double41 = openMapRealVector40.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector35.append(openMapRealVector40);
        int int43 = openMapRealVector42.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector42, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double49 = openMapRealVector48.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double54 = openMapRealVector53.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector48.append(openMapRealVector53);
        int int56 = openMapRealVector55.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector55, (int) (byte) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector45.add(openMapRealVector55);
        boolean boolean60 = openMapRealVector59.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double64 = openMapRealVector63.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double69 = openMapRealVector68.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector63.append(openMapRealVector68);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor71 = openMapRealVector70.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double75 = openMapRealVector74.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector74, 100);
        double double79 = openMapRealVector78.getMaxValue();
        org.apache.commons.math3.linear.RealVector realVector81 = openMapRealVector78.mapSubtract((double) 1.0f);
        openMapRealVector78.unitize();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector70.append(openMapRealVector78);
        java.lang.Double[] doubleArray85 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray85, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray85);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector90 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray85, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector90);
        openMapRealVector78.setSubVector(100, (org.apache.commons.math3.linear.RealVector) openMapRealVector90);
        double double93 = openMapRealVector78.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector78.copy();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector95 = openMapRealVector59.append((org.apache.commons.math3.linear.RealVector) openMapRealVector94);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector2.subtract(openMapRealVector94);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 10 != 110");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertNotNull(openMapRealVector11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1000.0d + "'", double32 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 19 + "'", int43 == 19);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 19 + "'", int56 == 19);
        org.junit.Assert.assertNotNull(openMapRealVector59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector70);
        org.junit.Assert.assertNotNull(entryItor71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(realVector81);
        org.junit.Assert.assertNotNull(openMapRealVector83);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector94);
        org.junit.Assert.assertNotNull(openMapRealVector95);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double51 = openMapRealVector50.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector50);
        org.apache.commons.math3.linear.RealVector realVector54 = openMapRealVector50.mapMultiply((double) 10L);
        double double55 = openMapRealVector25.dotProduct(openMapRealVector50);
        boolean boolean57 = openMapRealVector25.isDefaultValue(190.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector42);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(openMapRealVector44);
        org.junit.Assert.assertNotNull(openMapRealVector45);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(realVector54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector2.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector6);
        double[] doubleArray8 = openMapRealVector2.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray8, (double) (byte) 10);
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
        org.apache.commons.math3.linear.RealVector realVector34 = openMapRealVector14.mapDivide((double) 20);
        openMapRealVector10.setSubVector(0, realVector34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector10.mapAddToSelf((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector37.append(0.0d);
        org.apache.commons.math3.linear.RealVector realVector41 = openMapRealVector39.mapSubtract(10.488088481701515d);
        org.apache.commons.math3.linear.RealVectorChangingVisitor realVectorChangingVisitor42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = realVector41.walkInDefaultOrder(realVectorChangingVisitor42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector31);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertNotNull(openMapRealVector37);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertNotNull(realVector41);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double5 = openMapRealVector4.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector4);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector4.append(openMapRealVector9);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double15 = openMapRealVector14.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double20 = openMapRealVector19.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector14.append(openMapRealVector19);
        org.apache.commons.math3.linear.RealVector realVector22 = openMapRealVector4.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector14);
        boolean boolean24 = openMapRealVector14.isDefaultValue((double) 10);
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator25 = openMapRealVector14.new OpenMapSparseIterator();
        org.apache.commons.math3.linear.RealVector realVector27 = openMapRealVector14.mapDivide((double) (short) 100);
        org.apache.commons.math3.linear.RealVector realVector29 = realVector27.mapMultiplyToSelf(14.142135623730951d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector1.ebeMultiply(realVector27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 10");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector21);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector29);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (int) (short) 10);
        int int3 = openMapRealVector2.getMinIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector6.append((double) 1L);
        org.apache.commons.math3.linear.RealVector realVector12 = openMapRealVector10.mapSubtract((double) 1.0f);
        int int13 = openMapRealVector10.getMinIndex();
        double double14 = openMapRealVector2.getDistance(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector15.mapAdd(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector10);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(29, (int) (short) 100, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector3);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 10, (double) 100L);
        int int8 = openMapRealVector7.getMaxIndex();
        boolean boolean9 = openMapRealVector4.equals((java.lang.Object) openMapRealVector7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector1, 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector1.mapAddToSelf((double) (-1));
        double double6 = openMapRealVector5.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.getSubVector(11, (int) '4');
        org.junit.Assert.assertNotNull(openMapRealVector5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(11, (double) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double6 = openMapRealVector5.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double11 = openMapRealVector10.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector5.append(openMapRealVector10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector12.copy();
        boolean boolean14 = openMapRealVector12.isInfinite();
        org.apache.commons.math3.linear.RealVector realVector15 = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector12);
        boolean boolean16 = openMapRealVector2.equals((java.lang.Object) realVector15);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = openMapRealVector2.dotProduct(openMapRealVector17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector12);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(140);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math3.linear.OpenMapRealVector(109);
        double[] doubleArray2 = openMapRealVector1.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector1, 32);
        double[] doubleArray5 = openMapRealVector4.toArray();
        org.apache.commons.math3.linear.RealVector realVector7 = openMapRealVector4.mapSubtract(0.047619047619047616d);
        org.apache.commons.math3.linear.RealVector realVector9 = realVector7.mapDivide(0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(realVector7);
        org.junit.Assert.assertNotNull(realVector9);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) (-1.0f));
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 0.0f);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double17 = openMapRealVector16.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector16);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double22 = openMapRealVector21.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector16.append(openMapRealVector21);
        double double24 = openMapRealVector21.getL1Norm();
        double double25 = openMapRealVector21.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector21);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector(20, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector21.append(openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector30.mapDivide((double) 1);
        org.apache.commons.math3.linear.RealMatrix realMatrix33 = openMapRealVector13.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        org.apache.commons.math3.linear.RealVector realVector35 = openMapRealVector30.mapDivideToSelf((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector37 = openMapRealVector30.mapMultiplyToSelf((double) (-1.0f));
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor38 = openMapRealVector30.iterator();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 1.0d, 10.0d, 0.0d, 10.0d, 1.0d, 0.0d });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(entryItor38);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2, 100);
        org.apache.commons.math3.linear.RealVector realVector8 = openMapRealVector6.mapDivideToSelf((double) 10.0f);
        double double9 = openMapRealVector6.getSparsity();
        boolean boolean10 = openMapRealVector6.isInfinite();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double14 = openMapRealVector13.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector13);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double19 = openMapRealVector18.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.append(openMapRealVector18);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor21 = openMapRealVector20.sparseIterator();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector20.append((double) 100);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double27 = openMapRealVector26.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector26.append((double) 1L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double34 = openMapRealVector33.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double38 = openMapRealVector33.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector37);
        org.apache.commons.math3.linear.RealVector realVector40 = openMapRealVector37.mapSubtract(10.0d);
        double double41 = openMapRealVector26.getL1Distance(openMapRealVector37);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double50 = openMapRealVector49.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector44.append(openMapRealVector49);
        int int52 = openMapRealVector51.getMinIndex();
        int int53 = openMapRealVector51.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double57 = openMapRealVector56.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector56);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double62 = openMapRealVector61.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector56.append(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double67 = openMapRealVector66.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double72 = openMapRealVector71.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector66.append(openMapRealVector71);
        org.apache.commons.math3.linear.RealVector realVector74 = openMapRealVector56.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector66);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = openMapRealVector51.append((org.apache.commons.math3.linear.RealVector) openMapRealVector56);
        org.apache.commons.math3.linear.RealVector realVector76 = openMapRealVector26.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector56);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator77 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry78 = openMapRealVector26.new OpenMapEntry(iterator77);
        boolean boolean80 = openMapRealVector26.isDefaultValue((double) (short) 0);
        org.apache.commons.math3.linear.RealVector realVector82 = openMapRealVector26.mapDivideToSelf((double) (byte) 0);
        org.apache.commons.math3.linear.RealMatrix realMatrix83 = openMapRealVector20.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector26);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector26.append(22.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector6.append(openMapRealVector85);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.RealVector realVector88 = openMapRealVector85.map(univariateFunction87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector20);
        org.junit.Assert.assertNotNull(entryItor21);
        org.junit.Assert.assertNotNull(openMapRealVector23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(realVector40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 19 + "'", int52 == 19);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector63);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector73);
        org.junit.Assert.assertNotNull(realVector74);
        org.junit.Assert.assertNotNull(openMapRealVector75);
        org.junit.Assert.assertNotNull(realVector76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(openMapRealVector85);
        org.junit.Assert.assertNotNull(openMapRealVector86);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(6, (int) (byte) -1, 306.7409330363328d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double7 = openMapRealVector6.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double12 = openMapRealVector11.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector6.append(openMapRealVector11);
        double double14 = openMapRealVector6.getLInfNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double18 = openMapRealVector17.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector17);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double23 = openMapRealVector22.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.append(openMapRealVector22);
        int int25 = openMapRealVector24.getMinIndex();
        int int26 = openMapRealVector24.getDimension();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double30 = openMapRealVector29.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double35 = openMapRealVector34.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector29.append(openMapRealVector34);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double40 = openMapRealVector39.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double45 = openMapRealVector44.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.append(openMapRealVector44);
        org.apache.commons.math3.linear.RealVector realVector47 = openMapRealVector29.projection((org.apache.commons.math3.linear.RealVector) openMapRealVector39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector24.append((org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector6.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector29);
        org.apache.commons.math3.linear.RealVector realVector51 = openMapRealVector49.mapMultiplyToSelf((double) 109);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double55 = openMapRealVector54.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector54);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double60 = openMapRealVector59.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector54.append(openMapRealVector59);
        int int62 = openMapRealVector61.getMinIndex();
        int int63 = openMapRealVector61.getDimension();
        double double64 = openMapRealVector61.getNorm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector49.append(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector61);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector66.unitVector();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector3.ebeDivide((org.apache.commons.math3.linear.RealVector) openMapRealVector67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 6 != 20");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 19 + "'", int25 == 19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector46);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(openMapRealVector48);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 19 + "'", int62 == 19);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20 + "'", int63 == 20);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector65);
        org.junit.Assert.assertNotNull(openMapRealVector67);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator53 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry54 = openMapRealVector2.new OpenMapEntry(iterator53);
        double double55 = openMapRealVector2.getMinValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector2.mapAdd(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(openMapRealVector51);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector57);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double3 = openMapRealVector2.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector2);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double8 = openMapRealVector7.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.append(openMapRealVector7);
        double double10 = openMapRealVector9.getLInfNorm();
        double double12 = openMapRealVector9.getEntry((int) (byte) 10);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector9.mapAdd((double) 10);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator15 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry16 = openMapRealVector14.new OpenMapEntry(iterator15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector14);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, (double) (short) 0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray0, 1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector5);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector((int) (byte) 10, (double) 0);
        double double10 = openMapRealVector9.getMaxValue();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector9);
        double[] doubleArray12 = openMapRealVector9.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray12, (double) (-1L));
        double double15 = openMapRealVector6.getL1Distance(openMapRealVector14);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector14.append((double) (-1L));
        org.apache.commons.math3.linear.RealVector realVector19 = openMapRealVector17.mapMultiply((double) 141);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math3.linear.OpenMapRealVector(realVector19);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new java.lang.Double[] {});
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(openMapRealVector17);
        org.junit.Assert.assertNotNull(realVector19);
    }
}

