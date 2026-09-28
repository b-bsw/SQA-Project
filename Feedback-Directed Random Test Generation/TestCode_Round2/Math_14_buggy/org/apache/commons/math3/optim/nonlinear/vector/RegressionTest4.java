package org.apache.commons.math3.optim.nonlinear.vector;

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
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        java.lang.Class<?> wildcardClass25 = weight23.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass19 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass14 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass15 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight24.getWeight();
        java.lang.Class<?> wildcardClass26 = weight24.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        java.lang.Class<?> wildcardClass15 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        java.lang.Class<?> wildcardClass15 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight24.getWeight();
        java.lang.Class<?> wildcardClass26 = weight24.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass11 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight23.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass22 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        java.lang.Class<?> wildcardClass17 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray2 = new double[] { (-1.0d), 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        java.lang.Class<?> wildcardClass23 = realMatrix22.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray2 = new double[] { (-1.0d), 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        java.lang.Class<?> wildcardClass15 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight5.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        java.lang.Class<?> wildcardClass10 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight20.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass16 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight31 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight32 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight33 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass34 = weight33.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight31 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight32 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight33 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix34 = weight33.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix34);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        java.lang.Class<?> wildcardClass11 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        java.lang.Class<?> wildcardClass9 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray3 = new double[] { (-1.0d), (-1), (short) 10 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        java.lang.Class<?> wildcardClass21 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        java.lang.Class<?> wildcardClass7 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass21 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        java.lang.Class<?> wildcardClass25 = weight24.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        java.lang.Class<?> wildcardClass22 = realMatrix20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        java.lang.Class<?> wildcardClass23 = realMatrix20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        java.lang.Class<?> wildcardClass11 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        java.lang.Class<?> wildcardClass21 = weight20.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight24.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double[] doubleArray1 = new double[] { (short) 0 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        java.lang.Class<?> wildcardClass9 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass17 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        java.lang.Class<?> wildcardClass9 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass11 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        java.lang.Class<?> wildcardClass27 = realMatrix20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass21 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        java.lang.Class<?> wildcardClass19 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix27 = weight26.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        java.lang.Class<?> wildcardClass30 = realMatrix27.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double[] doubleArray1 = new double[] { '4' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        java.lang.Class<?> wildcardClass18 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass20 = weight19.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix22);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        java.lang.Class<?> wildcardClass26 = weight25.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, (-1.0d), (-1.0d), (short) -1, (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix25 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix26 = weight21.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass12 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        java.lang.Class<?> wildcardClass20 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight31 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight32 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix33 = weight32.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix33);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double[] doubleArray6 = new double[] { '4', 0.0f, '#', '#', (-1.0d), '#' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 0.0d, 35.0d, 35.0d, (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        java.lang.Class<?> wildcardClass30 = weight29.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass14 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix27 = weight26.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, (-1.0d), (-1.0d), (short) -1, (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix27 = weight26.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        java.lang.Class<?> wildcardClass29 = weight28.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        java.lang.Class<?> wildcardClass23 = weight22.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass19 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, (-1.0d), (-1.0d), (short) -1, (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double[] doubleArray5 = new double[] { (short) 100, ' ', 10L, 10.0d, '#' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray5);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 32.0d, 10.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        double[] doubleArray2 = new double[] { (-1.0d), 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight19.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight19.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double[] doubleArray2 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        java.lang.Class<?> wildcardClass13 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        java.lang.Class<?> wildcardClass16 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass14 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = weight15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight19.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight21.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 100.0d, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 32.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass17 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight16.getWeight();
        java.lang.Class<?> wildcardClass21 = realMatrix20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        java.lang.Class<?> wildcardClass12 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight5.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        java.lang.Class<?> wildcardClass15 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight7.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight18.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight18.getWeight();
        java.lang.Class<?> wildcardClass22 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        java.lang.Class<?> wildcardClass15 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix27 = weight26.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix27);
        java.lang.Class<?> wildcardClass31 = weight30.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 100.0d, 100 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, (-1.0d), (-1.0d), (short) -1, (-1.0d) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double[] doubleArray1 = new double[] { '4' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        java.lang.Class<?> wildcardClass8 = weight7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight3.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight3.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass19 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        java.lang.Class<?> wildcardClass16 = weight10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight31 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight32 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight33 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight34 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight35 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight36 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight37 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight38 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight20.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight20.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        java.lang.Class<?> wildcardClass11 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        java.lang.Class<?> wildcardClass9 = weight5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight23.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight9.getWeight();
        java.lang.Class<?> wildcardClass13 = weight9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double[] doubleArray6 = new double[] { '4', 0.0f, '#', '#', (-1.0d), '#' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray6);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 0.0d, 35.0d, 35.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double[] doubleArray4 = new double[] { '#', (short) 10, (short) -1, ' ' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        java.lang.Class<?> wildcardClass9 = weight8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        java.lang.Class<?> wildcardClass19 = weight17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        java.lang.Class<?> wildcardClass31 = weight30.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix17);
        java.lang.Class<?> wildcardClass19 = weight18.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight5.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight12.getWeight();
        java.lang.Class<?> wildcardClass15 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight14.getWeight();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double[] doubleArray1 = new double[] { '4' };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix4 = weight3.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight5.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix6);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        java.lang.Class<?> wildcardClass16 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight13.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        java.lang.Class<?> wildcardClass18 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight7.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix8);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight14.getWeight();
        java.lang.Class<?> wildcardClass16 = weight14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix21);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix6 = weight4.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        java.lang.Class<?> wildcardClass13 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix13);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix5 = weight4.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix5);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix8 = weight6.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight6.getWeight();
        java.lang.Class<?> wildcardClass10 = weight6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight15.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight21.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.apache.commons.math3.linear.RealMatrix realMatrix26 = weight25.getWeight();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double[] doubleArray3 = new double[] { 1L, 0, (short) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray3);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        java.lang.Class<?> wildcardClass12 = weight11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight23 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight26 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight27 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight28 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight29 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight30 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight31 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight32 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double[] doubleArray4 = new double[] { (byte) 10, 'a', 1.0f, 10.0f };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight18 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray4);
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight18.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix19);
        org.apache.commons.math3.linear.RealMatrix realMatrix21 = weight20.getWeight();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight14 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight15.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight17 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix16);
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix19 = weight17.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix20 = weight17.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight22 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix20);
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight22.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight24 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = weight2.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix3);
        org.apache.commons.math3.linear.RealMatrix realMatrix7 = weight6.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix7);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight8.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        java.lang.Class<?> wildcardClass13 = weight12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix9 = weight8.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight15 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight16 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix14);
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight16.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight16.getWeight();
        java.lang.Class<?> wildcardClass19 = weight16.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight11 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight11.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight13 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix12);
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight13.getWeight();
        java.lang.Class<?> wildcardClass15 = weight13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double[] doubleArray1 = new double[] { (-1L) };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight2 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight10 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray1);
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix14 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix15 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix16 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix17 = weight10.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix18 = weight10.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight19 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight20 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight21 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix18);
        org.apache.commons.math3.linear.RealMatrix realMatrix22 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix23 = weight21.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = weight21.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight25 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight3 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight4 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight5 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight6 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight7 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight8 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight9 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(doubleArray2);
        org.apache.commons.math3.linear.RealMatrix realMatrix10 = weight9.getWeight();
        org.apache.commons.math3.linear.RealMatrix realMatrix11 = weight9.getWeight();
        org.apache.commons.math3.optim.nonlinear.vector.Weight weight12 = new org.apache.commons.math3.optim.nonlinear.vector.Weight(realMatrix11);
        org.apache.commons.math3.linear.RealMatrix realMatrix13 = weight12.getWeight();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
    }
}

