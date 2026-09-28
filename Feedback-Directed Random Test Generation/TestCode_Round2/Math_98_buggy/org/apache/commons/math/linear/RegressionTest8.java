package org.apache.commons.math.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(10, 2);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', (int) '4');
        realMatrixImpl2.parity = (byte) 0;
        boolean boolean6 = realMatrixImpl2.equals((java.lang.Object) '#');
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[] doubleArray14 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray20 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray26 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray32 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray38 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray44 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray45 = new double[][] { doubleArray14, doubleArray20, doubleArray26, doubleArray32, doubleArray38, doubleArray44 };
        realMatrixImpl8.data = doubleArray45;
        int int47 = realMatrixImpl8.getColumnDimension();
        double[][] doubleArray48 = realMatrixImpl8.data;
        boolean boolean49 = realMatrixImpl8.isSquare();
        double[][] doubleArray50 = realMatrixImpl8.data;
        realMatrixImpl2.lu = doubleArray50;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[][] doubleArray53 = realMatrixImpl52.getDataRef();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray53);
    }
}

