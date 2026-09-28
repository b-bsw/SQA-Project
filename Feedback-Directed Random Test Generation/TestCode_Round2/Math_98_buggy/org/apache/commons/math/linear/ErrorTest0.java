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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray2 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray3 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        int int3 = bigMatrixImpl2.parity;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl18.getEntry((int) (short) 0, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl18.getPermutation();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        java.lang.String str3 = bigMatrixImpl2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = realMatrixImpl0.operate(doubleArray1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray23 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray41 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[][] doubleArray1 = realMatrixImpl0.lu;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realMatrixImpl0 and realMatrixImpl0", realMatrixImpl0.equals(realMatrixImpl0) ? realMatrixImpl0.hashCode() == realMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        int[] intArray3 = bigMatrixImpl2.permutation;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        boolean boolean7 = realMatrixImpl2.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(5, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getColumn(6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray24 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        realMatrixImpl46.data = doubleArray85;
        double[][] doubleArray88 = realMatrixImpl46.getDataRef();
        realMatrixImpl1.data = doubleArray88;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray90 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        double[][] doubleArray41 = realMatrixImpl1.data;
        boolean boolean42 = realMatrixImpl1.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray43 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[][] doubleArray1 = realMatrixImpl0.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realMatrixImpl0 and realMatrixImpl0", realMatrixImpl0.equals(realMatrixImpl0) ? realMatrixImpl0.hashCode() == realMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        double[][] doubleArray41 = realMatrixImpl1.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl4 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray6 = realMatrixImpl5.getPermutation();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal[][] bigDecimalArray39 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray33, bigDecimalArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39, false);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getDataRef();
        bigMatrixImpl41.setRoundingMode(0);
        java.lang.String str45 = bigMatrixImpl41.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = bigMatrixImpl17.subtract(bigMatrixImpl41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl41.getPermutation();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        bigMatrixImpl39.setScale((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal1 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', (int) '4');
        realMatrixImpl2.parity = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal2, bigDecimal3, bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14 };
        java.math.BigDecimal[][] bigDecimalArray16 = new java.math.BigDecimal[][] { bigDecimalArray5, bigDecimalArray10, bigDecimalArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16, false);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getDataRef();
        boolean boolean21 = bigMatrixImpl18.equals((java.lang.Object) 32);
        boolean boolean22 = bigMatrixImpl18.isSquare();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = bigMatrixImpl18.subtract(bigMatrixImpl40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getEntry((int) (short) 1, 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        java.lang.String str43 = realMatrixImpl1.toString();
        java.lang.String str44 = realMatrixImpl1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray45 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal[][] bigDecimalArray39 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray33, bigDecimalArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39, false);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getDataRef();
        bigMatrixImpl41.setRoundingMode(0);
        java.lang.String str45 = bigMatrixImpl41.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = bigMatrixImpl17.subtract(bigMatrixImpl41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal[][] bigDecimalArray39 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray33, bigDecimalArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39, false);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getDataRef();
        bigMatrixImpl41.setRoundingMode(0);
        java.lang.String str45 = bigMatrixImpl41.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = bigMatrixImpl17.subtract(bigMatrixImpl41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl46.getPermutation();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        double[] doubleArray42 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 0);
        bigMatrixImpl39.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray45 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.lu;
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.lu;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray46, bigDecimalArray51, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57, false);
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl59.getDataRef();
        boolean boolean62 = bigMatrixImpl59.equals((java.lang.Object) 32);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66, bigDecimal67 };
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal69, bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray78 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76, bigDecimal77 };
        java.math.BigDecimal[][] bigDecimalArray79 = new java.math.BigDecimal[][] { bigDecimalArray68, bigDecimalArray73, bigDecimalArray78 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray79, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = bigMatrixImpl59.subtract(bigMatrixImpl81);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = bigMatrixImpl41.subtract(bigMatrixImpl59);
        java.math.BigDecimal[][] bigDecimalArray84 = bigMatrixImpl41.getData();
        bigMatrixImpl17.data = bigDecimalArray84;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray86 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        int int41 = bigMatrixImpl17.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray12, bigDecimalArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, false);
        bigMatrixImpl20.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl20.transpose();
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl20.getNorm();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray25, false);
        bigMatrixImpl2.lu = bigDecimalArray25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = realMatrixImpl0.getDeterminant();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray1 = realMatrixImpl0.getPermutation();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int[] intArray42 = realMatrixImpl1.permutation;
        int[] intArray43 = realMatrixImpl1.permutation;
        boolean boolean44 = realMatrixImpl1.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray7 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int[] intArray42 = realMatrixImpl1.permutation;
        int[] intArray43 = realMatrixImpl1.permutation;
        boolean boolean44 = realMatrixImpl1.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int[] intArray42 = realMatrixImpl1.permutation;
        int[] intArray43 = realMatrixImpl1.permutation;
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl1.copy();
        double[][] doubleArray45 = realMatrixImpl1.lu;
        java.lang.String str46 = realMatrixImpl1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean19 = bigMatrixImpl17.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray20 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getDataRef();
        boolean boolean43 = bigMatrixImpl40.equals((java.lang.Object) 32);
        boolean boolean44 = bigMatrixImpl40.isSquare();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray54, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60, false);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl62.getDataRef();
        boolean boolean65 = bigMatrixImpl62.equals((java.lang.Object) 32);
        boolean boolean66 = bigMatrixImpl62.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = bigMatrixImpl40.subtract(bigMatrixImpl62);
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70, bigDecimal71 };
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal73, bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray82 = new java.math.BigDecimal[] { bigDecimal78, bigDecimal79, bigDecimal80, bigDecimal81 };
        java.math.BigDecimal[][] bigDecimalArray83 = new java.math.BigDecimal[][] { bigDecimalArray72, bigDecimalArray77, bigDecimalArray82 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray83, false);
        bigMatrixImpl85.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = bigMatrixImpl67.add(bigMatrixImpl85);
        java.math.BigDecimal bigDecimal89 = bigMatrixImpl88.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix90 = bigMatrixImpl17.scalarAdd(bigDecimal89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray91 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal1 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, (int) '#');
        boolean boolean3 = bigMatrixImpl2.isSingular();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix2 = realMatrixImpl0.scalarAdd((double) 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl17.lu;
        int int46 = bigMatrixImpl17.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[][] doubleArray25 = realMatrixImpl24.getDataRef();
        double[][] doubleArray26 = realMatrixImpl24.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray27 = realMatrixImpl24.getPermutation();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal[][] bigDecimalArray39 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray33, bigDecimalArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39, false);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getDataRef();
        bigMatrixImpl41.setRoundingMode(0);
        java.lang.String str45 = bigMatrixImpl41.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = bigMatrixImpl17.subtract(bigMatrixImpl41);
        bigMatrixImpl17.parity = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray49 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        boolean boolean41 = bigMatrixImpl17.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray42 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int[] intArray42 = realMatrixImpl1.permutation;
        int[] intArray43 = realMatrixImpl1.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray44 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        realMatrixImpl0.parity = 0;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realMatrixImpl0 and realMatrixImpl0", realMatrixImpl0.equals(realMatrixImpl0) ? realMatrixImpl0.hashCode() == realMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 6);
        int int3 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        boolean boolean3 = bigMatrixImpl2.isSingular();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl1.scalarMultiply((double) 10L);
        int[] intArray46 = realMatrixImpl1.permutation;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59, bigDecimal60 };
        java.math.BigDecimal[][] bigDecimalArray62 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray56, bigDecimalArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62, false);
        java.math.BigDecimal[][] bigDecimalArray65 = bigMatrixImpl64.getDataRef();
        bigMatrixImpl64.setRoundingMode(0);
        bigMatrixImpl64.setScale((int) (byte) 100);
        double[][] doubleArray70 = bigMatrixImpl64.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[][] doubleArray72 = realMatrixImpl71.getDataRef();
        realMatrixImpl1.data = doubleArray72;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl2.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl2.scalarAdd((double) 64);
        double double8 = realMatrixImpl2.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray9 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((double) ' ');
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.scalarMultiply((double) 1);
        double[][] doubleArray89 = realMatrixImpl48.data;
        realMatrixImpl1.data = doubleArray89;
        double[][] doubleArray91 = realMatrixImpl1.getDataRef();
        java.lang.String str92 = realMatrixImpl1.toString();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = realMatrixImpl1.subtract(realMatrixImpl93);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl17.copy();
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray29, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35, false);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getDataRef();
        boolean boolean40 = bigMatrixImpl37.equals((java.lang.Object) 32);
        boolean boolean41 = bigMatrixImpl37.isSquare();
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray46, bigDecimalArray51, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = bigMatrixImpl37.subtract(bigMatrixImpl59);
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal[][] bigDecimalArray76 = new java.math.BigDecimal[][] { bigDecimalArray65, bigDecimalArray70, bigDecimalArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76, false);
        java.math.BigDecimal[][] bigDecimalArray79 = bigMatrixImpl78.getDataRef();
        boolean boolean80 = bigMatrixImpl59.equals((java.lang.Object) bigDecimalArray79);
        bigMatrixImpl59.setRoundingMode(0);
        double[] doubleArray84 = bigMatrixImpl59.getColumnAsDoubleArray((int) (byte) 1);
        java.math.BigDecimal[] bigDecimalArray86 = bigMatrixImpl59.getColumn(0);
        java.math.BigDecimal[] bigDecimalArray87 = bigMatrixImpl17.preMultiply(bigDecimalArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray90 = bigMatrixImpl89.getPermutation();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray29, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35, false);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getDataRef();
        boolean boolean40 = bigMatrixImpl37.equals((java.lang.Object) 32);
        boolean boolean41 = bigMatrixImpl37.isSquare();
        double[] doubleArray43 = bigMatrixImpl37.getRowAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[] bigDecimalArray44 = bigMatrixImpl17.operate(doubleArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray45 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) (short) -1);
        double[][] doubleArray20 = bigMatrixImpl17.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray21 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal[][] bigDecimalArray34 = new java.math.BigDecimal[][] { bigDecimalArray23, bigDecimalArray28, bigDecimalArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34, false);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getDataRef();
        boolean boolean39 = bigMatrixImpl36.equals((java.lang.Object) 32);
        boolean boolean40 = bigMatrixImpl36.isSquare();
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray45, bigDecimalArray50, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = bigMatrixImpl36.subtract(bigMatrixImpl58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = bigMatrixImpl18.subtract(bigMatrixImpl36);
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal[][] bigDecimalArray76 = new java.math.BigDecimal[][] { bigDecimalArray65, bigDecimalArray70, bigDecimalArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76, false);
        bigMatrixImpl78.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl78.transpose();
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl78.scalarMultiply(bigDecimal82);
        bigMatrixImpl78.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl60.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl78);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl60.transpose();
        java.lang.String str88 = bigMatrixImpl60.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray89 = bigMatrixImpl60.getPermutation();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        double[][] doubleArray90 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        double[][] doubleArray92 = realMatrixImpl91.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = realMatrixImpl93.getPermutation();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, (int) '4');
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        bigMatrixImpl40.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.transpose();
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl40.scalarMultiply(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl17.scalarMultiply(bigDecimal46);
        int int48 = bigMatrixImpl17.parity;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal[][] bigDecimalArray64 = new java.math.BigDecimal[][] { bigDecimalArray53, bigDecimalArray58, bigDecimalArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        boolean boolean68 = bigMatrixImpl67.isSingular();
        boolean boolean69 = bigMatrixImpl67.isSquare();
        int int70 = bigMatrixImpl67.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl17.add(bigMatrixImpl67);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl17.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray73 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, (int) '4');
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray12, bigDecimalArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, false);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getDataRef();
        boolean boolean23 = bigMatrixImpl20.equals((java.lang.Object) 32);
        boolean boolean24 = bigMatrixImpl20.isSquare();
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray34, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = bigMatrixImpl20.subtract(bigMatrixImpl42);
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl42.scalarAdd(bigDecimal44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl2.scalarMultiply(bigDecimal44);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        double[] doubleArray42 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        int int44 = realMatrixImpl43.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray45 = realMatrixImpl43.getPermutation();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(52, 52);
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray12, bigDecimalArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, false);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getDataRef();
        bigMatrixImpl2.lu = bigDecimalArray21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray41 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray43 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl4 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl4.copy();
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14 };
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal17 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal18 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray20 = new java.math.BigDecimal[] { bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19 };
        java.math.BigDecimal[][] bigDecimalArray21 = new java.math.BigDecimal[][] { bigDecimalArray10, bigDecimalArray15, bigDecimalArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl24.getEntry((int) (short) 0, 1);
        bigMatrixImpl24.parity = (byte) -1;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray39, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45, false);
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl47.getDataRef();
        boolean boolean50 = bigMatrixImpl47.equals((java.lang.Object) 32);
        int[] intArray54 = new int[] { 32, (short) -1, (-1) };
        bigMatrixImpl47.permutation = intArray54;
        bigMatrixImpl24.permutation = intArray54;
        realMatrixImpl4.permutation = intArray54;
        double[][] doubleArray58 = realMatrixImpl4.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray60 = bigMatrixImpl59.getPermutation();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.lang.String str21 = bigMatrixImpl17.toString();
        int int22 = bigMatrixImpl17.getScale();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getDataRef();
        boolean boolean43 = bigMatrixImpl40.equals((java.lang.Object) 32);
        boolean boolean44 = bigMatrixImpl40.isSquare();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray54, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60, false);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl62.getDataRef();
        boolean boolean65 = bigMatrixImpl62.equals((java.lang.Object) 32);
        boolean boolean66 = bigMatrixImpl62.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = bigMatrixImpl40.subtract(bigMatrixImpl62);
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl40.scalarAdd(bigDecimal68);
        org.apache.commons.math.linear.BigMatrix bigMatrix70 = bigMatrixImpl17.scalarMultiply(bigDecimal68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray71 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        double[] doubleArray42 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 0);
        bigMatrixImpl39.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray54, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60, false);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl62.getDataRef();
        boolean boolean65 = bigMatrixImpl62.equals((java.lang.Object) 32);
        int[] intArray69 = new int[] { 32, (short) -1, (-1) };
        bigMatrixImpl62.permutation = intArray69;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray80 = new java.math.BigDecimal[] { bigDecimal76, bigDecimal77, bigDecimal78, bigDecimal79 };
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray85 = new java.math.BigDecimal[] { bigDecimal81, bigDecimal82, bigDecimal83, bigDecimal84 };
        java.math.BigDecimal[][] bigDecimalArray86 = new java.math.BigDecimal[][] { bigDecimalArray75, bigDecimalArray80, bigDecimalArray85 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86, false);
        bigMatrixImpl88.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix91 = bigMatrixImpl88.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl62.preMultiply(bigMatrix91);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl39.subtract(bigMatrixImpl62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal[][] bigDecimalArray34 = new java.math.BigDecimal[][] { bigDecimalArray23, bigDecimalArray28, bigDecimalArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34, false);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getDataRef();
        boolean boolean39 = bigMatrixImpl36.equals((java.lang.Object) 32);
        boolean boolean40 = bigMatrixImpl36.isSquare();
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray45, bigDecimalArray50, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = bigMatrixImpl36.subtract(bigMatrixImpl58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = bigMatrixImpl18.subtract(bigMatrixImpl36);
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl18.scalarMultiply(bigDecimal61);
        int int63 = bigMatrixImpl18.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray64 = bigMatrixImpl18.getPermutation();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal[] bigDecimalArray22 = bigMatrixImpl17.getRow((int) (byte) 1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray34, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, false);
        bigMatrixImpl42.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl42.transpose();
        java.math.BigDecimal[] bigDecimalArray47 = bigMatrixImpl42.getRow((int) (byte) 1);
        java.math.BigDecimal[] bigDecimalArray48 = bigMatrixImpl24.preMultiply(bigDecimalArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray49 = bigMatrixImpl24.getPermutation();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl1.scalarMultiply((double) (short) 1);
        int int92 = realMatrixImpl1.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl1.scalarAdd((double) (byte) 10);
        boolean boolean95 = realMatrixImpl1.isSingular();
        double double96 = realMatrixImpl1.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray44 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        double[][] doubleArray90 = realMatrixImpl1.getDataRef();
        java.lang.String str91 = realMatrixImpl1.toString();
        boolean boolean93 = realMatrixImpl1.equals((java.lang.Object) 100.0f);
        int int94 = realMatrixImpl1.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 100, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray3 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl4 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray3);
        double[] doubleArray10 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray16 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray22 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray28 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray34 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray40 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray41 = new double[][] { doubleArray10, doubleArray16, doubleArray22, doubleArray28, doubleArray34, doubleArray40 };
        realMatrixImpl4.data = doubleArray41;
        realMatrixImpl2.data = doubleArray41;
        double[][] doubleArray44 = realMatrixImpl2.getDataRef();
        int int45 = realMatrixImpl2.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl2.scalarAdd((double) ' ');
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray55 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray61 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray67 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray73 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray79 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray85 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray86 = new double[][] { doubleArray55, doubleArray61, doubleArray67, doubleArray73, doubleArray79, doubleArray85 };
        realMatrixImpl49.data = doubleArray86;
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl49.scalarMultiply((double) 1);
        double[][] doubleArray90 = realMatrixImpl49.data;
        realMatrixImpl2.data = doubleArray90;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl0.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl93);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl1.scalarMultiply((double) 10L);
        double double46 = realMatrixImpl1.getNorm();
        int int47 = realMatrixImpl1.getColumnDimension();
        double[][] doubleArray48 = realMatrixImpl1.getDataRef();
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal[][] bigDecimalArray64 = new java.math.BigDecimal[][] { bigDecimalArray53, bigDecimalArray58, bigDecimalArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64, false);
        java.math.BigDecimal[][] bigDecimalArray67 = bigMatrixImpl66.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl66.copy();
        boolean boolean69 = realMatrixImpl1.equals((java.lang.Object) bigMatrixImpl66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray70 = bigMatrixImpl66.getPermutation();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        double[][] doubleArray90 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray92 = realMatrixImpl91.getPermutation();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray21 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        boolean boolean7 = realMatrixImpl2.isSingular();
        double[][] doubleArray8 = realMatrixImpl2.lu;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray9 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        int int3 = realMatrixImpl2.parity;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray4 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        double[][] doubleArray90 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        double[][] doubleArray92 = realMatrixImpl91.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl94 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray92);
        bigMatrixImpl94.parity = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = bigMatrixImpl94.getPermutation();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((double) ' ');
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.scalarMultiply((double) 1);
        double[][] doubleArray89 = realMatrixImpl48.data;
        realMatrixImpl1.data = doubleArray89;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        boolean boolean92 = realMatrixImpl91.isSingular();
        double[] doubleArray94 = realMatrixImpl91.getColumn(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = realMatrixImpl91.getPermutation();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, (int) '4');
        int int3 = bigMatrixImpl2.parity;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl1.scalarMultiply((double) 1);
        double[][] doubleArray42 = realMatrixImpl1.data;
        double[] doubleArray45 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarMultiply((double) 10.0f);
        int int52 = realMatrixImpl49.getRowDimension();
        double[][] doubleArray53 = realMatrixImpl49.lu;
        double[][] doubleArray54 = realMatrixImpl49.data;
        realMatrixImpl46.lu = doubleArray54;
        realMatrixImpl1.data = doubleArray54;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray58 = bigMatrixImpl57.getPermutation();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal2, bigDecimal3, bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9 };
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14 };
        java.math.BigDecimal[][] bigDecimalArray16 = new java.math.BigDecimal[][] { bigDecimalArray5, bigDecimalArray10, bigDecimalArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16, false);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getDataRef();
        boolean boolean21 = bigMatrixImpl18.equals((java.lang.Object) 32);
        boolean boolean22 = bigMatrixImpl18.isSquare();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = bigMatrixImpl18.subtract(bigMatrixImpl40);
        double[] doubleArray43 = bigMatrixImpl40.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray44 = realMatrixImpl0.solve(doubleArray43);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 3);
        bigMatrixImpl2.setScale(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl17.copy();
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray29, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35, false);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getDataRef();
        boolean boolean40 = bigMatrixImpl37.equals((java.lang.Object) 32);
        boolean boolean41 = bigMatrixImpl37.isSquare();
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray46, bigDecimalArray51, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = bigMatrixImpl37.subtract(bigMatrixImpl59);
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal[][] bigDecimalArray76 = new java.math.BigDecimal[][] { bigDecimalArray65, bigDecimalArray70, bigDecimalArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76, false);
        java.math.BigDecimal[][] bigDecimalArray79 = bigMatrixImpl78.getDataRef();
        boolean boolean80 = bigMatrixImpl59.equals((java.lang.Object) bigDecimalArray79);
        bigMatrixImpl59.setRoundingMode(0);
        double[] doubleArray84 = bigMatrixImpl59.getColumnAsDoubleArray((int) (byte) 1);
        java.math.BigDecimal[] bigDecimalArray86 = bigMatrixImpl59.getColumn(0);
        java.math.BigDecimal[] bigDecimalArray87 = bigMatrixImpl17.preMultiply(bigDecimalArray86);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87);
        boolean boolean89 = bigMatrixImpl88.isSquare();
        int int90 = bigMatrixImpl88.parity;
        double[] doubleArray92 = bigMatrixImpl88.getColumnAsDoubleArray((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = realMatrixImpl93.getPermutation();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.lu;
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.lu;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal42, bigDecimal43, bigDecimal44, bigDecimal45 };
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray46, bigDecimalArray51, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57, false);
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl59.getDataRef();
        boolean boolean62 = bigMatrixImpl59.equals((java.lang.Object) 32);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal65, bigDecimal66, bigDecimal67 };
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal69, bigDecimal70, bigDecimal71, bigDecimal72 };
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray78 = new java.math.BigDecimal[] { bigDecimal74, bigDecimal75, bigDecimal76, bigDecimal77 };
        java.math.BigDecimal[][] bigDecimalArray79 = new java.math.BigDecimal[][] { bigDecimalArray68, bigDecimalArray73, bigDecimalArray78 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray79, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl82 = bigMatrixImpl59.subtract(bigMatrixImpl81);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = bigMatrixImpl41.subtract(bigMatrixImpl59);
        java.math.BigDecimal[][] bigDecimalArray84 = bigMatrixImpl41.getData();
        bigMatrixImpl17.data = bigDecimalArray84;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = bigMatrixImpl86.getPermutation();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) (short) -1);
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray29, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35, false);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getDataRef();
        int int39 = bigMatrixImpl37.getRoundingMode();
        int int40 = bigMatrixImpl37.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl37.data;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray47, bigDecimalArray52, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58, false);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        bigMatrixImpl37.data = bigDecimalArray61;
        double[] doubleArray64 = bigMatrixImpl37.getColumnAsDoubleArray((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray65 = bigMatrixImpl37.getPermutation();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (short) 10);
        int int3 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray34, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, false);
        bigMatrixImpl42.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl42.transpose();
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl42.getDataRef();
        bigMatrixImpl24.lu = bigDecimalArray47;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47, true);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl52.getColumnMatrix(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray55 = bigMatrixImpl52.getPermutation();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.lang.String str21 = bigMatrixImpl17.toString();
        int int22 = bigMatrixImpl17.getScale();
        int int23 = bigMatrixImpl17.getScale();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl17.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray25 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(6, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.lu;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.scalarMultiply((double) 10.0f);
        int int9 = realMatrixImpl6.getRowDimension();
        double[][] doubleArray10 = realMatrixImpl6.lu;
        double[][] doubleArray11 = realMatrixImpl6.data;
        realMatrixImpl3.lu = doubleArray11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray13 = realMatrixImpl3.getPermutation();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        java.lang.String str1 = bigMatrixImpl0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl0 and bigMatrixImpl0", bigMatrixImpl0.equals(bigMatrixImpl0) ? bigMatrixImpl0.hashCode() == bigMatrixImpl0.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, 1);
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray12, bigDecimalArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, false);
        bigMatrixImpl2.lu = bigDecimalArray18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = realMatrixImpl3.getPermutation();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray34, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, false);
        bigMatrixImpl42.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl42.transpose();
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl42.getDataRef();
        bigMatrixImpl24.lu = bigDecimalArray47;
        bigMatrixImpl24.parity = ' ';
        int[] intArray51 = bigMatrixImpl24.permutation;
        int[] intArray52 = bigMatrixImpl24.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray53 = bigMatrixImpl24.getPermutation();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl17.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray25 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        bigMatrixImpl40.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.transpose();
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl40.getNorm();
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl40.getDataRef();
        bigMatrixImpl17.data = bigDecimalArray45;
        int int47 = bigMatrixImpl17.getColumnDimension();
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray62 = new java.math.BigDecimal[] { bigDecimal58, bigDecimal59, bigDecimal60, bigDecimal61 };
        java.math.BigDecimal[][] bigDecimalArray63 = new java.math.BigDecimal[][] { bigDecimalArray52, bigDecimalArray57, bigDecimalArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63, false);
        java.math.BigDecimal[][] bigDecimalArray66 = bigMatrixImpl65.getDataRef();
        bigMatrixImpl65.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl65.lu;
        boolean boolean70 = bigMatrixImpl65.isSquare();
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl65.getData();
        bigMatrixImpl17.lu = bigDecimalArray71;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = bigMatrixImpl73.getPermutation();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl2.getSubMatrix(0, (int) (short) 0, 2, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray8 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, (int) '4');
        bigMatrixImpl2.setRoundingMode(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray49, bigDecimalArray54, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60, false);
        bigMatrixImpl62.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = bigMatrixImpl44.add(bigMatrixImpl62);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl65.getNorm();
        int int67 = bigMatrixImpl65.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray68 = bigMatrixImpl65.getPermutation();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(52, 52);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getColumn(4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal19 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22 };
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal[][] bigDecimalArray34 = new java.math.BigDecimal[][] { bigDecimalArray23, bigDecimalArray28, bigDecimalArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34, false);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getDataRef();
        boolean boolean39 = bigMatrixImpl36.equals((java.lang.Object) 32);
        boolean boolean40 = bigMatrixImpl36.isSquare();
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray45, bigDecimalArray50, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = bigMatrixImpl36.subtract(bigMatrixImpl58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = bigMatrixImpl18.subtract(bigMatrixImpl36);
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal bigDecimal66 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal67, bigDecimal68, bigDecimal69 };
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal71, bigDecimal72, bigDecimal73, bigDecimal74 };
        java.math.BigDecimal[][] bigDecimalArray76 = new java.math.BigDecimal[][] { bigDecimalArray65, bigDecimalArray70, bigDecimalArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76, false);
        bigMatrixImpl36.data = bigDecimalArray76;
        int int80 = bigMatrixImpl36.parity;
        java.lang.String str81 = bigMatrixImpl36.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray82 = bigMatrixImpl36.getPermutation();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray3 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl17.copy();
        java.math.BigDecimal[] bigDecimalArray21 = bigMatrixImpl17.getColumn((int) (short) 1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray24 = bigMatrixImpl22.getPermutation();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        java.lang.String str4 = realMatrixImpl3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray5 = realMatrixImpl3.getPermutation();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int[] intArray42 = realMatrixImpl1.permutation;
        int[] intArray43 = realMatrixImpl1.permutation;
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl1.copy();
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        realMatrixImpl46.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        realMatrixImpl1.data = doubleArray85;
        boolean boolean90 = realMatrixImpl1.isSingular();
        boolean boolean91 = realMatrixImpl1.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray92 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl17.lu;
        int int46 = bigMatrixImpl17.getRowDimension();
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal48, bigDecimal49, bigDecimal50 };
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59, bigDecimal60 };
        java.math.BigDecimal[][] bigDecimalArray62 = new java.math.BigDecimal[][] { bigDecimalArray51, bigDecimalArray56, bigDecimalArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62, false);
        bigMatrixImpl64.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal68, bigDecimal69, bigDecimal70 };
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74, bigDecimal75 };
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray81 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79, bigDecimal80 };
        java.math.BigDecimal[][] bigDecimalArray82 = new java.math.BigDecimal[][] { bigDecimalArray71, bigDecimalArray76, bigDecimalArray81 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray82, false);
        java.math.BigDecimal[][] bigDecimalArray85 = bigMatrixImpl84.getDataRef();
        boolean boolean87 = bigMatrixImpl84.equals((java.lang.Object) 32);
        boolean boolean88 = bigMatrixImpl84.isSquare();
        double[] doubleArray90 = bigMatrixImpl84.getRowAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[] bigDecimalArray91 = bigMatrixImpl64.operate(doubleArray90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        java.math.BigDecimal[] bigDecimalArray93 = bigMatrixImpl17.operate(doubleArray90);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl94 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray93);
        int int95 = bigMatrixImpl94.parity;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl94 and bigMatrixImpl94", bigMatrixImpl94.equals(bigMatrixImpl94) ? bigMatrixImpl94.hashCode() == bigMatrixImpl94.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        double[] doubleArray2 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray4);
        double[] doubleArray11 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray17 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray23 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray29 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray35 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray41 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray42 = new double[][] { doubleArray11, doubleArray17, doubleArray23, doubleArray29, doubleArray35, doubleArray41 };
        realMatrixImpl5.data = doubleArray42;
        int int44 = realMatrixImpl5.getColumnDimension();
        double[][] doubleArray45 = realMatrixImpl5.data;
        realMatrixImpl3.data = doubleArray45;
        int int47 = realMatrixImpl3.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray48 = realMatrixImpl3.getPermutation();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl18.getEntry((int) (short) 0, 1);
        bigMatrixImpl18.parity = (byte) -1;
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl18.transpose();
        bigMatrixImpl18.setRoundingMode((-1));
        boolean boolean27 = bigMatrixImpl18.isSingular();
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray32, bigDecimalArray37, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43, false);
        bigMatrixImpl45.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl45.transpose();
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl45.scalarMultiply(bigDecimal49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl45.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl18.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        java.lang.String str53 = bigMatrixImpl18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray54 = bigMatrixImpl18.getPermutation();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((double) ' ');
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.scalarMultiply((double) 1);
        double[][] doubleArray89 = realMatrixImpl48.data;
        realMatrixImpl1.data = doubleArray89;
        boolean boolean92 = realMatrixImpl1.equals((java.lang.Object) 100);
        int[] intArray93 = realMatrixImpl1.permutation;
        double double94 = realMatrixImpl1.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray95 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl1.scalarMultiply((double) 1);
        double double42 = realMatrixImpl1.getNorm();
        double[][] doubleArray43 = realMatrixImpl1.getData();
        double[][] doubleArray44 = realMatrixImpl1.data;
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl1.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray46 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        double[][] doubleArray21 = bigMatrixImpl17.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        bigMatrixImpl39.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl39.transpose();
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal[][] bigDecimalArray44 = bigMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44, false);
        boolean boolean47 = bigMatrixImpl17.equals((java.lang.Object) bigMatrixImpl46);
        bigMatrixImpl46.parity = 100;
        double[][] doubleArray50 = bigMatrixImpl46.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl46.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray52 = bigMatrixImpl46.getPermutation();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl17.lu;
        double[][] doubleArray46 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl17.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray48 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl40.getNorm();
        int int42 = bigMatrixImpl40.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray43 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[][] doubleArray25 = realMatrixImpl24.getDataRef();
        double[][] doubleArray26 = realMatrixImpl24.data;
        int[] intArray27 = realMatrixImpl24.permutation;
        double[][] doubleArray28 = realMatrixImpl24.getDataRef();
        double[] doubleArray30 = realMatrixImpl24.getColumn((int) (short) 1);
        double[] doubleArray32 = realMatrixImpl24.getColumn((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray33 = realMatrixImpl24.getPermutation();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        double[] doubleArray25 = bigMatrixImpl17.getColumnAsDoubleArray(0);
        java.lang.String str26 = bigMatrixImpl17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray27 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getDataRef();
        bigMatrixImpl40.setRoundingMode(0);
        bigMatrixImpl40.setScale((int) (byte) 100);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray50, bigDecimalArray55, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61, false);
        bigMatrixImpl63.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl63.transpose();
        java.math.BigDecimal bigDecimal67 = bigMatrixImpl63.getNorm();
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl63.getDataRef();
        bigMatrixImpl40.data = bigDecimalArray68;
        bigMatrixImpl17.data = bigDecimalArray68;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray73 = bigMatrixImpl72.getPermutation();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        double[][] doubleArray23 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23, false);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl26.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray28 = realMatrixImpl26.getPermutation();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl18.getEntry((int) (short) 0, 1);
        bigMatrixImpl18.parity = (byte) -1;
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl18.transpose();
        bigMatrixImpl18.setRoundingMode((-1));
        boolean boolean27 = bigMatrixImpl18.isSingular();
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray32, bigDecimalArray37, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43, false);
        bigMatrixImpl45.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl45.transpose();
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl45.scalarMultiply(bigDecimal49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl45.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl18.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl45);
        java.lang.String str53 = bigMatrixImpl18.toString();
        bigMatrixImpl18.parity = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray56 = bigMatrixImpl18.getPermutation();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray90 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22, false);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl24.getNorm();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl24.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray27 = bigMatrixImpl24.getPermutation();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray3 = bigMatrixImpl2.getPermutation();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        int int45 = bigMatrixImpl39.getRoundingMode();
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray50, bigDecimalArray55, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61, false);
        bigMatrixImpl63.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl63.transpose();
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl63.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl63.getNorm();
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl63.lu;
        java.math.BigDecimal bigDecimal71 = bigMatrixImpl63.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl39.scalarAdd(bigDecimal71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray73 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(52, 52);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        boolean boolean24 = bigMatrixImpl17.isSquare();
        int int25 = bigMatrixImpl17.parity;
        int[] intArray26 = bigMatrixImpl17.permutation;
        boolean boolean28 = bigMatrixImpl17.equals((java.lang.Object) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray29 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(52, 52);
        int int3 = bigMatrixImpl2.parity;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl39.scalarAdd(bigDecimal41);
        double[] doubleArray45 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        boolean boolean50 = bigMatrixImpl39.equals((java.lang.Object) doubleArray45);
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal[][] bigDecimalArray66 = new java.math.BigDecimal[][] { bigDecimalArray55, bigDecimalArray60, bigDecimalArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray66, false);
        bigMatrixImpl68.setRoundingMode((int) 'a');
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl68.getData();
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74, bigDecimal75 };
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray81 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79, bigDecimal80 };
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray86 = new java.math.BigDecimal[] { bigDecimal82, bigDecimal83, bigDecimal84, bigDecimal85 };
        java.math.BigDecimal[][] bigDecimalArray87 = new java.math.BigDecimal[][] { bigDecimalArray76, bigDecimalArray81, bigDecimalArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87, false);
        java.math.BigDecimal[][] bigDecimalArray90 = bigMatrixImpl89.getDataRef();
        bigMatrixImpl89.setRoundingMode(0);
        java.lang.String str93 = bigMatrixImpl89.toString();
        int int94 = bigMatrixImpl89.getScale();
        java.math.BigDecimal[][] bigDecimalArray95 = bigMatrixImpl89.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl96 = bigMatrixImpl68.add(bigMatrixImpl89);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl97 = bigMatrixImpl39.add(bigMatrixImpl89);
        int int98 = bigMatrixImpl39.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        bigMatrixImpl17.setScale((int) (byte) 100);
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        bigMatrixImpl40.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.transpose();
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl40.getNorm();
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl40.getDataRef();
        bigMatrixImpl17.data = bigDecimalArray45;
        boolean boolean47 = bigMatrixImpl17.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray48 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(52, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getTrace();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((double) ' ');
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.scalarMultiply((double) 1);
        double[][] doubleArray89 = realMatrixImpl48.data;
        realMatrixImpl1.data = doubleArray89;
        double[][] doubleArray91 = realMatrixImpl1.getDataRef();
        java.lang.String str92 = realMatrixImpl1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray93 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.lu;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.transpose();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl17.lu;
        int int24 = bigMatrixImpl17.getColumnDimension();
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal35, bigDecimal36, bigDecimal37, bigDecimal38 };
        java.math.BigDecimal[][] bigDecimalArray40 = new java.math.BigDecimal[][] { bigDecimalArray29, bigDecimalArray34, bigDecimalArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40, false);
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl42.getDataRef();
        bigMatrixImpl42.setRoundingMode(5);
        bigMatrixImpl42.setRoundingMode(10);
        int[] intArray48 = bigMatrixImpl42.permutation;
        int int49 = bigMatrixImpl42.getRoundingMode();
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal[][] bigDecimalArray65 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray59, bigDecimalArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65, false);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl67.getDataRef();
        boolean boolean70 = bigMatrixImpl67.equals((java.lang.Object) 32);
        boolean boolean71 = bigMatrixImpl67.isSquare();
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74, bigDecimal75 };
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray81 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79, bigDecimal80 };
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray86 = new java.math.BigDecimal[] { bigDecimal82, bigDecimal83, bigDecimal84, bigDecimal85 };
        java.math.BigDecimal[][] bigDecimalArray87 = new java.math.BigDecimal[][] { bigDecimalArray76, bigDecimalArray81, bigDecimalArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = bigMatrixImpl67.subtract(bigMatrixImpl89);
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl90.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl42.scalarAdd(bigDecimal91);
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl17.scalarAdd(bigDecimal91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray94 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        boolean boolean21 = bigMatrixImpl17.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        bigMatrixImpl19.setRoundingMode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray22 = bigMatrixImpl19.getPermutation();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int int42 = realMatrixImpl1.getColumnDimension();
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray52 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray58 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray64 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray70 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray76 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray82 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray83 = new double[][] { doubleArray52, doubleArray58, doubleArray64, doubleArray70, doubleArray76, doubleArray82 };
        realMatrixImpl46.data = doubleArray83;
        realMatrixImpl44.data = doubleArray83;
        java.lang.String str86 = realMatrixImpl44.toString();
        boolean boolean87 = realMatrixImpl44.isSingular();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = realMatrixImpl1.subtract(realMatrixImpl44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray89 = realMatrixImpl44.getPermutation();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        boolean boolean7 = realMatrixImpl2.isSingular();
        int int8 = realMatrixImpl2.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.scalarMultiply((double) 10);
        double[][] doubleArray11 = realMatrixImpl2.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray12 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl17.lu;
        double[][] doubleArray46 = bigMatrixImpl17.getDataAsDoubleArray();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray49 = realMatrixImpl47.getColumn((int) (byte) 1);
        int int50 = realMatrixImpl47.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray51 = realMatrixImpl47.getPermutation();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        int int41 = bigMatrixImpl17.getScale();
        double[] doubleArray43 = bigMatrixImpl17.getColumnAsDoubleArray(0);
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal[][] bigDecimalArray59 = new java.math.BigDecimal[][] { bigDecimalArray48, bigDecimalArray53, bigDecimalArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59, false);
        bigMatrixImpl61.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl61.transpose();
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl61.scalarMultiply(bigDecimal65);
        java.math.BigDecimal bigDecimal67 = bigMatrixImpl61.getNorm();
        java.math.BigDecimal bigDecimal68 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal69 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal68, bigDecimal69, bigDecimal70, bigDecimal71 };
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal73, bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray82 = new java.math.BigDecimal[] { bigDecimal78, bigDecimal79, bigDecimal80, bigDecimal81 };
        java.math.BigDecimal[][] bigDecimalArray83 = new java.math.BigDecimal[][] { bigDecimalArray72, bigDecimalArray77, bigDecimalArray82 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray83, false);
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl85.getDataRef();
        bigMatrixImpl85.setRoundingMode(0);
        java.lang.String str89 = bigMatrixImpl85.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = bigMatrixImpl61.subtract(bigMatrixImpl85);
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl90.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl17.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray93 = bigMatrixImpl90.getPermutation();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl17.transpose();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl17.data;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray27 = bigMatrixImpl26.getPermutation();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        bigMatrixImpl17.setRoundingMode(100);
        int int25 = bigMatrixImpl17.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray26 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(10, 3);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        int int41 = realMatrixImpl1.getColumnDimension();
        int int42 = realMatrixImpl1.getColumnDimension();
        realMatrixImpl1.parity = 32;
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl1.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray46 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23, true);
        double[] doubleArray27 = bigMatrixImpl25.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarMultiply((double) 10.0f);
        int int33 = realMatrixImpl30.getRowDimension();
        double[][] doubleArray34 = realMatrixImpl30.lu;
        boolean boolean35 = realMatrixImpl30.isSingular();
        int int36 = realMatrixImpl30.parity;
        boolean boolean37 = realMatrixImpl30.isSquare();
        double[][] doubleArray38 = realMatrixImpl30.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal40, bigDecimal41, bigDecimal42, bigDecimal43 };
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal45, bigDecimal46, bigDecimal47, bigDecimal48 };
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal[][] bigDecimalArray55 = new java.math.BigDecimal[][] { bigDecimalArray44, bigDecimalArray49, bigDecimalArray54 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        bigMatrixImpl39.lu = bigDecimalArray55;
        bigMatrixImpl25.data = bigDecimalArray55;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray63 = bigMatrixImpl62.getPermutation();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ONE;
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl39.scalarAdd(bigDecimal41);
        double[] doubleArray45 = new double[] { 10L, 0.0f };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        boolean boolean50 = bigMatrixImpl39.equals((java.lang.Object) doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray52 = realMatrixImpl51.getPermutation();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, 10);
        bigMatrixImpl2.setRoundingMode((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        int int44 = realMatrixImpl1.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl1.scalarAdd((double) ' ');
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray54 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray60 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray66 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray72 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray78 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray84 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray85 = new double[][] { doubleArray54, doubleArray60, doubleArray66, doubleArray72, doubleArray78, doubleArray84 };
        realMatrixImpl48.data = doubleArray85;
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.scalarMultiply((double) 1);
        double[][] doubleArray89 = realMatrixImpl48.data;
        realMatrixImpl1.data = doubleArray89;
        boolean boolean92 = realMatrixImpl1.equals((java.lang.Object) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl1.copy();
        boolean boolean94 = realMatrixImpl1.isSingular();
        realMatrixImpl1.parity = 3;
        double[] doubleArray98 = realMatrixImpl1.getRow((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl17.copy();
        java.math.BigDecimal[] bigDecimalArray21 = bigMatrixImpl17.getColumn((int) (short) 1);
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        boolean boolean42 = bigMatrixImpl39.equals((java.lang.Object) 32);
        boolean boolean43 = bigMatrixImpl39.isSquare();
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal44, bigDecimal45, bigDecimal46, bigDecimal47 };
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal[][] bigDecimalArray59 = new java.math.BigDecimal[][] { bigDecimalArray48, bigDecimalArray53, bigDecimalArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59, false);
        java.math.BigDecimal[][] bigDecimalArray62 = bigMatrixImpl61.getDataRef();
        boolean boolean64 = bigMatrixImpl61.equals((java.lang.Object) 32);
        boolean boolean65 = bigMatrixImpl61.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = bigMatrixImpl39.subtract(bigMatrixImpl61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = bigMatrixImpl17.add(bigMatrixImpl39);
        int int68 = bigMatrixImpl39.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray69 = bigMatrixImpl39.getPermutation();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl1.scalarMultiply((double) 10L);
        double double46 = realMatrixImpl1.getNorm();
        int int47 = realMatrixImpl1.getColumnDimension();
        double[][] doubleArray48 = realMatrixImpl1.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray49 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        bigMatrixImpl17.setRoundingMode(100);
        int[] intArray25 = bigMatrixImpl17.permutation;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray30 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal29 };
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal31, bigDecimal32, bigDecimal33, bigDecimal34 };
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal36, bigDecimal37, bigDecimal38, bigDecimal39 };
        java.math.BigDecimal[][] bigDecimalArray41 = new java.math.BigDecimal[][] { bigDecimalArray30, bigDecimalArray35, bigDecimalArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41, false);
        java.math.BigDecimal[][] bigDecimalArray44 = bigMatrixImpl43.getDataRef();
        bigMatrixImpl43.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl43.lu;
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl43.lu;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal[][] bigDecimalArray64 = new java.math.BigDecimal[][] { bigDecimalArray53, bigDecimalArray58, bigDecimalArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64, false);
        java.math.BigDecimal[][] bigDecimalArray67 = bigMatrixImpl66.getDataRef();
        bigMatrixImpl66.setRoundingMode(0);
        java.lang.String str70 = bigMatrixImpl66.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl43.add(bigMatrixImpl66);
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl43.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray74 = bigMatrixImpl43.getPermutation();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23, true);
        double[] doubleArray27 = bigMatrixImpl25.getRowAsDoubleArray(0);
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray32, bigDecimalArray37, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43, false);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getDataRef();
        boolean boolean48 = bigMatrixImpl45.equals((java.lang.Object) 32);
        boolean boolean49 = bigMatrixImpl45.isSquare();
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal51, bigDecimal52, bigDecimal53 };
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal56, bigDecimal57, bigDecimal58 };
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal61, bigDecimal62, bigDecimal63 };
        java.math.BigDecimal[][] bigDecimalArray65 = new java.math.BigDecimal[][] { bigDecimalArray54, bigDecimalArray59, bigDecimalArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65, false);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl67.getDataRef();
        boolean boolean70 = bigMatrixImpl67.equals((java.lang.Object) 32);
        boolean boolean71 = bigMatrixImpl67.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = bigMatrixImpl45.subtract(bigMatrixImpl67);
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal73, bigDecimal74, bigDecimal75, bigDecimal76 };
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray82 = new java.math.BigDecimal[] { bigDecimal78, bigDecimal79, bigDecimal80, bigDecimal81 };
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal86 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray87 = new java.math.BigDecimal[] { bigDecimal83, bigDecimal84, bigDecimal85, bigDecimal86 };
        java.math.BigDecimal[][] bigDecimalArray88 = new java.math.BigDecimal[][] { bigDecimalArray77, bigDecimalArray82, bigDecimalArray87 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray88, false);
        bigMatrixImpl90.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl93 = bigMatrixImpl72.add(bigMatrixImpl90);
        java.math.BigDecimal[] bigDecimalArray95 = bigMatrixImpl72.getRow((int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl25.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray97 = bigMatrixImpl72.getPermutation();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 32);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        double[][] doubleArray43 = realMatrixImpl1.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray53 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray59 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray65 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray71 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray77 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray83 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray84 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77, doubleArray83 };
        realMatrixImpl47.data = doubleArray84;
        realMatrixImpl45.data = doubleArray84;
        realMatrixImpl1.data = doubleArray84;
        realMatrixImpl1.parity = (short) 1;
        double[][] doubleArray90 = realMatrixImpl1.getDataRef();
        java.lang.String str91 = realMatrixImpl1.toString();
        int int92 = realMatrixImpl1.getRowDimension();
        double[][] doubleArray93 = realMatrixImpl1.data;
        double double94 = realMatrixImpl1.getNorm();
        java.lang.String str95 = realMatrixImpl1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray96 = realMatrixImpl1.getPermutation();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 6);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getRow(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.lu;
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.lu;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getDataRef();
        bigMatrixImpl40.setRoundingMode(0);
        java.lang.String str44 = bigMatrixImpl40.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl17.add(bigMatrixImpl40);
        int int46 = bigMatrixImpl40.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray47 = bigMatrixImpl40.getPermutation();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        boolean boolean24 = bigMatrixImpl17.isSquare();
        int int25 = bigMatrixImpl17.parity;
        int[] intArray26 = bigMatrixImpl17.permutation;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray27 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        boolean boolean19 = bigMatrixImpl18.isSingular();
        boolean boolean20 = bigMatrixImpl18.isSquare();
        int int21 = bigMatrixImpl18.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl18.getColumnMatrix(3);
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27 };
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32 };
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal37 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal35, bigDecimal36, bigDecimal37 };
        java.math.BigDecimal[][] bigDecimalArray39 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray33, bigDecimalArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39, false);
        bigMatrixImpl41.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl41.transpose();
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl41.scalarMultiply(bigDecimal45);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl41.lu;
        java.math.BigDecimal bigDecimal49 = bigMatrixImpl41.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl18.scalarMultiply(bigDecimal49);
        int int51 = bigMatrixImpl18.getRowDimension();
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal52, bigDecimal53, bigDecimal54, bigDecimal55 };
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal58, bigDecimal59, bigDecimal60 };
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal65 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray66 = new java.math.BigDecimal[] { bigDecimal62, bigDecimal63, bigDecimal64, bigDecimal65 };
        java.math.BigDecimal[][] bigDecimalArray67 = new java.math.BigDecimal[][] { bigDecimalArray56, bigDecimalArray61, bigDecimalArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray67, false);
        bigMatrixImpl69.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal74 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal72, bigDecimal73, bigDecimal74, bigDecimal75 };
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal79 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray81 = new java.math.BigDecimal[] { bigDecimal77, bigDecimal78, bigDecimal79, bigDecimal80 };
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal84 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal85 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray86 = new java.math.BigDecimal[] { bigDecimal82, bigDecimal83, bigDecimal84, bigDecimal85 };
        java.math.BigDecimal[][] bigDecimalArray87 = new java.math.BigDecimal[][] { bigDecimalArray76, bigDecimalArray81, bigDecimalArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray87, false);
        java.math.BigDecimal[][] bigDecimalArray90 = bigMatrixImpl89.getDataRef();
        boolean boolean92 = bigMatrixImpl89.equals((java.lang.Object) 32);
        boolean boolean93 = bigMatrixImpl89.isSquare();
        double[] doubleArray95 = bigMatrixImpl89.getRowAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[] bigDecimalArray96 = bigMatrixImpl69.operate(doubleArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray97 = bigMatrixImpl18.operate(bigDecimalArray96);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal4 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal9 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11 };
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal14 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal15 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal16 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray12, bigDecimalArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18, false);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getDataRef();
        boolean boolean23 = bigMatrixImpl20.equals((java.lang.Object) 32);
        boolean boolean24 = bigMatrixImpl20.isSquare();
        bigMatrixImpl20.setRoundingMode((int) (short) -1);
        double[][] doubleArray27 = bigMatrixImpl20.getDataAsDoubleArray();
        realMatrixImpl2.data = doubleArray27;
        realMatrixImpl2.parity = 4;
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl2.scalarMultiply((double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray33 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        bigMatrixImpl40.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.transpose();
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl40.scalarMultiply(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl17.scalarMultiply(bigDecimal46);
        int int48 = bigMatrixImpl17.parity;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal50, bigDecimal51, bigDecimal52 };
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal55, bigDecimal56, bigDecimal57 };
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal60 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal60, bigDecimal61, bigDecimal62 };
        java.math.BigDecimal[][] bigDecimalArray64 = new java.math.BigDecimal[][] { bigDecimalArray53, bigDecimalArray58, bigDecimalArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        boolean boolean68 = bigMatrixImpl67.isSingular();
        boolean boolean69 = bigMatrixImpl67.isSquare();
        int int70 = bigMatrixImpl67.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = bigMatrixImpl17.add(bigMatrixImpl67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray72 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 3);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        int int40 = realMatrixImpl1.getColumnDimension();
        double[][] doubleArray41 = realMatrixImpl1.data;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray44 = realMatrixImpl42.getRow((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray45 = realMatrixImpl42.getPermutation();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) (short) -1);
        java.math.BigDecimal bigDecimal20 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23 };
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray29 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28 };
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray24, bigDecimalArray29, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35, false);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getDataRef();
        int int39 = bigMatrixImpl37.getRoundingMode();
        int int40 = bigMatrixImpl37.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl37.data;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal45 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal44, bigDecimal45, bigDecimal46 };
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal50 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal48, bigDecimal49, bigDecimal50, bigDecimal51 };
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal55 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal53, bigDecimal54, bigDecimal55, bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray47, bigDecimalArray52, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58, false);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        bigMatrixImpl37.data = bigDecimalArray61;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray63 = bigMatrixImpl37.getPermutation();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray13 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray31 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray7, doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        realMatrixImpl1.data = doubleArray38;
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl1.scalarMultiply((double) 1);
        double double42 = realMatrixImpl1.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl1.copy();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray51 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray57 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray63 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray69 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray75 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray81 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray82 = new double[][] { doubleArray51, doubleArray57, doubleArray63, doubleArray69, doubleArray75, doubleArray81 };
        realMatrixImpl45.data = doubleArray82;
        int int84 = realMatrixImpl45.getColumnDimension();
        double[][] doubleArray85 = realMatrixImpl45.data;
        boolean boolean86 = realMatrixImpl45.isSquare();
        double double87 = realMatrixImpl45.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl45.getColumnMatrix(0);
        double[] doubleArray91 = realMatrixImpl45.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl45.scalarAdd((double) 100);
        java.lang.String str94 = realMatrixImpl45.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl1.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray96 = realMatrixImpl45.getPermutation();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl1 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray9 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray15 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray21 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray33 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray39 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        realMatrixImpl3.data = doubleArray40;
        realMatrixImpl1.data = doubleArray40;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray51 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray57 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray63 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray69 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray75 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray81 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray82 = new double[][] { doubleArray51, doubleArray57, doubleArray63, doubleArray69, doubleArray75, doubleArray81 };
        realMatrixImpl45.data = doubleArray82;
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        realMatrixImpl43.lu = doubleArray82;
        boolean boolean86 = realMatrixImpl43.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray87 = realMatrixImpl43.getPermutation();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, 64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl5.scalarMultiply((double) 10.0f);
        int int8 = realMatrixImpl5.getRowDimension();
        double[][] doubleArray9 = realMatrixImpl5.lu;
        boolean boolean10 = realMatrixImpl5.isSingular();
        int int11 = realMatrixImpl5.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl5.scalarAdd((double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl5.getRowMatrix(3);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) 10.0f);
        int int21 = realMatrixImpl18.getRowDimension();
        double[][] doubleArray22 = realMatrixImpl18.lu;
        int[] intArray23 = realMatrixImpl18.permutation;
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl18.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl18.scalarMultiply(10.0d);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = realMatrixImpl5.add(realMatrixImpl18);
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray32, bigDecimalArray37, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43, false);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getDataRef();
        boolean boolean48 = bigMatrixImpl45.equals((java.lang.Object) 32);
        int[] intArray52 = new int[] { 32, (short) -1, (-1) };
        bigMatrixImpl45.permutation = intArray52;
        realMatrixImpl5.permutation = intArray52;
        bigMatrixImpl2.permutation = intArray52;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, 6);
        boolean boolean3 = bigMatrixImpl2.isSingular();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal26 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26 };
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal[][] bigDecimalArray38 = new java.math.BigDecimal[][] { bigDecimalArray27, bigDecimalArray32, bigDecimalArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38, false);
        bigMatrixImpl40.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.transpose();
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl40.scalarMultiply(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl17.scalarMultiply(bigDecimal46);
        int int48 = bigMatrixImpl17.parity;
        int int49 = bigMatrixImpl17.getColumnDimension();
        bigMatrixImpl17.setScale((int) '#');
        double[] doubleArray53 = bigMatrixImpl17.getRowAsDoubleArray((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray54 = bigMatrixImpl17.getPermutation();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarMultiply((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray10 = realMatrixImpl7.getPermutation();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) 10.0f);
        int int5 = realMatrixImpl2.getRowDimension();
        double[][] doubleArray6 = realMatrixImpl2.lu;
        int[] intArray7 = realMatrixImpl2.permutation;
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl2.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.scalarMultiply(10.0d);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray20 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray26 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray32 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray38 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray44 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[] doubleArray50 = new double[] { (byte) 100, (byte) -1, (byte) -1, 'a', (-1.0f) };
        double[][] doubleArray51 = new double[][] { doubleArray20, doubleArray26, doubleArray32, doubleArray38, doubleArray44, doubleArray50 };
        realMatrixImpl14.data = doubleArray51;
        realMatrixImpl12.data = doubleArray51;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        realMatrixImpl2.lu = doubleArray51;
        int[] intArray56 = realMatrixImpl2.permutation;
        int int57 = realMatrixImpl2.parity;
        double[] doubleArray59 = realMatrixImpl2.getColumn(4);
        int int60 = realMatrixImpl2.parity;
        realMatrixImpl2.parity = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray63 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, (int) 'a');
        boolean boolean3 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '#', (int) '4');
        realMatrixImpl2.parity = (byte) 0;
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.scalarMultiply((double) 10L);
        double[][] doubleArray7 = realMatrixImpl2.lu;
        double[][] doubleArray8 = realMatrixImpl2.lu;
        int int9 = realMatrixImpl2.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray10 = realMatrixImpl2.getPermutation();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(5, 100);
        int int3 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        double[] doubleArray42 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl43.getRowMatrix(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray46 = realMatrixImpl43.getPermutation();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(5, 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(6, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getColumnAsDoubleArray(0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        boolean boolean20 = bigMatrixImpl17.equals((java.lang.Object) 32);
        boolean boolean21 = bigMatrixImpl17.isSquare();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = bigMatrixImpl17.subtract(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal42 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal43 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal44 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal41, bigDecimal42, bigDecimal43, bigDecimal44 };
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal[][] bigDecimalArray56 = new java.math.BigDecimal[][] { bigDecimalArray45, bigDecimalArray50, bigDecimalArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56, false);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl58.getDataRef();
        boolean boolean60 = bigMatrixImpl39.equals((java.lang.Object) bigDecimalArray59);
        bigMatrixImpl39.setRoundingMode(0);
        double[] doubleArray64 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.getRowMatrix(1);
        boolean boolean68 = realMatrixImpl65.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray69 = realMatrixImpl65.getPermutation();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(2, (int) 'a');
        bigMatrixImpl2.setScale((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode(0);
        java.lang.String str21 = bigMatrixImpl17.toString();
        java.math.BigDecimal bigDecimal22 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal23 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal24 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal25 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25 };
        java.math.BigDecimal bigDecimal27 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray31 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30 };
        java.math.BigDecimal bigDecimal32 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35 };
        java.math.BigDecimal[][] bigDecimalArray37 = new java.math.BigDecimal[][] { bigDecimalArray26, bigDecimalArray31, bigDecimalArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37, false);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        bigMatrixImpl39.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl39.lu;
        boolean boolean44 = bigMatrixImpl39.isSingular();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = bigMatrixImpl17.add(bigMatrixImpl39);
        java.math.BigDecimal bigDecimal46 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal47 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal48 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal49 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal46, bigDecimal47, bigDecimal48, bigDecimal49 };
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal[][] bigDecimalArray61 = new java.math.BigDecimal[][] { bigDecimalArray50, bigDecimalArray55, bigDecimalArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61, false);
        bigMatrixImpl63.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl63.transpose();
        java.math.BigDecimal bigDecimal67 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl63.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl63.getNorm();
        java.math.BigDecimal bigDecimal70 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal71 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal72 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal73 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray74 = new java.math.BigDecimal[] { bigDecimal70, bigDecimal71, bigDecimal72, bigDecimal73 };
        java.math.BigDecimal bigDecimal75 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal76 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal77 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal78 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray79 = new java.math.BigDecimal[] { bigDecimal75, bigDecimal76, bigDecimal77, bigDecimal78 };
        java.math.BigDecimal bigDecimal80 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal81 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal82 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal83 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray84 = new java.math.BigDecimal[] { bigDecimal80, bigDecimal81, bigDecimal82, bigDecimal83 };
        java.math.BigDecimal[][] bigDecimalArray85 = new java.math.BigDecimal[][] { bigDecimalArray74, bigDecimalArray79, bigDecimalArray84 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray85, false);
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl87.getDataRef();
        bigMatrixImpl87.setRoundingMode(0);
        java.lang.String str91 = bigMatrixImpl87.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl92 = bigMatrixImpl63.subtract(bigMatrixImpl87);
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl17.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl63);
        int int94 = bigMatrixImpl63.parity;
        java.lang.String str95 = bigMatrixImpl63.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix97 = bigMatrixImpl63.getColumnMatrix(0);
        java.math.BigDecimal[][] bigDecimalArray98 = bigMatrixImpl63.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray99 = bigMatrixImpl63.getPermutation();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray3 = bigMatrixImpl2.getPermutation();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.math.BigDecimal bigDecimal0 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal1 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal2 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal3 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] { bigDecimal0, bigDecimal1, bigDecimal2, bigDecimal3 };
        java.math.BigDecimal bigDecimal5 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal6 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal7 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal8 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal11 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal12 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal13 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13 };
        java.math.BigDecimal[][] bigDecimalArray15 = new java.math.BigDecimal[][] { bigDecimalArray4, bigDecimalArray9, bigDecimalArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15, false);
        bigMatrixImpl17.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl17.transpose();
        java.math.BigDecimal bigDecimal21 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.scalarMultiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl17.lu;
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl17.getNorm();
        bigMatrixImpl17.setScale((-1));
        java.math.BigDecimal bigDecimal28 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal29 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal30 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal31 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31 };
        java.math.BigDecimal bigDecimal33 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal34 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal35 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal36 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal36 };
        java.math.BigDecimal bigDecimal38 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal39 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal40 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal41 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal38, bigDecimal39, bigDecimal40, bigDecimal41 };
        java.math.BigDecimal[][] bigDecimalArray43 = new java.math.BigDecimal[][] { bigDecimalArray32, bigDecimalArray37, bigDecimalArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43, false);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getDataRef();
        bigMatrixImpl45.setRoundingMode(0);
        double[][] doubleArray49 = bigMatrixImpl45.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = bigMatrixImpl17.add(bigMatrixImpl45);
        java.math.BigDecimal bigDecimal51 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal52 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal53 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal54 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal51, bigDecimal52, bigDecimal53, bigDecimal54 };
        java.math.BigDecimal bigDecimal56 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal57 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal58 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal59 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal56, bigDecimal57, bigDecimal58, bigDecimal59 };
        java.math.BigDecimal bigDecimal61 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal62 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal63 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal bigDecimal64 = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
        java.math.BigDecimal[] bigDecimalArray65 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal62, bigDecimal63, bigDecimal64 };
        java.math.BigDecimal[][] bigDecimalArray66 = new java.math.BigDecimal[][] { bigDecimalArray55, bigDecimalArray60, bigDecimalArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray66, false);
        bigMatrixImpl68.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl68.transpose();
        boolean boolean72 = bigMatrixImpl68.isSquare();
        bigMatrixImpl68.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray75 = bigMatrixImpl68.lu;
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl68.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = bigMatrixImpl17.subtract(bigMatrixImpl68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int[] intArray78 = bigMatrixImpl68.getPermutation();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 32);
        java.lang.String str3 = bigMatrixImpl2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }
}

