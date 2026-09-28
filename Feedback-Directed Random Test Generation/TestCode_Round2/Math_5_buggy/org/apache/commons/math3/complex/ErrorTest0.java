package org.apache.commons.math3.complex;

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
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex15.nthRoot((int) '#');
        boolean boolean20 = complex15.isNaN();
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        boolean boolean26 = complex25.isNaN();
        double double27 = complex25.getReal();
        org.apache.commons.math3.complex.Complex complex28 = complex15.subtract(complex25);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        org.apache.commons.math3.complex.Complex complex36 = complex15.multiply(complex33);
        org.apache.commons.math3.complex.Complex complex37 = complex15.sqrt();
        org.apache.commons.math3.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex40 = complex38.divide((double) ' ');
        boolean boolean41 = complex10.equals((java.lang.Object) complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex28", complex10.equals(complex28) ? complex10.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex22 = complex19.createComplex((double) 100.0f, (double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        boolean boolean32 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((int) (byte) 100);
        boolean boolean38 = complex37.isNaN();
        double double39 = complex37.getReal();
        org.apache.commons.math3.complex.Complex complex40 = complex27.subtract(complex37);
        org.apache.commons.math3.complex.Complex complex41 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex42 = complex40.divide(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex41.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex19.subtract(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex40 and complex43", complex40.equals(complex43) ? complex40.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex28.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex17.divide(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex17.conjugate();
        java.lang.String str28 = complex27.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex1.conjugate();
        java.lang.Object obj46 = complex1.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex29.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex17.conjugate();
        boolean boolean28 = complex17.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex32.nthRoot((int) '#');
        boolean boolean37 = complex32.isNaN();
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        boolean boolean43 = complex42.isNaN();
        double double44 = complex42.getReal();
        org.apache.commons.math3.complex.Complex complex45 = complex32.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex47 = complex45.divide(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex46.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex27.divide(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex48", complex17.equals(complex48) ? complex17.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        boolean boolean23 = complex18.isNaN();
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math3.complex.Complex complex31 = complex18.subtract(complex28);
        org.apache.commons.math3.complex.Complex complex33 = complex31.add((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex34 = complex10.add(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex31", complex10.equals(complex31) ? complex10.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math3.complex.Complex complex23 = complex22.asin();
        double double24 = complex22.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        double double33 = complex30.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex39 = complex36.createComplex((double) ' ', (double) 0.0f);
        boolean boolean40 = complex25.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex36", complex17.equals(complex36) ? complex17.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math3.complex.Complex complex32 = complex29.multiply(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex32.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex32", complex17.equals(complex32) ? complex17.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex20.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList32 = complex28.nthRoot((int) '#');
        boolean boolean33 = complex28.isNaN();
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((int) (byte) 100);
        boolean boolean39 = complex38.isNaN();
        double double40 = complex38.getReal();
        org.apache.commons.math3.complex.Complex complex41 = complex28.subtract(complex38);
        org.apache.commons.math3.complex.Complex complex42 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex43 = complex41.divide(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex41.conjugate();
        org.apache.commons.math3.complex.Complex complex45 = complex23.pow(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex41", complex10.equals(complex41) ? complex10.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField25 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex26 = complex11.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex27 = complex4.divide(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex1.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        double double36 = complex33.abs();
        org.apache.commons.math3.complex.Complex complex37 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        double double47 = complex44.abs();
        org.apache.commons.math3.complex.Complex complex49 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex44.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex52 = complex39.subtract(complex51);
        boolean boolean53 = complex26.equals((java.lang.Object) complex51);
        org.apache.commons.math3.complex.Complex complex54 = complex26.log();
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex57 = complex55.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex60 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex60.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex64 = complex62.add((double) '#');
        double double65 = complex62.abs();
        org.apache.commons.math3.complex.Complex complex66 = complex62.reciprocal();
        org.apache.commons.math3.complex.Complex complex67 = complex55.add(complex66);
        org.apache.commons.math3.complex.Complex complex68 = complex54.pow(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex55", complex39.equals(complex55) ? complex39.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex20.divide(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex17.subtract(complex42);
        double double45 = complex42.getReal();
        double double46 = complex42.abs();
        org.apache.commons.math3.complex.ComplexField complexField47 = complex42.getField();
        org.apache.commons.math3.complex.Complex complex48 = complex14.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.pow((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex54 = complex42.multiply(complex53);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        boolean boolean60 = complex59.isNaN();
        org.apache.commons.math3.complex.Complex complex61 = complex59.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex59.multiply((-1));
        boolean boolean64 = complex59.isInfinite();
        org.apache.commons.math3.complex.Complex complex65 = complex59.sqrt1z();
        org.apache.commons.math3.complex.Complex complex66 = complex65.acos();
        org.apache.commons.math3.complex.Complex complex69 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex73 = complex71.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList75 = complex71.nthRoot((int) '#');
        boolean boolean76 = complex71.isNaN();
        org.apache.commons.math3.complex.Complex complex79 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex81 = complex79.multiply((int) (byte) 100);
        boolean boolean82 = complex81.isNaN();
        double double83 = complex81.getReal();
        org.apache.commons.math3.complex.Complex complex84 = complex71.subtract(complex81);
        org.apache.commons.math3.complex.Complex complex86 = complex84.add((double) (short) 10);
        double double87 = complex84.abs();
        org.apache.commons.math3.complex.Complex complex89 = complex84.multiply(10000.0d);
        org.apache.commons.math3.complex.Complex complex90 = complex84.exp();
        org.apache.commons.math3.complex.Complex complex91 = complex65.pow(complex84);
        org.apache.commons.math3.complex.Complex complex92 = complex42.divide(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex84", complex15.equals(complex84) ? complex15.hashCode() == complex84.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex38 = complex35.createComplex(0.0d, (double) ' ');
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        double double46 = complex43.abs();
        org.apache.commons.math3.complex.Complex complex47 = complex43.acos();
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex52 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex56 = complex54.add((double) '#');
        org.apache.commons.math3.complex.Complex complex57 = complex56.reciprocal();
        double double58 = complex56.getArgument();
        org.apache.commons.math3.complex.Complex complex59 = complex47.pow(complex56);
        org.apache.commons.math3.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math3.complex.Complex complex61 = complex38.multiply(complex60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex49", complex21.equals(complex49) ? complex21.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        double double14 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex31 = complex29.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList33 = complex29.nthRoot(100);
        boolean boolean34 = complex20.equals((java.lang.Object) complexList33);
        org.apache.commons.math3.complex.Complex complex35 = complex20.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex37 = complex10.subtract(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        org.apache.commons.math3.complex.Complex complex19 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        boolean boolean28 = complex27.isNaN();
        double double29 = complex27.getReal();
        org.apache.commons.math3.complex.Complex complex30 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex35.nthRoot((int) '#');
        boolean boolean40 = complex35.isNaN();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        boolean boolean46 = complex45.isNaN();
        double double47 = complex45.getReal();
        org.apache.commons.math3.complex.Complex complex48 = complex35.subtract(complex45);
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex55 = complex53.add((double) '#');
        org.apache.commons.math3.complex.Complex complex56 = complex48.add(complex53);
        double double57 = complex56.getReal();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex60 = complex58.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex61 = complex56.divide(complex60);
        org.apache.commons.math3.complex.Complex complex62 = complex27.pow(complex61);
        org.apache.commons.math3.complex.Complex complex63 = complex21.multiply(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex48 and complex62", complex48.equals(complex62) ? complex48.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex28 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex29 = complex22.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        boolean boolean35 = complex34.isNaN();
        double double36 = complex34.getReal();
        org.apache.commons.math3.complex.Complex complex37 = complex34.negate();
        org.apache.commons.math3.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex39 = complex38.reciprocal();
        org.apache.commons.math3.complex.Complex complex40 = complex29.divide(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex39", complex38.equals(complex39) ? complex38.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math3.complex.Complex complex32 = complex29.multiply(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex29.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex32", complex17.equals(complex32) ? complex17.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math3.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex4.pow(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex39.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        java.lang.String str32 = complex29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = complex45.createComplex((-9.903537547537045d), 100.00499987500623d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        double double18 = complex17.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math3.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex4.pow(complex38);
        double double40 = complex38.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex18 = complex13.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math3.complex.Complex complex7 = complex6.reciprocal();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        double double16 = complex13.abs();
        org.apache.commons.math3.complex.Complex complex17 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        double double27 = complex24.abs();
        org.apache.commons.math3.complex.Complex complex29 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex19.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex31.cos();
        boolean boolean34 = complex6.equals((java.lang.Object) complex31);
        org.apache.commons.math3.complex.Complex complex36 = complex31.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math3.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math3.complex.Complex complex62 = complex54.add(complex59);
        org.apache.commons.math3.complex.Complex complex63 = complex54.reciprocal();
        org.apache.commons.math3.complex.Complex complex64 = complex36.subtract(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex54", complex19.equals(complex54) ? complex19.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex24 = complex19.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex25 = complex4.subtract(complex24);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        double double33 = complex30.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex30.acos();
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex38 = complex24.add(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex36", complex17.equals(complex36) ? complex17.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract(100.0d);
        java.lang.String str13 = complex12.toString();
        org.apache.commons.math3.complex.Complex complex15 = complex12.multiply(100.00499987500623d);
        org.apache.commons.math3.complex.Complex complex16 = complex9.divide(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex44.asin();
        java.lang.Object obj46 = complex44.readResolve();
        org.apache.commons.math3.complex.Complex complex47 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = complex44.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex44 and complex47", complex44.equals(complex47) ? complex44.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        java.lang.String str18 = complex13.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math3.complex.Complex complex22 = complex19.createComplex(0.0d, (double) 0L);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex29 = complex27.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex29.nthRoot((int) (short) 100);
        boolean boolean33 = complex29.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex40 = complex38.add((double) '#');
        double double41 = complex38.abs();
        org.apache.commons.math3.complex.Complex complex42 = complex38.acos();
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex45 = complex29.pow(complex42);
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow(complex48);
        org.apache.commons.math3.complex.Complex complex51 = complex48.divide((-9.903537547537045d));
        org.apache.commons.math3.complex.Complex complex52 = complex22.subtract(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex44", complex17.equals(complex44) ? complex17.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math3.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex4.pow(complex38);
        org.apache.commons.math3.complex.Complex complex40 = complex39.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply(0);
        org.apache.commons.math3.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex10.divide(10000.0d);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean16 = complex15.isInfinite();
        org.apache.commons.math3.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex15.asin();
        org.apache.commons.math3.complex.Complex complex19 = complex18.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        org.apache.commons.math3.complex.Complex complex27 = complex26.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex32.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot(100);
        boolean boolean46 = complex32.equals((java.lang.Object) complexList45);
        org.apache.commons.math3.complex.Complex complex47 = complex32.sinh();
        org.apache.commons.math3.complex.Complex complex49 = complex32.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex51 = complex49.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex27.subtract(complex49);
        java.lang.Object obj53 = complex49.readResolve();
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex56 = complex55.sinh();
        double double57 = complex56.getReal();
        org.apache.commons.math3.complex.Complex complex58 = complex49.multiply(complex56);
        org.apache.commons.math3.complex.Complex complex59 = complex18.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex62 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex64 = complex62.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex66 = complex64.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList68 = complex64.nthRoot((int) '#');
        boolean boolean69 = complex64.isNaN();
        org.apache.commons.math3.complex.Complex complex72 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex74 = complex72.multiply((int) (byte) 100);
        boolean boolean75 = complex74.isNaN();
        double double76 = complex74.getReal();
        org.apache.commons.math3.complex.Complex complex77 = complex64.subtract(complex74);
        org.apache.commons.math3.complex.Complex complex78 = complex64.acos();
        org.apache.commons.math3.complex.Complex complex79 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex82 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex83 = complex82.conjugate();
        org.apache.commons.math3.complex.Complex complex84 = complex79.subtract(complex83);
        org.apache.commons.math3.complex.Complex complex85 = complex64.subtract(complex84);
        org.apache.commons.math3.complex.Complex complex86 = complex18.pow(complex85);
        double double87 = complex18.getImaginary();
        org.apache.commons.math3.complex.Complex complex88 = complex10.subtract(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex77", complex10.equals(complex77) ? complex10.hashCode() == complex77.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math3.complex.Complex complex7 = complex6.reciprocal();
        double double8 = complex6.getArgument();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        double double16 = complex13.abs();
        org.apache.commons.math3.complex.Complex complex17 = complex13.acos();
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        double double27 = complex24.abs();
        org.apache.commons.math3.complex.Complex complex29 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex24.negate();
        org.apache.commons.math3.complex.Complex complex31 = complex24.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex19.subtract(complex31);
        org.apache.commons.math3.complex.Complex complex33 = complex31.cos();
        boolean boolean34 = complex6.equals((java.lang.Object) complex31);
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex41 = complex39.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex39.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList52 = complex48.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField53 = complex48.getField();
        org.apache.commons.math3.complex.Complex complex54 = complex39.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex55 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex56 = complex54.pow(complex55);
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        boolean boolean62 = complex61.isNaN();
        org.apache.commons.math3.complex.Complex complex63 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex65 = complex61.multiply((-1));
        boolean boolean66 = complex61.isInfinite();
        org.apache.commons.math3.complex.Complex complex67 = complex61.acos();
        org.apache.commons.math3.complex.Complex complex68 = complex55.multiply(complex67);
        org.apache.commons.math3.complex.Complex complex69 = complex31.add(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex55", complex19.equals(complex55) ? complex19.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex25.getReal();
        org.apache.commons.math3.complex.Complex complex28 = complex25.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex30 = complex25.add((-1.0d));
        org.apache.commons.math3.complex.Complex complex31 = complex25.sinh();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex40 = complex36.acos();
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex49 = complex47.add((double) '#');
        org.apache.commons.math3.complex.Complex complex50 = complex49.reciprocal();
        double double51 = complex49.getArgument();
        org.apache.commons.math3.complex.Complex complex52 = complex40.pow(complex49);
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex54 = complex31.multiply(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex42", complex17.equals(complex42) ? complex17.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        java.lang.Object obj8 = complex4.readResolve();
        org.apache.commons.math3.complex.Complex complex9 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex16 = complex14.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex14.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex23.nthRoot(100);
        boolean boolean28 = complex14.equals((java.lang.Object) complexList27);
        java.lang.String str29 = complex14.toString();
        org.apache.commons.math3.complex.Complex complex30 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex32 = complex14.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex34 = complex14.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex35 = complex14.cos();
        org.apache.commons.math3.complex.Complex complex36 = complex9.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex37 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) 100);
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        double double47 = complex44.abs();
        org.apache.commons.math3.complex.Complex complex49 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex44.negate();
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) 'a');
        boolean boolean53 = complex52.isInfinite();
        org.apache.commons.math3.complex.Complex complex54 = complex52.conjugate();
        org.apache.commons.math3.complex.Complex complex55 = complex54.exp();
        org.apache.commons.math3.complex.Complex complex57 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex60 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex60.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex65 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex69 = complex67.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList71 = complex67.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex74 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex76 = complex74.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex78 = complex76.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList80 = complex76.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField81 = complex76.getField();
        org.apache.commons.math3.complex.Complex complex82 = complex67.multiply(complex76);
        org.apache.commons.math3.complex.Complex complex83 = complex60.divide(complex82);
        org.apache.commons.math3.complex.Complex complex84 = complex57.subtract(complex82);
        double double85 = complex82.getReal();
        double double86 = complex82.abs();
        org.apache.commons.math3.complex.ComplexField complexField87 = complex82.getField();
        org.apache.commons.math3.complex.Complex complex88 = complex54.subtract(complex82);
        org.apache.commons.math3.complex.Complex complex89 = complex82.cos();
        org.apache.commons.math3.complex.Complex complex90 = complex39.divide(complex89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex32 and complex55", complex32.equals(complex55) ? complex32.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex1.conjugate();
        java.lang.Class<?> wildcardClass46 = complex1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        double double29 = complex26.abs();
        org.apache.commons.math3.complex.Complex complex30 = complex26.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex19.divide(complex26);
        org.apache.commons.math3.complex.Complex complex34 = complex19.pow((double) '4');
        org.apache.commons.math3.complex.Complex complex35 = complex19.conjugate();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex40.add((double) '#');
        double double43 = complex40.abs();
        org.apache.commons.math3.complex.Complex complex44 = complex40.acos();
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex53 = complex51.add((double) '#');
        org.apache.commons.math3.complex.Complex complex54 = complex53.reciprocal();
        double double55 = complex53.getArgument();
        org.apache.commons.math3.complex.Complex complex56 = complex44.pow(complex53);
        org.apache.commons.math3.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math3.complex.Complex complex59 = complex57.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex60 = complex57.acos();
        org.apache.commons.math3.complex.Complex complex61 = complex57.asin();
        org.apache.commons.math3.complex.Complex complex62 = complex57.tan();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList64 = complex57.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex72 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex74 = complex72.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex76 = complex74.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList78 = complex74.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex81 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex83 = complex81.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex85 = complex83.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList87 = complex83.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField88 = complex83.getField();
        org.apache.commons.math3.complex.Complex complex89 = complex74.multiply(complex83);
        org.apache.commons.math3.complex.Complex complex90 = complex67.divide(complex89);
        org.apache.commons.math3.complex.Complex complex91 = complex67.sinh();
        double double92 = complex91.getImaginary();
        org.apache.commons.math3.complex.Complex complex93 = complex57.multiply(complex91);
        org.apache.commons.math3.complex.Complex complex94 = complex35.add(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex46", complex20.equals(complex46) ? complex20.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex9.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.asin();
        boolean boolean2 = complex0.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex11 = complex9.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex9.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex18.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField23 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex24 = complex9.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex25 = complex2.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex2.sinh();
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex26.pow((double) (-1L));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex32.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex32", complex30.equals(complex32) ? complex30.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        boolean boolean8 = complex7.isNaN();
        double double9 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex16 = complex14.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList18 = complex14.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex23.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField28 = complex23.getField();
        org.apache.commons.math3.complex.Complex complex29 = complex14.multiply(complex23);
        org.apache.commons.math3.complex.Complex complex30 = complex7.multiply(complex14);
        org.apache.commons.math3.complex.Complex complex31 = complex14.acos();
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math3.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math3.complex.Complex complex34 = complex1.divide(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.log();
        org.apache.commons.math3.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex2.createComplex(0.0d, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex6 = complex2.conjugate();
        double double7 = complex2.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex28 = complex27.log();
        boolean boolean29 = complex22.equals((java.lang.Object) complex27);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.pow((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex35 = complex32.sin();
        org.apache.commons.math3.complex.Complex complex36 = complex27.pow(complex35);
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean39 = complex38.isInfinite();
        org.apache.commons.math3.complex.Complex complex40 = complex38.tan();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex47 = complex45.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList49 = complex45.nthRoot((int) '#');
        boolean boolean50 = complex45.isNaN();
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        boolean boolean56 = complex55.isNaN();
        double double57 = complex55.getReal();
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex55);
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex65 = complex63.add((double) '#');
        org.apache.commons.math3.complex.Complex complex66 = complex45.multiply(complex63);
        org.apache.commons.math3.complex.Complex complex67 = complex63.sin();
        org.apache.commons.math3.complex.Complex complex68 = complex63.cos();
        org.apache.commons.math3.complex.Complex complex71 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex75 = complex73.add((double) '#');
        double double76 = complex73.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList78 = complex73.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex79 = complex63.multiply(complex73);
        org.apache.commons.math3.complex.Complex complex80 = complex38.add(complex79);
        double double81 = complex38.getArgument();
        org.apache.commons.math3.complex.Complex complex82 = complex38.conjugate();
        org.apache.commons.math3.complex.Complex complex83 = complex36.pow(complex82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex82", complex38.equals(complex82) ? complex38.hashCode() == complex82.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = complex1.createComplex((-0.7853981633974483d), 1.3440585709080679E41d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf(14.142135623730951d, 9903.50488463554d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        boolean boolean8 = complex7.isNaN();
        double double9 = complex7.getReal();
        org.apache.commons.math3.complex.Complex complex10 = complex7.negate();
        org.apache.commons.math3.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex11.reciprocal();
        boolean boolean13 = complex2.equals((java.lang.Object) complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        double double57 = complex55.getImaginary();
        org.apache.commons.math3.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex61 = complex58.pow(1.5707963264824902d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex59", complex58.equals(complex59) ? complex58.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex12 = complex10.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex15 = complex10.createComplex((double) (short) 10, (double) (short) -1);
        java.lang.Object obj16 = complex10.readResolve();
        org.apache.commons.math3.complex.Complex complex17 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex18 = complex8.pow(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex29.multiply((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.multiply((int) (short) 10);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList37 = complex33.nthRoot((int) '#');
        boolean boolean38 = complex33.isNaN();
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        boolean boolean44 = complex43.isNaN();
        double double45 = complex43.getReal();
        org.apache.commons.math3.complex.Complex complex46 = complex33.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex53 = complex51.add((double) '#');
        org.apache.commons.math3.complex.Complex complex54 = complex46.add(complex51);
        org.apache.commons.math3.complex.Complex complex55 = complex51.exp();
        org.apache.commons.math3.complex.Complex complex56 = complex55.log();
        org.apache.commons.math3.complex.Complex complex57 = complex28.add(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex46", complex21.equals(complex46) ? complex21.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math3.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math3.complex.Complex complex35 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math3.complex.Complex complex39 = complex4.pow(complex38);
        org.apache.commons.math3.complex.Complex complex41 = complex4.divide((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        java.lang.Object obj18 = complex13.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1L, 1.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex7.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex16.nthRoot(100);
        boolean boolean21 = complex7.equals((java.lang.Object) complexList20);
        org.apache.commons.math3.complex.Complex complex22 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex2.divide(complex22);
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math3.complex.Complex complex35 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math3.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math3.complex.Complex complex38 = complex2.multiply(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex37", complex36.equals(complex37) ? complex36.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex22.multiply(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex27", complex6.equals(complex27) ? complex6.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex19 = complex13.add((-1.6246037439295014E53d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex46 = complex1.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex44 = complex42.pow(complex43);
        org.apache.commons.math3.complex.Complex complex47 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex51 = complex49.add((double) '#');
        double double52 = complex49.abs();
        org.apache.commons.math3.complex.Complex complex53 = complex49.reciprocal();
        org.apache.commons.math3.complex.Complex complex54 = complex49.tan();
        org.apache.commons.math3.complex.Complex complex55 = complex42.divide(complex49);
        org.apache.commons.math3.complex.Complex complex57 = complex42.pow((double) '4');
        org.apache.commons.math3.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math3.complex.Complex complex59 = complex22.subtract(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex43", complex21.equals(complex43) ? complex21.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.multiply((int) (short) 10);
        org.apache.commons.math3.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex28.divide(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply(0.019999333373330475d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex32", complex21.equals(complex32) ? complex21.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        double double14 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex10.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        double double3 = complex2.getArgument();
        org.apache.commons.math3.complex.Complex complex5 = complex2.subtract(1.0d);
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, (double) 10);
        double double9 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow((double) 100);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) '#');
        double double20 = complex17.abs();
        org.apache.commons.math3.complex.Complex complex21 = complex17.acos();
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math3.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex41 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex43 = complex31.subtract(complex36);
        org.apache.commons.math3.complex.Complex complex44 = complex26.add(complex36);
        org.apache.commons.math3.complex.Complex complex45 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex46 = complex23.divide(complex36);
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex53 = complex51.add((double) '#');
        org.apache.commons.math3.complex.Complex complex54 = complex53.reciprocal();
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex61 = complex59.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList63 = complex59.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex66 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex70 = complex68.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList72 = complex68.nthRoot(100);
        boolean boolean73 = complex59.equals((java.lang.Object) complexList72);
        org.apache.commons.math3.complex.Complex complex74 = complex59.sinh();
        org.apache.commons.math3.complex.Complex complex76 = complex59.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex78 = complex76.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex79 = complex54.subtract(complex76);
        java.lang.Object obj80 = complex76.readResolve();
        org.apache.commons.math3.complex.Complex complex82 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex83 = complex82.sinh();
        double double84 = complex83.getReal();
        org.apache.commons.math3.complex.Complex complex85 = complex76.multiply(complex83);
        org.apache.commons.math3.complex.Complex complex86 = complex46.pow(complex85);
        org.apache.commons.math3.complex.Complex complex87 = complex10.pow(complex86);
        org.apache.commons.math3.complex.Complex complex88 = complex2.multiply(complex86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex23", complex1.equals(complex23) ? complex1.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        double double57 = complex55.getImaginary();
        org.apache.commons.math3.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex62 = complex61.sinh();
        org.apache.commons.math3.complex.Complex complex63 = complex62.sin();
        org.apache.commons.math3.complex.Complex complex65 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean66 = complex65.isInfinite();
        org.apache.commons.math3.complex.Complex complex67 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex70 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex74 = complex72.add((double) '#');
        double double75 = complex72.abs();
        org.apache.commons.math3.complex.Complex complex77 = complex72.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex78 = complex72.negate();
        org.apache.commons.math3.complex.Complex complex79 = complex67.subtract(complex72);
        org.apache.commons.math3.complex.Complex complex80 = complex62.add(complex72);
        org.apache.commons.math3.complex.Complex complex81 = complex72.reciprocal();
        org.apache.commons.math3.complex.Complex complex82 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex84 = complex82.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex85 = complex81.add(complex82);
        boolean boolean86 = complex85.isInfinite();
        org.apache.commons.math3.complex.Complex complex87 = complex85.cosh();
        org.apache.commons.math3.complex.Complex complex88 = complex87.conjugate();
        org.apache.commons.math3.complex.Complex complex89 = complex58.pow(complex87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex59", complex58.equals(complex59) ? complex58.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField25 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex26 = complex11.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex27 = complex4.divide(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex1.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        double double36 = complex33.abs();
        org.apache.commons.math3.complex.Complex complex37 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        double double47 = complex44.abs();
        org.apache.commons.math3.complex.Complex complex49 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex44.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex52 = complex39.subtract(complex51);
        boolean boolean53 = complex26.equals((java.lang.Object) complex51);
        org.apache.commons.math3.complex.Complex complex54 = complex26.log();
        org.apache.commons.math3.complex.Complex complex55 = complex54.tanh();
        org.apache.commons.math3.complex.Complex complex56 = complex55.acos();
        org.apache.commons.math3.complex.Complex complex57 = complex56.asin();
        org.apache.commons.math3.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex65 = complex63.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList67 = complex63.nthRoot((int) '#');
        boolean boolean68 = complex63.isNaN();
        org.apache.commons.math3.complex.Complex complex71 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        boolean boolean74 = complex73.isNaN();
        double double75 = complex73.getReal();
        org.apache.commons.math3.complex.Complex complex76 = complex63.subtract(complex73);
        org.apache.commons.math3.complex.Complex complex78 = complex73.subtract((double) (short) 1);
        boolean boolean79 = complex78.isNaN();
        org.apache.commons.math3.complex.Complex complex81 = complex78.multiply(14.142135623730951d);
        org.apache.commons.math3.complex.Complex complex82 = complex57.add(complex81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex76", complex39.equals(complex76) ? complex39.hashCode() == complex76.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.log();
        org.apache.commons.math3.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex6 = complex3.createComplex(9.999E7d, Double.NaN);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math3.complex.Complex complex13 = complex11.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex13.nthRoot((int) (short) 100);
        boolean boolean17 = complex13.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        double double25 = complex22.abs();
        org.apache.commons.math3.complex.Complex complex26 = complex22.acos();
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex29 = complex13.pow(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex6.multiply(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex28", complex0.equals(complex28) ? complex0.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex17.divide(10000.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex26.multiply((-1));
        org.apache.commons.math3.complex.Complex complex31 = complex20.pow(complex26);
        org.apache.commons.math3.complex.Complex complex32 = complex26.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex35 = complex32.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex34", complex17.equals(complex34) ? complex17.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex10.subtract(complex22);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex33 = complex31.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex31.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex40.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList44 = complex40.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField45 = complex40.getField();
        org.apache.commons.math3.complex.Complex complex46 = complex31.multiply(complex40);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex48 = complex46.pow(complex47);
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex55 = complex53.add((double) '#');
        double double56 = complex53.abs();
        org.apache.commons.math3.complex.Complex complex57 = complex53.reciprocal();
        org.apache.commons.math3.complex.Complex complex58 = complex53.tan();
        org.apache.commons.math3.complex.Complex complex59 = complex46.divide(complex53);
        org.apache.commons.math3.complex.Complex complex61 = complex46.pow((double) '4');
        org.apache.commons.math3.complex.Complex complex62 = complex46.tanh();
        double double63 = complex46.getImaginary();
        org.apache.commons.math3.complex.Complex complex64 = complex26.subtract(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex47", complex10.equals(complex47) ? complex10.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        double double14 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex17 = complex15.add(9903.50488463554d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        java.lang.Object obj30 = complex29.readResolve();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex31", complex29.equals(complex31) ? complex29.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = complex17.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex28 = complex25.multiply((int) (short) 10);
        org.apache.commons.math3.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math3.complex.Complex complex32 = complex28.divide(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex33 = complex32.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex32", complex21.equals(complex32) ? complex21.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        double double35 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex4.add(complex36);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        double double46 = complex43.abs();
        org.apache.commons.math3.complex.Complex complex47 = complex43.acos();
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex52 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex56 = complex54.add((double) '#');
        org.apache.commons.math3.complex.Complex complex57 = complex56.reciprocal();
        double double58 = complex56.getArgument();
        org.apache.commons.math3.complex.Complex complex59 = complex47.pow(complex56);
        org.apache.commons.math3.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math3.complex.ComplexField complexField61 = complex59.getField();
        boolean boolean62 = complex4.equals((java.lang.Object) complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex49", complex21.equals(complex49) ? complex21.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField14 = complex13.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math3.complex.Complex complex45 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex46 = complex45.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex15 = complex14.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex17 = complex1.pow(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math3.complex.Complex complex14 = complex11.subtract((-9.999000099990003E-7d));
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex14.divide(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply(0);
        org.apache.commons.math3.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex13 = complex10.divide(10000.0d);
        boolean boolean14 = complex10.isInfinite();
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex19.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex19.nthRoot((int) '#');
        boolean boolean24 = complex19.isNaN();
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        boolean boolean30 = complex29.isNaN();
        double double31 = complex29.getReal();
        org.apache.commons.math3.complex.Complex complex32 = complex19.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex34 = complex29.subtract((double) (short) 1);
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math3.complex.Complex complex37 = complex34.multiply((double) ' ');
        org.apache.commons.math3.complex.Complex complex39 = complex34.multiply((-100.0d));
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList48 = complex44.nthRoot((int) '#');
        boolean boolean49 = complex44.isNaN();
        org.apache.commons.math3.complex.Complex complex52 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        boolean boolean55 = complex54.isNaN();
        double double56 = complex54.getReal();
        org.apache.commons.math3.complex.Complex complex57 = complex44.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex59 = complex54.subtract((double) (short) 1);
        boolean boolean60 = complex59.isNaN();
        org.apache.commons.math3.complex.Complex complex61 = complex39.subtract(complex59);
        org.apache.commons.math3.complex.Complex complex63 = org.apache.commons.math3.complex.Complex.valueOf((-100.0d));
        org.apache.commons.math3.complex.Complex complex64 = complex61.divide(complex63);
        org.apache.commons.math3.complex.Complex complex65 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex68 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex68.conjugate();
        org.apache.commons.math3.complex.Complex complex70 = complex65.subtract(complex69);
        org.apache.commons.math3.complex.Complex complex71 = complex70.tan();
        org.apache.commons.math3.complex.Complex complex72 = complex70.tanh();
        org.apache.commons.math3.complex.Complex complex73 = complex70.asin();
        org.apache.commons.math3.complex.Complex complex74 = complex73.reciprocal();
        org.apache.commons.math3.complex.Complex complex75 = complex64.divide(complex74);
        org.apache.commons.math3.complex.Complex complex76 = complex10.add(complex64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex32", complex10.equals(complex32) ? complex10.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        boolean boolean10 = complex4.isInfinite();
        double double11 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) '#');
        org.apache.commons.math3.complex.Complex complex19 = complex18.reciprocal();
        double double20 = complex18.getArgument();
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) '#');
        double double28 = complex25.abs();
        org.apache.commons.math3.complex.Complex complex29 = complex25.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex41 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex36.negate();
        org.apache.commons.math3.complex.Complex complex43 = complex36.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex31.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex45 = complex43.cos();
        boolean boolean46 = complex18.equals((java.lang.Object) complex43);
        org.apache.commons.math3.complex.Complex complex48 = complex43.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex49 = complex48.sqrt();
        org.apache.commons.math3.complex.Complex complex50 = complex4.multiply(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex49", complex31.equals(complex49) ? complex31.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math3.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math3.complex.Complex complex16 = complex12.acos();
        org.apache.commons.math3.complex.Complex complex19 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex23 = complex21.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex21.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField35 = complex30.getField();
        org.apache.commons.math3.complex.Complex complex36 = complex21.multiply(complex30);
        org.apache.commons.math3.complex.Complex complex37 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex38 = complex36.pow(complex37);
        org.apache.commons.math3.complex.Complex complex41 = complex36.createComplex(0.009964792234706478d, (double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex43 = complex36.divide((double) (byte) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex16.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex45 = complex8.subtract(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex37", complex10.equals(complex37) ? complex10.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        org.apache.commons.math3.complex.Complex complex35 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean38 = complex37.isInfinite();
        org.apache.commons.math3.complex.Complex complex39 = complex37.tan();
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList48 = complex44.nthRoot((int) '#');
        boolean boolean49 = complex44.isNaN();
        org.apache.commons.math3.complex.Complex complex52 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        boolean boolean55 = complex54.isNaN();
        double double56 = complex54.getReal();
        org.apache.commons.math3.complex.Complex complex57 = complex44.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex60 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex62 = complex60.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex64 = complex62.add((double) '#');
        org.apache.commons.math3.complex.Complex complex65 = complex44.multiply(complex62);
        org.apache.commons.math3.complex.Complex complex66 = complex62.sin();
        org.apache.commons.math3.complex.Complex complex67 = complex62.cos();
        org.apache.commons.math3.complex.Complex complex70 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex74 = complex72.add((double) '#');
        double double75 = complex72.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList77 = complex72.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex62.multiply(complex72);
        org.apache.commons.math3.complex.Complex complex79 = complex37.add(complex78);
        org.apache.commons.math3.complex.Complex complex80 = complex37.tanh();
        org.apache.commons.math3.complex.Complex complex81 = complex80.asin();
        java.lang.Object obj82 = complex80.readResolve();
        org.apache.commons.math3.complex.Complex complex83 = complex80.conjugate();
        org.apache.commons.math3.complex.Complex complex84 = complex35.divide(complex83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex80 and complex83", complex80.equals(complex83) ? complex80.hashCode() == complex83.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 1L, 1.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex7.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex16.nthRoot(100);
        boolean boolean21 = complex7.equals((java.lang.Object) complexList20);
        org.apache.commons.math3.complex.Complex complex22 = complex7.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex22.subtract((double) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex22.negate();
        org.apache.commons.math3.complex.Complex complex26 = complex22.reciprocal();
        org.apache.commons.math3.complex.Complex complex27 = complex2.divide(complex22);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply(1);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) '#');
        double double37 = complex34.abs();
        org.apache.commons.math3.complex.Complex complex38 = complex34.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex47 = complex45.add((double) '#');
        org.apache.commons.math3.complex.Complex complex48 = complex47.reciprocal();
        double double49 = complex47.getArgument();
        org.apache.commons.math3.complex.Complex complex50 = complex38.pow(complex47);
        org.apache.commons.math3.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math3.complex.ComplexField complexField52 = complex50.getField();
        boolean boolean53 = complex29.equals((java.lang.Object) complexField52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex40", complex26.equals(complex40) ? complex26.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math3.complex.Complex complex20 = complex17.divide(10000.0d);
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex26.multiply((-1));
        org.apache.commons.math3.complex.Complex complex31 = complex20.pow(complex26);
        org.apache.commons.math3.complex.Complex complex32 = complex26.sqrt1z();
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex37 = complex34.createComplex(9.999000099990002E-5d, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex34", complex17.equals(complex34) ? complex17.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.log();
        org.apache.commons.math3.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex2.createComplex(0.0d, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex6 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex7 = complex2.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.log();
        org.apache.commons.math3.complex.Complex complex2 = complex1.reciprocal();
        org.apache.commons.math3.complex.Complex complex5 = complex2.createComplex(0.0d, (double) 10.0f);
        org.apache.commons.math3.complex.Complex complex6 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex9 = complex2.createComplex(9.997000499930008E-11d, (double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex27 = complex26.log();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        double double35 = complex32.abs();
        org.apache.commons.math3.complex.Complex complex36 = complex32.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        org.apache.commons.math3.complex.Complex complex46 = complex45.reciprocal();
        double double47 = complex45.getArgument();
        org.apache.commons.math3.complex.Complex complex48 = complex36.pow(complex45);
        double double49 = complex48.getArgument();
        org.apache.commons.math3.complex.Complex complex52 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex56 = complex54.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList58 = complex54.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex65 = complex63.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList67 = complex63.nthRoot(100);
        boolean boolean68 = complex54.equals((java.lang.Object) complexList67);
        org.apache.commons.math3.complex.Complex complex69 = complex54.sinh();
        org.apache.commons.math3.complex.Complex complex71 = complex54.pow((double) 100.0f);
        double double72 = complex71.abs();
        org.apache.commons.math3.complex.Complex complex75 = org.apache.commons.math3.complex.Complex.valueOf((double) 10L, (double) ' ');
        org.apache.commons.math3.complex.Complex complex76 = complex75.cosh();
        org.apache.commons.math3.complex.Complex complex77 = complex75.conjugate();
        org.apache.commons.math3.complex.Complex complex78 = complex75.tan();
        org.apache.commons.math3.complex.Complex complex79 = complex71.add(complex78);
        org.apache.commons.math3.complex.Complex complex80 = complex48.pow(complex71);
        org.apache.commons.math3.complex.Complex complex81 = complex27.divide(complex71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex38", complex17.equals(complex38) ? complex17.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double17 = complex16.getReal();
        boolean boolean18 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex19.createComplex(0.019999333373330475d, (double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex25 = complex19.conjugate();
        double double26 = complex19.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double11 = complex10.getReal();
        boolean boolean12 = complex10.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex4.add(complex13);
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean21 = complex20.isInfinite();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        double double30 = complex27.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex33 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex22.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex35 = complex17.add(complex27);
        double double36 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex50.nthRoot(100);
        boolean boolean55 = complex41.equals((java.lang.Object) complexList54);
        java.lang.String str56 = complex41.toString();
        org.apache.commons.math3.complex.Complex complex57 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex60 = complex58.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex63 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex67 = complex65.add((double) '#');
        double double68 = complex65.abs();
        org.apache.commons.math3.complex.Complex complex69 = complex65.reciprocal();
        org.apache.commons.math3.complex.Complex complex70 = complex58.add(complex69);
        boolean boolean71 = complex41.equals((java.lang.Object) complex70);
        double double72 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex74 = complex73.acos();
        org.apache.commons.math3.complex.Complex complex75 = complex41.add(complex73);
        org.apache.commons.math3.complex.Complex complex76 = complex73.sinh();
        org.apache.commons.math3.complex.Complex complex77 = complex17.multiply(complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex14.pow(complex77);
        org.apache.commons.math3.complex.Complex complex79 = complex14.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex78", complex58.equals(complex78) ? complex58.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.atan();
        org.apache.commons.math3.complex.Complex complex32 = complex27.pow((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex35 = complex32.multiply(0.982316014494979d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex33", complex27.equals(complex33) ? complex27.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math3.complex.Complex complex3 = complex1.multiply(3.1315929884994405d);
        org.apache.commons.math3.complex.Complex complex5 = complex1.multiply((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply(1.5707963268948766d);
        org.apache.commons.math3.complex.Complex complex9 = complex1.subtract(complex6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math3.complex.Complex complex2 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex7.nthRoot((int) '#');
        boolean boolean12 = complex7.isNaN();
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        boolean boolean18 = complex17.isNaN();
        double double19 = complex17.getReal();
        org.apache.commons.math3.complex.Complex complex20 = complex7.subtract(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math3.complex.Complex complex23 = complex20.divide(10000.0d);
        org.apache.commons.math3.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex33 = complex29.multiply((-1));
        org.apache.commons.math3.complex.Complex complex34 = complex23.pow(complex29);
        org.apache.commons.math3.complex.Complex complex35 = complex29.sqrt1z();
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((int) (short) 0);
        org.apache.commons.math3.complex.Complex complex38 = complex2.add(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex37", complex20.equals(complex37) ? complex20.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math3.complex.Complex complex23 = complex22.asin();
        double double24 = complex23.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex4.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract((-3.1315935740238547d));
        boolean boolean28 = complex27.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        double double36 = complex33.abs();
        org.apache.commons.math3.complex.Complex complex37 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) (short) 0);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex39.nthRoot((int) 'a');
        org.apache.commons.math3.complex.Complex complex42 = complex27.divide(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex39", complex22.equals(complex39) ? complex22.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double17 = complex16.getReal();
        boolean boolean18 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex19.createComplex(0.019999333373330475d, (double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex25 = complex19.conjugate();
        org.apache.commons.math3.complex.Complex complex26 = complex25.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        java.lang.Object obj32 = complex29.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex27.asin();
        double double29 = complex27.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex28", complex17.equals(complex28) ? complex17.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex26 = complex23.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex32.nthRoot((int) '#');
        boolean boolean37 = complex32.isNaN();
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        boolean boolean43 = complex42.isNaN();
        double double44 = complex42.getReal();
        org.apache.commons.math3.complex.Complex complex45 = complex32.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        org.apache.commons.math3.complex.Complex complex53 = complex45.add(complex50);
        org.apache.commons.math3.complex.Complex complex54 = complex53.acos();
        org.apache.commons.math3.complex.Complex complex55 = complex54.asin();
        org.apache.commons.math3.complex.Complex complex58 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex62 = complex60.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList64 = complex60.nthRoot((int) '#');
        boolean boolean65 = complex60.isNaN();
        org.apache.commons.math3.complex.Complex complex68 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex70 = complex68.multiply((int) (byte) 100);
        boolean boolean71 = complex70.isNaN();
        double double72 = complex70.getReal();
        org.apache.commons.math3.complex.Complex complex73 = complex60.subtract(complex70);
        org.apache.commons.math3.complex.Complex complex76 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex80 = complex78.add((double) '#');
        org.apache.commons.math3.complex.Complex complex81 = complex73.add(complex78);
        double double82 = complex81.getReal();
        org.apache.commons.math3.complex.Complex complex84 = complex81.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex86 = complex81.add((-1.0d));
        boolean boolean87 = complex86.isInfinite();
        org.apache.commons.math3.complex.Complex complex88 = complex54.pow(complex86);
        org.apache.commons.math3.complex.Complex complex89 = complex27.multiply(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex45", complex10.equals(complex45) ? complex10.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex26 = complex23.asin();
        org.apache.commons.math3.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList36 = complex32.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot(100);
        boolean boolean46 = complex32.equals((java.lang.Object) complexList45);
        java.lang.String str47 = complex32.toString();
        org.apache.commons.math3.complex.Complex complex48 = complex32.sqrt1z();
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex51 = complex49.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex56.add((double) '#');
        double double59 = complex56.abs();
        org.apache.commons.math3.complex.Complex complex60 = complex56.reciprocal();
        org.apache.commons.math3.complex.Complex complex61 = complex49.add(complex60);
        boolean boolean62 = complex32.equals((java.lang.Object) complex61);
        org.apache.commons.math3.complex.Complex complex63 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex65 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean66 = complex65.isInfinite();
        org.apache.commons.math3.complex.Complex complex67 = complex65.tan();
        org.apache.commons.math3.complex.Complex complex70 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex74 = complex72.add((double) '#');
        double double75 = complex72.abs();
        org.apache.commons.math3.complex.Complex complex77 = complex72.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex78 = complex72.negate();
        org.apache.commons.math3.complex.Complex complex79 = complex67.subtract(complex72);
        org.apache.commons.math3.complex.Complex complex80 = complex32.add(complex79);
        org.apache.commons.math3.complex.Complex complex82 = complex79.subtract(2000000.0d);
        org.apache.commons.math3.complex.Complex complex83 = complex26.add(complex79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex49", complex10.equals(complex49) ? complex10.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex4.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex4.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex28.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex28", complex22.equals(complex28) ? complex22.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        double double35 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex4.add(complex36);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex43.nthRoot((int) '#');
        boolean boolean48 = complex43.isNaN();
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        boolean boolean54 = complex53.isNaN();
        double double55 = complex53.getReal();
        org.apache.commons.math3.complex.Complex complex56 = complex43.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex63 = complex61.add((double) '#');
        org.apache.commons.math3.complex.Complex complex64 = complex43.multiply(complex61);
        org.apache.commons.math3.complex.Complex complex65 = complex43.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply(0);
        org.apache.commons.math3.complex.Complex complex69 = complex68.negate();
        org.apache.commons.math3.complex.Complex complex70 = complex36.subtract(complex68);
        org.apache.commons.math3.complex.Complex complex71 = complex68.asin();
        org.apache.commons.math3.complex.Complex complex72 = complex68.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex71", complex21.equals(complex71) ? complex21.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math3.complex.Complex complex23 = complex19.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex50.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField55 = complex50.getField();
        org.apache.commons.math3.complex.Complex complex56 = complex41.multiply(complex50);
        org.apache.commons.math3.complex.Complex complex57 = complex34.divide(complex56);
        org.apache.commons.math3.complex.Complex complex58 = complex31.subtract(complex56);
        org.apache.commons.math3.complex.Complex complex61 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex65 = complex63.add((double) '#');
        double double66 = complex63.abs();
        org.apache.commons.math3.complex.Complex complex67 = complex63.acos();
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex72 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex74 = complex72.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex76 = complex74.add((double) '#');
        double double77 = complex74.abs();
        org.apache.commons.math3.complex.Complex complex79 = complex74.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex80 = complex74.negate();
        org.apache.commons.math3.complex.Complex complex81 = complex74.conjugate();
        org.apache.commons.math3.complex.Complex complex82 = complex69.subtract(complex81);
        boolean boolean83 = complex56.equals((java.lang.Object) complex81);
        org.apache.commons.math3.complex.Complex complex84 = complex28.multiply(complex81);
        org.apache.commons.math3.complex.Complex complex86 = complex28.add((double) 1L);
        org.apache.commons.math3.complex.Complex complex87 = complex86.acos();
        org.apache.commons.math3.complex.Complex complex88 = complex23.multiply(complex87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex69", complex20.equals(complex69) ? complex20.hashCode() == complex69.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        double double35 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex4.add(complex36);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex43.nthRoot((int) '#');
        boolean boolean48 = complex43.isNaN();
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        boolean boolean54 = complex53.isNaN();
        double double55 = complex53.getReal();
        org.apache.commons.math3.complex.Complex complex56 = complex43.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex63 = complex61.add((double) '#');
        org.apache.commons.math3.complex.Complex complex64 = complex43.multiply(complex61);
        org.apache.commons.math3.complex.Complex complex65 = complex43.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply(0);
        org.apache.commons.math3.complex.Complex complex69 = complex68.negate();
        org.apache.commons.math3.complex.Complex complex70 = complex36.subtract(complex68);
        org.apache.commons.math3.complex.Complex complex71 = complex68.asin();
        double double72 = complex71.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex71", complex21.equals(complex71) ? complex21.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        double double10 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex15.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex24.nthRoot(100);
        boolean boolean29 = complex15.equals((java.lang.Object) complexList28);
        org.apache.commons.math3.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex4.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex35.reciprocal();
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math3.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex38.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex39", complex34.equals(complex39) ? complex34.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) (short) -1);
        boolean boolean18 = complex15.isInfinite();
        org.apache.commons.math3.complex.Complex complex20 = complex15.divide((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex25.nthRoot((int) '#');
        boolean boolean30 = complex25.isNaN();
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        boolean boolean36 = complex35.isNaN();
        double double37 = complex35.getReal();
        org.apache.commons.math3.complex.Complex complex38 = complex25.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        org.apache.commons.math3.complex.Complex complex46 = complex38.add(complex43);
        double double47 = complex46.getReal();
        org.apache.commons.math3.complex.Complex complex49 = complex46.subtract((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex50 = complex49.tan();
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex57 = complex55.add((double) '#');
        double double58 = complex55.abs();
        org.apache.commons.math3.complex.Complex complex60 = complex55.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex63 = complex60.createComplex((double) (-1.0f), 0.0d);
        org.apache.commons.math3.complex.Complex complex64 = complex60.reciprocal();
        org.apache.commons.math3.complex.Complex complex65 = complex50.multiply(complex60);
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math3.complex.Complex complex68 = complex15.add(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex38", complex15.equals(complex38) ? complex15.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math3.complex.Complex complex10 = complex8.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex9", complex8.equals(complex9) ? complex8.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math3.complex.Complex complex58 = complex57.asin();
        org.apache.commons.math3.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math3.complex.Complex complex60 = complex58.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField61 = complex60.getField();
        org.apache.commons.math3.complex.Complex complex64 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex66 = complex64.multiply((int) (byte) 100);
        boolean boolean67 = complex66.isNaN();
        org.apache.commons.math3.complex.Complex complex68 = complex66.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList70 = complex68.nthRoot((int) (short) 100);
        boolean boolean72 = complex68.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex75 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex77 = complex75.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex79 = complex77.add((double) '#');
        double double80 = complex77.abs();
        org.apache.commons.math3.complex.Complex complex81 = complex77.acos();
        org.apache.commons.math3.complex.Complex complex83 = complex81.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex84 = complex68.pow(complex81);
        org.apache.commons.math3.complex.Complex complex87 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex88 = complex84.pow(complex87);
        org.apache.commons.math3.complex.Complex complex90 = complex87.divide((-9.903537547537045d));
        org.apache.commons.math3.complex.Complex complex92 = complex90.multiply((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex93 = complex60.subtract(complex92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex83", complex17.equals(complex83) ? complex17.hashCode() == complex83.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        double double57 = complex55.getImaginary();
        org.apache.commons.math3.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex60 = complex58.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex59", complex58.equals(complex59) ? complex58.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex21 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex26 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math3.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        double double35 = complex4.getArgument();
        org.apache.commons.math3.complex.Complex complex36 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math3.complex.Complex complex38 = complex4.add(complex36);
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex43.nthRoot((int) '#');
        boolean boolean48 = complex43.isNaN();
        org.apache.commons.math3.complex.Complex complex51 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        boolean boolean54 = complex53.isNaN();
        double double55 = complex53.getReal();
        org.apache.commons.math3.complex.Complex complex56 = complex43.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex63 = complex61.add((double) '#');
        org.apache.commons.math3.complex.Complex complex64 = complex43.multiply(complex61);
        org.apache.commons.math3.complex.Complex complex65 = complex43.sqrt();
        org.apache.commons.math3.complex.Complex complex66 = complex65.tanh();
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply(0);
        org.apache.commons.math3.complex.Complex complex69 = complex68.negate();
        org.apache.commons.math3.complex.Complex complex70 = complex36.subtract(complex68);
        org.apache.commons.math3.complex.Complex complex71 = complex68.asin();
        org.apache.commons.math3.complex.Complex complex72 = complex68.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex71", complex21.equals(complex71) ? complex21.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math3.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex20.divide(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex17.subtract(complex42);
        double double45 = complex42.getReal();
        double double46 = complex42.abs();
        org.apache.commons.math3.complex.ComplexField complexField47 = complex42.getField();
        org.apache.commons.math3.complex.Complex complex48 = complex14.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex49 = complex42.cos();
        org.apache.commons.math3.complex.Complex complex51 = complex42.multiply((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math3.complex.Complex complex57 = complex51.divide(complex56);
        org.apache.commons.math3.complex.Complex complex58 = complex51.cosh();
        org.apache.commons.math3.complex.Complex complex60 = complex51.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex61 = complex51.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex60", complex15.equals(complex60) ? complex15.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex4 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex6 = complex1.divide((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex6.pow(complex9);
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((-100.0d));
        org.apache.commons.math3.complex.Complex complex15 = complex14.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex9.add(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex4.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex4.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        boolean boolean29 = complex27.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex28", complex22.equals(complex28) ? complex22.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex28 = complex27.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex27", complex6.equals(complex27) ? complex6.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex9 = complex4.divide((double) 'a');
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex10.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math3.complex.Complex complex17 = complex9.multiply(complex16);
        org.apache.commons.math3.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex25 = complex23.add((double) '#');
        double double26 = complex23.abs();
        org.apache.commons.math3.complex.Complex complex27 = complex23.acos();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) '#');
        double double37 = complex34.abs();
        org.apache.commons.math3.complex.Complex complex39 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex40 = complex34.negate();
        org.apache.commons.math3.complex.Complex complex41 = complex34.conjugate();
        org.apache.commons.math3.complex.Complex complex42 = complex29.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex43 = complex41.cos();
        org.apache.commons.math3.complex.Complex complex44 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex45 = complex18.pow(complex44);
        org.apache.commons.math3.complex.Complex complex47 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex48 = complex47.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex45.pow(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex47 and complex48", complex47.equals(complex48) ? complex47.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.multiply((-1));
        boolean boolean9 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex13 = complex10.acos();
        double double14 = complex10.getImaginary();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math3.complex.Complex complex18 = complex10.divide(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math3.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex30 = complex26.multiply((-1));
        boolean boolean31 = complex26.isInfinite();
        org.apache.commons.math3.complex.Complex complex32 = complex26.acos();
        org.apache.commons.math3.complex.Complex complex33 = complex20.multiply(complex32);
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex40 = complex38.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex49 = complex47.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList51 = complex47.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField52 = complex47.getField();
        org.apache.commons.math3.complex.Complex complex53 = complex38.multiply(complex47);
        org.apache.commons.math3.complex.Complex complex56 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex60 = complex58.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList62 = complex58.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex65 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex69 = complex67.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList71 = complex67.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField72 = complex67.getField();
        org.apache.commons.math3.complex.Complex complex73 = complex58.multiply(complex67);
        org.apache.commons.math3.complex.Complex complex74 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex75 = complex73.pow(complex74);
        org.apache.commons.math3.complex.Complex complex76 = complex53.pow(complex73);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList78 = complex76.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex79 = complex76.acos();
        org.apache.commons.math3.complex.Complex complex80 = complex20.pow(complex79);
        org.apache.commons.math3.complex.Complex complex81 = complex20.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField82 = complex81.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex81", complex20.equals(complex81) ? complex20.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex4.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex4.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex28.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex28", complex22.equals(complex28) ? complex22.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.tanh();
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) '#');
        double double38 = complex35.abs();
        org.apache.commons.math3.complex.Complex complex39 = complex35.acos();
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex44 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex48 = complex46.add((double) '#');
        double double49 = complex46.abs();
        org.apache.commons.math3.complex.Complex complex51 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex46.negate();
        org.apache.commons.math3.complex.Complex complex53 = complex46.conjugate();
        org.apache.commons.math3.complex.Complex complex54 = complex41.subtract(complex53);
        double double55 = complex41.getImaginary();
        org.apache.commons.math3.complex.Complex complex56 = complex41.cos();
        org.apache.commons.math3.complex.Complex complex57 = complex41.acos();
        org.apache.commons.math3.complex.Complex complex58 = complex30.divide(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex41", complex17.equals(complex41) ? complex17.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math3.complex.Complex complex34 = complex30.createComplex((-1.5697866205873507d), (-1.3640905463354944d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex31", complex30.equals(complex31) ? complex30.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField25 = complex20.getField();
        org.apache.commons.math3.complex.Complex complex26 = complex11.multiply(complex20);
        org.apache.commons.math3.complex.Complex complex27 = complex4.divide(complex26);
        org.apache.commons.math3.complex.Complex complex28 = complex1.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        double double36 = complex33.abs();
        org.apache.commons.math3.complex.Complex complex37 = complex33.acos();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        double double47 = complex44.abs();
        org.apache.commons.math3.complex.Complex complex49 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex44.negate();
        org.apache.commons.math3.complex.Complex complex51 = complex44.conjugate();
        org.apache.commons.math3.complex.Complex complex52 = complex39.subtract(complex51);
        boolean boolean53 = complex26.equals((java.lang.Object) complex51);
        org.apache.commons.math3.complex.Complex complex54 = complex26.log();
        org.apache.commons.math3.complex.Complex complex55 = complex54.tanh();
        org.apache.commons.math3.complex.Complex complex56 = complex55.acos();
        org.apache.commons.math3.complex.Complex complex57 = complex56.asin();
        org.apache.commons.math3.complex.Complex complex59 = complex57.pow((double) (byte) 100);
        org.apache.commons.math3.complex.Complex complex60 = complex59.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex59", complex39.equals(complex59) ? complex39.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex3 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = complex0.subtract(complex4);
        org.apache.commons.math3.complex.Complex complex6 = complex5.tan();
        org.apache.commons.math3.complex.Complex complex7 = complex5.tanh();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math3.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex48.sin();
        org.apache.commons.math3.complex.Complex complex53 = complex48.cos();
        org.apache.commons.math3.complex.Complex complex54 = complex22.subtract(complex53);
        org.apache.commons.math3.complex.Complex complex55 = complex7.subtract(complex54);
        org.apache.commons.math3.complex.Complex complex58 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex62 = complex60.add((double) '#');
        double double63 = complex60.abs();
        org.apache.commons.math3.complex.Complex complex64 = complex60.acos();
        org.apache.commons.math3.complex.Complex complex66 = complex64.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex69 = complex66.createComplex((double) ' ', (double) 0.0f);
        double double70 = complex66.abs();
        org.apache.commons.math3.complex.Complex complex71 = complex66.sqrt();
        org.apache.commons.math3.complex.Complex complex72 = complex7.subtract(complex71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex66", complex25.equals(complex66) ? complex25.hashCode() == complex66.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        double double14 = complex10.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt();
        java.lang.Object obj16 = complex15.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.atan();
        org.apache.commons.math3.complex.Complex complex32 = complex27.pow((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex32.createComplex(Double.NEGATIVE_INFINITY, (-9.999000099990003E-7d));
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex40.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList44 = complex40.nthRoot((int) '#');
        boolean boolean45 = complex40.isNaN();
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        boolean boolean51 = complex50.isNaN();
        double double52 = complex50.getReal();
        org.apache.commons.math3.complex.Complex complex53 = complex40.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex56 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex60 = complex58.add((double) '#');
        org.apache.commons.math3.complex.Complex complex61 = complex53.add(complex58);
        org.apache.commons.math3.complex.Complex complex62 = complex53.negate();
        org.apache.commons.math3.complex.Complex complex63 = complex32.multiply(complex62);
        org.apache.commons.math3.complex.Complex complex66 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex70 = complex68.add((double) '#');
        double double71 = complex68.abs();
        org.apache.commons.math3.complex.Complex complex73 = complex68.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex74 = complex73.exp();
        org.apache.commons.math3.complex.Complex complex76 = complex74.subtract((-9.999000099990003E-7d));
        boolean boolean77 = complex62.equals((java.lang.Object) complex74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex63", complex17.equals(complex63) ? complex17.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex25.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex34.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField39 = complex34.getField();
        org.apache.commons.math3.complex.Complex complex40 = complex25.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex41 = complex18.divide(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex15.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex49 = complex47.add((double) '#');
        double double50 = complex47.abs();
        org.apache.commons.math3.complex.Complex complex51 = complex47.acos();
        org.apache.commons.math3.complex.Complex complex53 = complex51.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex56 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex60 = complex58.add((double) '#');
        double double61 = complex58.abs();
        org.apache.commons.math3.complex.Complex complex63 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex64 = complex58.negate();
        org.apache.commons.math3.complex.Complex complex65 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex66 = complex53.subtract(complex65);
        boolean boolean67 = complex40.equals((java.lang.Object) complex65);
        org.apache.commons.math3.complex.Complex complex68 = complex40.log();
        org.apache.commons.math3.complex.Complex complex69 = complex68.tanh();
        org.apache.commons.math3.complex.Complex complex70 = complex69.reciprocal();
        boolean boolean71 = complex12.equals((java.lang.Object) complex69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean25 = complex24.isInfinite();
        org.apache.commons.math3.complex.Complex complex26 = complex24.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex24.asin();
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex30 = complex27.sqrt1z();
        org.apache.commons.math3.complex.Complex complex31 = complex27.reciprocal();
        org.apache.commons.math3.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex34.sinh();
        double double36 = complex35.getReal();
        org.apache.commons.math3.complex.Complex complex37 = complex35.sqrt1z();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double40 = complex39.getReal();
        boolean boolean41 = complex39.isInfinite();
        org.apache.commons.math3.complex.Complex complex42 = complex35.divide(complex39);
        org.apache.commons.math3.complex.Complex complex45 = complex42.createComplex(0.019999333373330475d, (double) 'a');
        org.apache.commons.math3.complex.Complex complex46 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex47 = complex31.subtract(complex42);
        org.apache.commons.math3.complex.Complex complex48 = complex42.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex19.pow(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex42 and complex48", complex42.equals(complex48) ? complex42.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        double double29 = complex26.abs();
        org.apache.commons.math3.complex.Complex complex30 = complex26.reciprocal();
        org.apache.commons.math3.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex19.divide(complex26);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean35 = complex34.isInfinite();
        org.apache.commons.math3.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math3.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math3.complex.Complex complex62 = complex41.multiply(complex59);
        org.apache.commons.math3.complex.Complex complex63 = complex59.sin();
        org.apache.commons.math3.complex.Complex complex64 = complex59.cos();
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) '#');
        double double72 = complex69.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList74 = complex69.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex75 = complex59.multiply(complex69);
        org.apache.commons.math3.complex.Complex complex76 = complex34.add(complex75);
        org.apache.commons.math3.complex.Complex complex77 = complex26.subtract(complex75);
        double double78 = complex26.getImaginary();
        boolean boolean79 = complex26.isNaN();
        org.apache.commons.math3.complex.Complex complex81 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean82 = complex81.isInfinite();
        org.apache.commons.math3.complex.Complex complex83 = complex81.tan();
        org.apache.commons.math3.complex.Complex complex84 = complex81.asin();
        org.apache.commons.math3.complex.Complex complex86 = complex84.subtract((double) (byte) 0);
        double double87 = complex84.getArgument();
        org.apache.commons.math3.complex.Complex complex89 = complex84.multiply((double) (byte) 0);
        boolean boolean90 = complex26.equals((java.lang.Object) complex89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex89", complex20.equals(complex89) ? complex20.hashCode() == complex89.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        double double11 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex13 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.add((double) 'a');
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex18 = complex16.conjugate();
        boolean boolean19 = complex18.isInfinite();
        org.apache.commons.math3.complex.Complex complex20 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex1.add(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex26.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex35.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField40 = complex35.getField();
        org.apache.commons.math3.complex.Complex complex41 = complex26.multiply(complex35);
        org.apache.commons.math3.complex.Complex complex44 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex48 = complex46.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList50 = complex46.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex57 = complex55.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList59 = complex55.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField60 = complex55.getField();
        org.apache.commons.math3.complex.Complex complex61 = complex46.multiply(complex55);
        org.apache.commons.math3.complex.Complex complex62 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex63 = complex61.pow(complex62);
        org.apache.commons.math3.complex.Complex complex64 = complex41.pow(complex61);
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList73 = complex69.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex76 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex80 = complex78.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList82 = complex78.nthRoot(100);
        boolean boolean83 = complex69.equals((java.lang.Object) complexList82);
        org.apache.commons.math3.complex.Complex complex84 = complex69.sinh();
        org.apache.commons.math3.complex.Complex complex86 = complex69.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex88 = complex86.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex89 = complex41.pow(complex88);
        org.apache.commons.math3.complex.Complex complex90 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex91 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex92 = complex18.multiply(complex91);
        org.apache.commons.math3.complex.Complex complex93 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex94 = complex93.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex62 and complex93", complex62.equals(complex93) ? complex62.hashCode() == complex93.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        double double32 = complex31.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex19 = complex15.divide(9999.0d);
        org.apache.commons.math3.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex25.subtract((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex31 = complex25.subtract((-1.0d));
        org.apache.commons.math3.complex.Complex complex32 = complex25.acos();
        org.apache.commons.math3.complex.Complex complex33 = complex25.acos();
        org.apache.commons.math3.complex.Complex complex36 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex38 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex40 = complex38.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList42 = complex38.nthRoot((int) '#');
        boolean boolean43 = complex38.isNaN();
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        boolean boolean49 = complex48.isNaN();
        double double50 = complex48.getReal();
        org.apache.commons.math3.complex.Complex complex51 = complex38.subtract(complex48);
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex56.add((double) '#');
        org.apache.commons.math3.complex.Complex complex59 = complex38.multiply(complex56);
        org.apache.commons.math3.complex.Complex complex60 = complex38.sqrt();
        org.apache.commons.math3.complex.Complex complex61 = complex60.tanh();
        org.apache.commons.math3.complex.Complex complex62 = complex60.acos();
        org.apache.commons.math3.complex.Complex complex65 = complex60.createComplex((double) 10.0f, Double.NaN);
        org.apache.commons.math3.complex.Complex complex66 = complex65.sin();
        org.apache.commons.math3.complex.Complex complex67 = complex66.cosh();
        org.apache.commons.math3.complex.Complex complex68 = complex25.add(complex66);
        org.apache.commons.math3.complex.Complex complex69 = complex25.cos();
        org.apache.commons.math3.complex.Complex complex70 = complex19.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex20", complex15.equals(complex20) ? complex15.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        org.apache.commons.math3.complex.Complex complex10 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex10.pow((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex16.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex16.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex24", complex14.equals(complex24) ? complex14.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math3.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex27 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex34.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList47 = complex43.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField48 = complex43.getField();
        org.apache.commons.math3.complex.Complex complex49 = complex34.multiply(complex43);
        org.apache.commons.math3.complex.Complex complex50 = complex27.divide(complex49);
        org.apache.commons.math3.complex.Complex complex51 = complex24.subtract(complex49);
        double double52 = complex49.getReal();
        double double53 = complex49.abs();
        org.apache.commons.math3.complex.Complex complex54 = complex17.add(complex49);
        org.apache.commons.math3.complex.Complex complex56 = complex49.divide(1.3440585709080679E41d);
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) (-1L));
        org.apache.commons.math3.complex.Complex complex60 = complex57.subtract(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex57.cos();
        double double62 = complex57.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex60 and complex61", complex60.equals(complex61) ? complex60.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = complex0.createComplex((double) (short) 10, (double) (short) -1);
        java.lang.Object obj6 = complex0.readResolve();
        org.apache.commons.math3.complex.Complex complex7 = complex0.tanh();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex12.add((double) '#');
        double double15 = complex12.abs();
        org.apache.commons.math3.complex.Complex complex17 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex12.negate();
        org.apache.commons.math3.complex.Complex complex20 = complex18.add((double) 'a');
        boolean boolean21 = complex20.isInfinite();
        org.apache.commons.math3.complex.Complex complex22 = complex20.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex35.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList48 = complex44.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField49 = complex44.getField();
        org.apache.commons.math3.complex.Complex complex50 = complex35.multiply(complex44);
        org.apache.commons.math3.complex.Complex complex51 = complex28.divide(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex25.subtract(complex50);
        double double53 = complex50.getReal();
        double double54 = complex50.abs();
        org.apache.commons.math3.complex.ComplexField complexField55 = complex50.getField();
        org.apache.commons.math3.complex.Complex complex56 = complex22.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex59 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex63 = complex61.add((double) '#');
        double double64 = complex61.abs();
        org.apache.commons.math3.complex.Complex complex65 = complex61.acos();
        org.apache.commons.math3.complex.Complex complex67 = complex65.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex70 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex74 = complex72.add((double) '#');
        org.apache.commons.math3.complex.Complex complex75 = complex74.reciprocal();
        double double76 = complex74.getArgument();
        org.apache.commons.math3.complex.Complex complex77 = complex65.pow(complex74);
        org.apache.commons.math3.complex.Complex complex78 = complex77.tanh();
        org.apache.commons.math3.complex.Complex complex80 = complex77.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex81 = complex56.pow(complex77);
        org.apache.commons.math3.complex.Complex complex83 = complex77.pow(1.3440585709080678E43d);
        org.apache.commons.math3.complex.Complex complex84 = complex83.asin();
        org.apache.commons.math3.complex.Complex complex85 = complex7.add(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex42.reciprocal();
        boolean boolean45 = complex44.isNaN();
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        double double53 = complex50.abs();
        org.apache.commons.math3.complex.Complex complex54 = complex50.acos();
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex58 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex59 = complex58.sinh();
        org.apache.commons.math3.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math3.complex.Complex complex62 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean63 = complex62.isInfinite();
        org.apache.commons.math3.complex.Complex complex64 = complex62.tan();
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) '#');
        double double72 = complex69.abs();
        org.apache.commons.math3.complex.Complex complex74 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex75 = complex69.negate();
        org.apache.commons.math3.complex.Complex complex76 = complex64.subtract(complex69);
        org.apache.commons.math3.complex.Complex complex77 = complex59.add(complex69);
        org.apache.commons.math3.complex.Complex complex78 = complex69.sin();
        org.apache.commons.math3.complex.Complex complex79 = complex56.divide(complex69);
        org.apache.commons.math3.complex.Complex complex80 = complex56.conjugate();
        org.apache.commons.math3.complex.Complex complex81 = complex44.add(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex56", complex21.equals(complex56) ? complex21.hashCode() == complex56.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math3.complex.Complex complex27 = complex22.tanh();
        org.apache.commons.math3.complex.Complex complex30 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex34 = complex32.add((double) '#');
        org.apache.commons.math3.complex.Complex complex35 = complex34.reciprocal();
        double double36 = complex34.getArgument();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        double double44 = complex41.abs();
        org.apache.commons.math3.complex.Complex complex45 = complex41.acos();
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex50 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex54 = complex52.add((double) '#');
        double double55 = complex52.abs();
        org.apache.commons.math3.complex.Complex complex57 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex59 = complex52.conjugate();
        org.apache.commons.math3.complex.Complex complex60 = complex47.subtract(complex59);
        org.apache.commons.math3.complex.Complex complex61 = complex59.cos();
        boolean boolean62 = complex34.equals((java.lang.Object) complex59);
        org.apache.commons.math3.complex.Complex complex64 = complex59.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex65 = complex64.cosh();
        org.apache.commons.math3.complex.Complex complex68 = complex64.createComplex((-9.89353788085038d), (-0.7853981633974483d));
        org.apache.commons.math3.complex.Complex complex69 = complex22.add(complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex47", complex17.equals(complex47) ? complex17.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math3.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex24 = complex4.multiply((double) (byte) 0);
        org.apache.commons.math3.complex.Complex complex25 = complex4.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex4.multiply((double) 0L);
        org.apache.commons.math3.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math3.complex.Complex complex30 = complex27.multiply(10100.475434354563d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex28", complex22.equals(complex28) ? complex22.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math3.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex24.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList37 = complex33.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField38 = complex33.getField();
        org.apache.commons.math3.complex.Complex complex39 = complex24.multiply(complex33);
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex19.pow(complex39);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList44 = complex42.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex45 = complex42.sqrt();
        org.apache.commons.math3.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex48 = complex45.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex52 = complex51.tan();
        double double53 = complex52.getReal();
        org.apache.commons.math3.complex.Complex complex54 = complex52.atan();
        org.apache.commons.math3.complex.Complex complex55 = complex48.add(complex54);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex58 = complex57.negate();
        org.apache.commons.math3.complex.Complex complex59 = complex58.tan();
        org.apache.commons.math3.complex.Complex complex60 = complex58.cos();
        org.apache.commons.math3.complex.Complex complex61 = complex54.multiply(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex58", complex41.equals(complex58) ? complex41.hashCode() == complex58.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math3.complex.Complex complex58 = complex57.asin();
        org.apache.commons.math3.complex.Complex complex60 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean61 = complex60.isInfinite();
        org.apache.commons.math3.complex.Complex complex62 = complex60.tan();
        org.apache.commons.math3.complex.Complex complex63 = complex60.asin();
        org.apache.commons.math3.complex.Complex complex65 = complex63.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex66 = complex58.subtract(complex63);
        org.apache.commons.math3.complex.Complex complex69 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex73 = complex71.add((double) '#');
        org.apache.commons.math3.complex.Complex complex75 = complex71.subtract((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex78 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex80 = complex78.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex82 = complex80.add((double) '#');
        double double83 = complex80.abs();
        org.apache.commons.math3.complex.Complex complex85 = complex80.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex86 = complex80.negate();
        org.apache.commons.math3.complex.Complex complex88 = complex86.add((double) 'a');
        boolean boolean89 = complex88.isInfinite();
        org.apache.commons.math3.complex.Complex complex90 = complex88.conjugate();
        org.apache.commons.math3.complex.Complex complex91 = complex90.exp();
        boolean boolean92 = complex75.equals((java.lang.Object) complex91);
        org.apache.commons.math3.complex.Complex complex93 = complex75.exp();
        org.apache.commons.math3.complex.Complex complex94 = complex66.pow(complex75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex91", complex17.equals(complex91) ? complex17.hashCode() == complex91.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex11 = complex6.conjugate();
        org.apache.commons.math3.complex.Complex complex12 = complex6.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex11", complex6.equals(complex11) ? complex6.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex21.add((double) 100.0f);
        boolean boolean24 = complex21.isInfinite();
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex27 = complex25.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math3.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex29.asin();
        org.apache.commons.math3.complex.Complex complex33 = complex25.divide(complex29);
        org.apache.commons.math3.complex.Complex complex34 = complex21.subtract(complex29);
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        boolean boolean40 = complex39.isNaN();
        org.apache.commons.math3.complex.Complex complex41 = complex39.tan();
        org.apache.commons.math3.complex.Complex complex43 = complex39.multiply((-1));
        boolean boolean44 = complex39.isInfinite();
        org.apache.commons.math3.complex.Complex complex47 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((int) (byte) 100);
        boolean boolean50 = complex49.isNaN();
        double double51 = complex49.getReal();
        org.apache.commons.math3.complex.Complex complex52 = complex49.negate();
        org.apache.commons.math3.complex.Complex complex53 = complex39.add(complex52);
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex(1.3440585709080678E43d);
        org.apache.commons.math3.complex.Complex complex56 = complex52.pow(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex29.divide(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex53", complex10.equals(complex53) ? complex10.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) -1);
        org.apache.commons.math3.complex.Complex complex7 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math3.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double17 = complex16.getReal();
        boolean boolean18 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex19 = complex12.divide(complex16);
        org.apache.commons.math3.complex.Complex complex22 = complex19.createComplex(0.019999333373330475d, (double) 'a');
        org.apache.commons.math3.complex.Complex complex23 = complex19.sin();
        org.apache.commons.math3.complex.Complex complex24 = complex8.subtract(complex19);
        org.apache.commons.math3.complex.Complex complex25 = complex19.conjugate();
        boolean boolean26 = complex25.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex25", complex19.equals(complex25) ? complex19.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math3.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) ' ', 0.009964792234706478d);
        org.apache.commons.math3.complex.Complex complex26 = complex22.pow(complex25);
        org.apache.commons.math3.complex.Complex complex27 = complex22.conjugate();
        org.apache.commons.math3.complex.Complex complex29 = complex27.add(1.7573410885216172d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex27", complex6.equals(complex27) ? complex6.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math3.complex.Complex complex7 = complex4.reciprocal();
        double double8 = complex7.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList17 = complex13.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList26 = complex22.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField27 = complex22.getField();
        org.apache.commons.math3.complex.Complex complex28 = complex13.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList37 = complex33.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex44 = complex42.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList46 = complex42.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField47 = complex42.getField();
        org.apache.commons.math3.complex.Complex complex48 = complex33.multiply(complex42);
        org.apache.commons.math3.complex.Complex complex49 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex50 = complex48.pow(complex49);
        org.apache.commons.math3.complex.Complex complex51 = complex28.pow(complex48);
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex56.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList60 = complex56.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex63 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex67 = complex65.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList69 = complex65.nthRoot(100);
        boolean boolean70 = complex56.equals((java.lang.Object) complexList69);
        org.apache.commons.math3.complex.Complex complex71 = complex56.sinh();
        org.apache.commons.math3.complex.Complex complex73 = complex56.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex75 = complex73.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex76 = complex28.pow(complex75);
        org.apache.commons.math3.complex.Complex complex77 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex78 = complex28.sqrt1z();
        org.apache.commons.math3.complex.Complex complex79 = complex7.pow(complex28);
        boolean boolean80 = complex79.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex49 and complex79", complex49.equals(complex79) ? complex49.hashCode() == complex79.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex14 = complex10.negate();
        org.apache.commons.math3.complex.Complex complex15 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex16 = complex15.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math3.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply(0);
        org.apache.commons.math3.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex10.cos();
        org.apache.commons.math3.complex.Complex complex13 = complex10.atan();
        org.apache.commons.math3.complex.Complex complex14 = complex13.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex13", complex10.equals(complex13) ? complex10.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        double double10 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex15.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex24.nthRoot(100);
        boolean boolean29 = complex15.equals((java.lang.Object) complexList28);
        org.apache.commons.math3.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex4.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex32.conjugate();
        org.apache.commons.math3.complex.Complex complex36 = complex32.negate();
        org.apache.commons.math3.complex.Complex complex37 = complex32.cos();
        org.apache.commons.math3.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math3.complex.ComplexField complexField39 = complex37.getField();
        org.apache.commons.math3.complex.Complex complex40 = complex37.sqrt();
        org.apache.commons.math3.complex.Complex complex43 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        boolean boolean46 = complex45.isNaN();
        double double47 = complex45.getReal();
        org.apache.commons.math3.complex.Complex complex48 = complex45.negate();
        org.apache.commons.math3.complex.Complex complex49 = complex48.tanh();
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply(0);
        org.apache.commons.math3.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math3.complex.Complex complex53 = complex51.cos();
        org.apache.commons.math3.complex.Complex complex54 = complex40.multiply(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex51", complex34.equals(complex51) ? complex34.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex6 = complex4.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex9 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex13 = complex11.add((double) '#');
        double double14 = complex11.abs();
        org.apache.commons.math3.complex.Complex complex15 = complex11.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex4.add(complex15);
        org.apache.commons.math3.complex.Complex complex17 = complex2.divide(complex4);
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide((double) (byte) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex17.pow(9.999000066676663E-5d);
        org.apache.commons.math3.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((-1.0d));
        org.apache.commons.math3.complex.Complex complex27 = org.apache.commons.math3.complex.Complex.valueOf((double) 10.0f, (double) 10);
        double double28 = complex27.abs();
        org.apache.commons.math3.complex.Complex complex29 = complex27.acos();
        org.apache.commons.math3.complex.Complex complex31 = complex29.pow((double) 100);
        java.lang.String str32 = complex29.toString();
        org.apache.commons.math3.complex.Complex complex35 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex37 = complex35.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex39 = complex37.add((double) '#');
        double double40 = complex37.abs();
        org.apache.commons.math3.complex.Complex complex42 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex37.negate();
        org.apache.commons.math3.complex.Complex complex45 = complex43.add((double) 'a');
        boolean boolean46 = complex45.isInfinite();
        org.apache.commons.math3.complex.Complex complex47 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex48 = complex47.exp();
        org.apache.commons.math3.complex.Complex complex50 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex60 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex62 = complex60.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList64 = complex60.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList73 = complex69.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField74 = complex69.getField();
        org.apache.commons.math3.complex.Complex complex75 = complex60.multiply(complex69);
        org.apache.commons.math3.complex.Complex complex76 = complex53.divide(complex75);
        org.apache.commons.math3.complex.Complex complex77 = complex50.subtract(complex75);
        double double78 = complex75.getReal();
        double double79 = complex75.abs();
        org.apache.commons.math3.complex.ComplexField complexField80 = complex75.getField();
        org.apache.commons.math3.complex.Complex complex81 = complex47.subtract(complex75);
        org.apache.commons.math3.complex.Complex complex84 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex86 = complex84.pow((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex87 = complex75.multiply(complex86);
        org.apache.commons.math3.complex.Complex complex88 = complex29.divide(complex75);
        org.apache.commons.math3.complex.Complex complex91 = complex29.createComplex(9.999E7d, (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex92 = complex24.pow(complex91);
        org.apache.commons.math3.complex.Complex complex93 = complex92.tanh();
        org.apache.commons.math3.complex.Complex complex94 = complex21.add(complex92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex48", complex4.equals(complex48) ? complex4.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) (-1.0f));
        org.apache.commons.math3.complex.Complex complex2 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        boolean boolean9 = complex8.isNaN();
        double double10 = complex8.getReal();
        org.apache.commons.math3.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex11.tanh();
        double double13 = complex11.getReal();
        org.apache.commons.math3.complex.Complex complex14 = complex3.multiply(complex11);
        org.apache.commons.math3.complex.Complex complex17 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex19.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList23 = complex19.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField24 = complex19.getField();
        org.apache.commons.math3.complex.Complex complex25 = complex19.cosh();
        org.apache.commons.math3.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math3.complex.Complex complex28 = complex25.pow((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex31 = complex29.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex32 = complex31.sqrt1z();
        org.apache.commons.math3.complex.Complex complex33 = complex28.divide(complex31);
        org.apache.commons.math3.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex41 = complex39.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList43 = complex39.nthRoot((int) '#');
        boolean boolean44 = complex39.isNaN();
        org.apache.commons.math3.complex.Complex complex47 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex47.multiply((int) (byte) 100);
        boolean boolean50 = complex49.isNaN();
        double double51 = complex49.getReal();
        org.apache.commons.math3.complex.Complex complex52 = complex39.subtract(complex49);
        org.apache.commons.math3.complex.Complex complex55 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex57 = complex55.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex59 = complex57.add((double) '#');
        org.apache.commons.math3.complex.Complex complex60 = complex39.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex61 = complex39.sqrt();
        org.apache.commons.math3.complex.Complex complex62 = complex61.tanh();
        org.apache.commons.math3.complex.Complex complex63 = complex61.acos();
        org.apache.commons.math3.complex.Complex complex65 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex66 = complex65.sinh();
        org.apache.commons.math3.complex.Complex complex67 = complex66.sin();
        org.apache.commons.math3.complex.Complex complex68 = complex61.multiply(complex66);
        org.apache.commons.math3.complex.Complex complex69 = complex34.pow(complex61);
        org.apache.commons.math3.complex.Complex complex70 = complex34.atan();
        org.apache.commons.math3.complex.Complex complex71 = complex34.tanh();
        org.apache.commons.math3.complex.Complex complex72 = complex3.divide(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex62", complex2.equals(complex62) ? complex2.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((-100.0d));
        org.apache.commons.math3.complex.Complex complex2 = complex1.negate();
        org.apache.commons.math3.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        org.apache.commons.math3.complex.Complex complex12 = complex8.subtract((double) (-1.0f));
        double double13 = complex12.getImaginary();
        org.apache.commons.math3.complex.Complex complex14 = complex1.pow(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex3", complex1.equals(complex3) ? complex1.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex11 = complex9.multiply((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex12 = complex11.sqrt1z();
        org.apache.commons.math3.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex14 = complex13.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math3.complex.Complex complex5 = complex1.acos();
        org.apache.commons.math3.complex.Complex complex8 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList14 = complex10.nthRoot((int) '#');
        boolean boolean15 = complex10.isNaN();
        org.apache.commons.math3.complex.Complex complex18 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        boolean boolean21 = complex20.isNaN();
        double double22 = complex20.getReal();
        org.apache.commons.math3.complex.Complex complex23 = complex10.subtract(complex20);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex25 = complex23.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math3.complex.Complex complex29 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex33 = complex31.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList35 = complex31.nthRoot((int) '#');
        boolean boolean36 = complex31.isNaN();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        boolean boolean42 = complex41.isNaN();
        double double43 = complex41.getReal();
        org.apache.commons.math3.complex.Complex complex44 = complex31.subtract(complex41);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex46 = complex44.divide(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex26.add(complex45);
        org.apache.commons.math3.complex.Complex complex48 = complex45.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex1.pow(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex23 and complex48", complex23.equals(complex48) ? complex23.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.multiply((-1));
        boolean boolean9 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex10.acos();
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex16.nthRoot((int) '#');
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        boolean boolean27 = complex26.isNaN();
        double double28 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex29 = complex16.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex31 = complex29.add((double) (short) 10);
        double double32 = complex29.abs();
        org.apache.commons.math3.complex.Complex complex34 = complex29.multiply(10000.0d);
        org.apache.commons.math3.complex.Complex complex35 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex36 = complex10.pow(complex29);
        java.lang.Object obj37 = complex29.readResolve();
        org.apache.commons.math3.complex.Complex complex38 = complex29.exp();
        org.apache.commons.math3.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math3.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex45 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean46 = complex45.isInfinite();
        org.apache.commons.math3.complex.Complex complex47 = complex45.tan();
        org.apache.commons.math3.complex.Complex complex50 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex54 = complex52.add((double) '#');
        double double55 = complex52.abs();
        org.apache.commons.math3.complex.Complex complex57 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex52.negate();
        org.apache.commons.math3.complex.Complex complex59 = complex47.subtract(complex52);
        org.apache.commons.math3.complex.Complex complex60 = complex42.add(complex52);
        org.apache.commons.math3.complex.Complex complex61 = complex52.reciprocal();
        org.apache.commons.math3.complex.Complex complex62 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex64 = complex62.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex65 = complex61.add(complex62);
        org.apache.commons.math3.complex.Complex complex66 = complex61.conjugate();
        org.apache.commons.math3.complex.Complex complex67 = complex61.tan();
        org.apache.commons.math3.complex.Complex complex68 = complex38.multiply(complex61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex39", complex29.equals(complex39) ? complex29.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex56 = complex25.divide(complex55);
        double double57 = complex55.getImaginary();
        org.apache.commons.math3.complex.Complex complex58 = complex55.sinh();
        org.apache.commons.math3.complex.Complex complex59 = complex58.conjugate();
        org.apache.commons.math3.complex.Complex complex60 = complex59.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex59", complex58.equals(complex59) ? complex58.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex7 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex11 = complex9.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList13 = complex9.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList22 = complex18.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField23 = complex18.getField();
        org.apache.commons.math3.complex.Complex complex24 = complex9.multiply(complex18);
        org.apache.commons.math3.complex.Complex complex25 = complex2.divide(complex24);
        org.apache.commons.math3.complex.Complex complex26 = complex2.sinh();
        double double27 = complex26.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = complex26.pow((double) (-1L));
        org.apache.commons.math3.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math3.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math3.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math3.complex.Complex complex33 = complex31.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex32", complex30.equals(complex32) ? complex30.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math3.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math3.complex.Complex complex29 = complex27.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex30 = complex27.tanh();
        org.apache.commons.math3.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex30.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex31", complex30.equals(complex31) ? complex30.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math3.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math3.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math3.complex.Complex complex23 = complex10.subtract(complex22);
        java.util.List<org.apache.commons.math3.complex.Complex> complexList25 = complex22.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex22.cos();
        org.apache.commons.math3.complex.Complex complex27 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex28 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex31 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList37 = complex33.nthRoot((int) '#');
        boolean boolean38 = complex33.isNaN();
        org.apache.commons.math3.complex.Complex complex41 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        boolean boolean44 = complex43.isNaN();
        double double45 = complex43.getReal();
        org.apache.commons.math3.complex.Complex complex46 = complex33.subtract(complex43);
        org.apache.commons.math3.complex.Complex complex49 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex53 = complex51.add((double) '#');
        org.apache.commons.math3.complex.Complex complex54 = complex33.multiply(complex51);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex61 = complex59.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList63 = complex59.nthRoot((int) '#');
        boolean boolean64 = complex59.isNaN();
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        boolean boolean70 = complex69.isNaN();
        double double71 = complex69.getReal();
        org.apache.commons.math3.complex.Complex complex72 = complex59.subtract(complex69);
        org.apache.commons.math3.complex.Complex complex75 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex77 = complex75.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex79 = complex77.add((double) '#');
        org.apache.commons.math3.complex.Complex complex80 = complex59.multiply(complex77);
        org.apache.commons.math3.complex.Complex complex81 = complex59.sqrt();
        org.apache.commons.math3.complex.Complex complex82 = complex81.tanh();
        org.apache.commons.math3.complex.Complex complex84 = complex82.divide((double) ' ');
        org.apache.commons.math3.complex.Complex complex85 = complex54.divide(complex84);
        org.apache.commons.math3.complex.Complex complex86 = complex85.atan();
        org.apache.commons.math3.complex.Complex complex87 = complex86.asin();
        org.apache.commons.math3.complex.Complex complex88 = complex87.acos();
        org.apache.commons.math3.complex.Complex complex89 = complex87.conjugate();
        org.apache.commons.math3.complex.ComplexField complexField90 = complex89.getField();
        java.lang.Object obj91 = complex89.readResolve();
        org.apache.commons.math3.complex.Complex complex92 = complex22.subtract(complex89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex46", complex10.equals(complex46) ? complex10.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math3.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math3.complex.Complex complex32 = complex29.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        double double10 = complex4.getImaginary();
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList19 = complex15.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex22 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList28 = complex24.nthRoot(100);
        boolean boolean29 = complex15.equals((java.lang.Object) complexList28);
        org.apache.commons.math3.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex30.multiply(0.0d);
        org.apache.commons.math3.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math3.complex.Complex complex34 = complex4.divide(complex32);
        org.apache.commons.math3.complex.Complex complex35 = complex4.sinh();
        org.apache.commons.math3.complex.Complex complex36 = complex35.reciprocal();
        java.lang.String str37 = complex36.toString();
        org.apache.commons.math3.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math3.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math3.complex.Complex complex40 = complex39.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex39", complex34.equals(complex39) ? complex34.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex19 = complex17.divide(complex18);
        org.apache.commons.math3.complex.Complex complex20 = complex18.tanh();
        org.apache.commons.math3.complex.Complex complex23 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex27 = complex25.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList29 = complex25.nthRoot((int) '#');
        boolean boolean30 = complex25.isNaN();
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        boolean boolean36 = complex35.isNaN();
        double double37 = complex35.getReal();
        org.apache.commons.math3.complex.Complex complex38 = complex25.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex39 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex40 = complex38.divide(complex39);
        org.apache.commons.math3.complex.Complex complex41 = complex20.add(complex39);
        org.apache.commons.math3.complex.Complex complex42 = complex39.sin();
        org.apache.commons.math3.complex.Complex complex43 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex42.sqrt();
        org.apache.commons.math3.complex.Complex complex45 = complex42.asin();
        org.apache.commons.math3.complex.ComplexField complexField46 = complex45.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex45", complex17.equals(complex45) ? complex17.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math3.complex.Complex complex8 = complex4.multiply((-1));
        boolean boolean9 = complex4.isInfinite();
        org.apache.commons.math3.complex.Complex complex10 = complex4.sqrt1z();
        org.apache.commons.math3.complex.Complex complex11 = complex4.sin();
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex18 = complex16.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex16.nthRoot((int) '#');
        boolean boolean21 = complex16.isNaN();
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        boolean boolean27 = complex26.isNaN();
        double double28 = complex26.getReal();
        org.apache.commons.math3.complex.Complex complex29 = complex16.subtract(complex26);
        org.apache.commons.math3.complex.Complex complex32 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex36 = complex34.add((double) '#');
        org.apache.commons.math3.complex.Complex complex37 = complex16.multiply(complex34);
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex41 = complex37.multiply((double) 0L);
        boolean boolean42 = complex11.equals((java.lang.Object) complex41);
        org.apache.commons.math3.complex.Complex complex44 = complex41.add(9.999000099990002E-5d);
        org.apache.commons.math3.complex.Complex complex45 = complex44.conjugate();
        double double46 = complex45.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex44 and complex45", complex44.equals(complex45) ? complex44.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        org.apache.commons.math3.complex.Complex complex10 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex10.pow((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex16.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.multiply((int) (byte) 0);
        double double25 = complex16.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex24", complex14.equals(complex24) ? complex14.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex13 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math3.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math3.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math3.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math3.complex.Complex complex23 = complex20.subtract((double) (short) -1);
        org.apache.commons.math3.complex.Complex complex25 = complex23.pow((double) 1.0f);
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math3.complex.Complex complex38 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math3.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math3.complex.Complex complex46 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math3.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math3.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math3.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply(0);
        org.apache.commons.math3.complex.Complex complex57 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex55.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex59 = complex55.acos();
        org.apache.commons.math3.complex.ComplexField complexField60 = complex59.getField();
        org.apache.commons.math3.complex.Complex complex61 = complex25.add(complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex43", complex10.equals(complex43) ? complex10.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double11 = complex10.getReal();
        boolean boolean12 = complex10.isInfinite();
        org.apache.commons.math3.complex.Complex complex13 = complex10.sin();
        org.apache.commons.math3.complex.Complex complex14 = complex4.add(complex13);
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean21 = complex20.isInfinite();
        org.apache.commons.math3.complex.Complex complex22 = complex20.tan();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        double double30 = complex27.abs();
        org.apache.commons.math3.complex.Complex complex32 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex33 = complex27.negate();
        org.apache.commons.math3.complex.Complex complex34 = complex22.subtract(complex27);
        org.apache.commons.math3.complex.Complex complex35 = complex17.add(complex27);
        double double36 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex39 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList45 = complex41.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList54 = complex50.nthRoot(100);
        boolean boolean55 = complex41.equals((java.lang.Object) complexList54);
        java.lang.String str56 = complex41.toString();
        org.apache.commons.math3.complex.Complex complex57 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex58 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex60 = complex58.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex63 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex67 = complex65.add((double) '#');
        double double68 = complex65.abs();
        org.apache.commons.math3.complex.Complex complex69 = complex65.reciprocal();
        org.apache.commons.math3.complex.Complex complex70 = complex58.add(complex69);
        boolean boolean71 = complex41.equals((java.lang.Object) complex70);
        double double72 = complex41.getArgument();
        org.apache.commons.math3.complex.Complex complex73 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex74 = complex73.acos();
        org.apache.commons.math3.complex.Complex complex75 = complex41.add(complex73);
        org.apache.commons.math3.complex.Complex complex76 = complex73.sinh();
        org.apache.commons.math3.complex.Complex complex77 = complex17.multiply(complex76);
        org.apache.commons.math3.complex.Complex complex78 = complex14.pow(complex77);
        org.apache.commons.math3.complex.Complex complex80 = complex14.subtract((double) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex58 and complex78", complex58.equals(complex78) ? complex58.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math3.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math3.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math3.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math3.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math3.complex.Complex complex17 = complex15.add((double) (short) -1);
        boolean boolean18 = complex15.isInfinite();
        org.apache.commons.math3.complex.Complex complex21 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math3.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math3.complex.Complex complex27 = complex23.multiply((-1));
        boolean boolean28 = complex23.isInfinite();
        org.apache.commons.math3.complex.Complex complex29 = complex23.sqrt1z();
        org.apache.commons.math3.complex.Complex complex30 = complex15.subtract(complex23);
        java.lang.Object obj31 = complex30.readResolve();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math3.complex.Complex complex40 = complex36.reciprocal();
        org.apache.commons.math3.complex.Complex complex42 = new org.apache.commons.math3.complex.Complex((double) 100);
        double double43 = complex42.getReal();
        boolean boolean44 = complex42.isInfinite();
        org.apache.commons.math3.complex.Complex complex45 = complex42.sin();
        org.apache.commons.math3.complex.Complex complex46 = complex36.add(complex45);
        org.apache.commons.math3.complex.Complex complex47 = complex30.divide(complex46);
        org.apache.commons.math3.complex.Complex complex48 = complex46.tanh();
        org.apache.commons.math3.complex.Complex complex49 = complex46.atan();
        org.apache.commons.math3.complex.Complex complex51 = complex46.pow((-9903.0d));
        org.apache.commons.math3.complex.Complex complex52 = complex46.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex51", complex15.equals(complex51) ? complex15.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.sin();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        double double11 = complex8.abs();
        org.apache.commons.math3.complex.Complex complex13 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math3.complex.Complex complex16 = complex14.add((double) 'a');
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math3.complex.Complex complex18 = complex16.conjugate();
        boolean boolean19 = complex18.isInfinite();
        org.apache.commons.math3.complex.Complex complex20 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex21 = complex1.add(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex26.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex33 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList39 = complex35.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField40 = complex35.getField();
        org.apache.commons.math3.complex.Complex complex41 = complex26.multiply(complex35);
        org.apache.commons.math3.complex.Complex complex44 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex48 = complex46.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList50 = complex46.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex53 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex57 = complex55.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList59 = complex55.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField60 = complex55.getField();
        org.apache.commons.math3.complex.Complex complex61 = complex46.multiply(complex55);
        org.apache.commons.math3.complex.Complex complex62 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex63 = complex61.pow(complex62);
        org.apache.commons.math3.complex.Complex complex64 = complex41.pow(complex61);
        org.apache.commons.math3.complex.Complex complex67 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex71 = complex69.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList73 = complex69.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex76 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex80 = complex78.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList82 = complex78.nthRoot(100);
        boolean boolean83 = complex69.equals((java.lang.Object) complexList82);
        org.apache.commons.math3.complex.Complex complex84 = complex69.sinh();
        org.apache.commons.math3.complex.Complex complex86 = complex69.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex88 = complex86.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex89 = complex41.pow(complex88);
        org.apache.commons.math3.complex.Complex complex90 = complex41.exp();
        org.apache.commons.math3.complex.Complex complex91 = complex41.sqrt1z();
        org.apache.commons.math3.complex.Complex complex92 = complex18.multiply(complex91);
        org.apache.commons.math3.complex.Complex complex93 = complex18.exp();
        org.apache.commons.math3.complex.Complex complex95 = complex93.multiply(0.009964792234706478d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex62 and complex93", complex62.equals(complex93) ? complex62.hashCode() == complex93.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex7 = org.apache.commons.math3.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math3.complex.Complex complex10 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex15 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex17.nthRoot((int) '#');
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList30 = complex26.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField31 = complex26.getField();
        org.apache.commons.math3.complex.Complex complex32 = complex17.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex33 = complex10.divide(complex32);
        org.apache.commons.math3.complex.Complex complex34 = complex7.subtract(complex32);
        org.apache.commons.math3.complex.Complex complex37 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex41 = complex39.add((double) '#');
        double double42 = complex39.abs();
        org.apache.commons.math3.complex.Complex complex43 = complex39.acos();
        org.apache.commons.math3.complex.Complex complex45 = complex43.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex48 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex52 = complex50.add((double) '#');
        double double53 = complex50.abs();
        org.apache.commons.math3.complex.Complex complex55 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex56 = complex50.negate();
        org.apache.commons.math3.complex.Complex complex57 = complex50.conjugate();
        org.apache.commons.math3.complex.Complex complex58 = complex45.subtract(complex57);
        boolean boolean59 = complex32.equals((java.lang.Object) complex57);
        org.apache.commons.math3.complex.Complex complex60 = complex4.multiply(complex57);
        org.apache.commons.math3.complex.Complex complex63 = org.apache.commons.math3.complex.Complex.valueOf(9.999000099990002E-5d, (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex66 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex70 = complex68.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList72 = complex68.nthRoot((int) '#');
        boolean boolean73 = complex68.isNaN();
        org.apache.commons.math3.complex.Complex complex76 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        boolean boolean79 = complex78.isNaN();
        double double80 = complex78.getReal();
        org.apache.commons.math3.complex.Complex complex81 = complex68.subtract(complex78);
        org.apache.commons.math3.complex.Complex complex84 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex86 = complex84.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex88 = complex86.add((double) '#');
        org.apache.commons.math3.complex.Complex complex89 = complex68.multiply(complex86);
        org.apache.commons.math3.complex.Complex complex90 = complex86.sin();
        org.apache.commons.math3.complex.Complex complex91 = complex86.tanh();
        org.apache.commons.math3.complex.Complex complex92 = complex63.pow(complex91);
        boolean boolean93 = complex92.isNaN();
        org.apache.commons.math3.complex.Complex complex94 = complex57.subtract(complex92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex81", complex45.equals(complex81) ? complex45.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math3.complex.ComplexField complexField9 = complex4.getField();
        org.apache.commons.math3.complex.Complex complex10 = complex4.cosh();
        org.apache.commons.math3.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math3.complex.Complex complex13 = complex10.pow((double) 10.0f);
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = complex14.subtract((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math3.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math3.complex.Complex complex20 = complex16.multiply((int) 'a');
        org.apache.commons.math3.complex.Complex complex21 = complex16.log();
        org.apache.commons.math3.complex.Complex complex22 = complex16.sinh();
        org.apache.commons.math3.complex.Complex complex24 = complex16.multiply((int) (byte) 0);
        double double25 = complex16.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex24", complex14.equals(complex24) ? complex14.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math3.complex.Complex complex5 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math3.complex.Complex complex11 = complex7.acos();
        org.apache.commons.math3.complex.Complex complex13 = complex11.multiply((double) (short) 0);
        org.apache.commons.math3.complex.Complex complex16 = complex13.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math3.complex.Complex complex17 = complex0.multiply(complex13);
        org.apache.commons.math3.complex.Complex complex19 = complex17.add((-1.5707963267948966d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math3.complex.Complex complex4 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex8 = complex6.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList10 = complex6.nthRoot((int) '#');
        boolean boolean11 = complex6.isNaN();
        org.apache.commons.math3.complex.Complex complex14 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex16 = complex14.multiply((int) (byte) 100);
        boolean boolean17 = complex16.isNaN();
        double double18 = complex16.getReal();
        org.apache.commons.math3.complex.Complex complex19 = complex6.subtract(complex16);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex21 = complex19.divide(complex20);
        org.apache.commons.math3.complex.Complex complex22 = complex19.sqrt();
        org.apache.commons.math3.complex.Complex complex25 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList40 = complex36.nthRoot(100);
        boolean boolean41 = complex27.equals((java.lang.Object) complexList40);
        org.apache.commons.math3.complex.Complex complex42 = complex27.sinh();
        org.apache.commons.math3.complex.Complex complex44 = complex27.pow((double) 100.0f);
        double double45 = complex44.abs();
        org.apache.commons.math3.complex.Complex complex48 = complex44.createComplex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex49 = complex19.add(complex44);
        org.apache.commons.math3.complex.Complex complex51 = complex49.pow(0.06193616907963972d);
        org.apache.commons.math3.complex.Complex complex54 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex58 = complex56.add((double) '#');
        org.apache.commons.math3.complex.Complex complex59 = complex58.reciprocal();
        org.apache.commons.math3.complex.Complex complex62 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex64 = complex62.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex66 = complex64.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList68 = complex64.nthRoot(100);
        org.apache.commons.math3.complex.Complex complex71 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex75 = complex73.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList77 = complex73.nthRoot(100);
        boolean boolean78 = complex64.equals((java.lang.Object) complexList77);
        org.apache.commons.math3.complex.Complex complex79 = complex64.sinh();
        org.apache.commons.math3.complex.Complex complex81 = complex64.pow((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex83 = complex81.pow((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex84 = complex59.subtract(complex81);
        java.lang.Object obj85 = complex81.readResolve();
        org.apache.commons.math3.complex.Complex complex86 = complex81.sqrt1z();
        org.apache.commons.math3.complex.Complex complex87 = complex51.add(complex81);
        org.apache.commons.math3.complex.Complex complex88 = complex0.multiply(complex81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math3.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex16 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math3.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math3.complex.Complex complex24 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math3.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math3.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math3.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex34 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math3.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math3.complex.Complex complex43 = complex1.add(complex42);
        org.apache.commons.math3.complex.Complex complex44 = complex1.tanh();
        org.apache.commons.math3.complex.Complex complex45 = complex44.asin();
        org.apache.commons.math3.complex.Complex complex46 = complex44.acos();
        boolean boolean47 = complex44.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex46", complex21.equals(complex46) ? complex21.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math3.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math3.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math3.complex.Complex complex20 = new org.apache.commons.math3.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math3.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math3.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math3.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex17.getImaginary();
        org.apache.commons.math3.complex.Complex complex27 = complex17.tan();
        org.apache.commons.math3.complex.Complex complex28 = complex27.asin();
        org.apache.commons.math3.complex.Complex complex29 = complex27.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex28", complex17.equals(complex28) ? complex17.hashCode() == complex28.hashCode() : true);
    }
}

