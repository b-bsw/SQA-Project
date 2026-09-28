package org.apache.commons.math.complex;

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
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex15.nthRoot((int) '#');
        boolean boolean20 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        boolean boolean26 = complex25.isNaN();
        double double27 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex28 = complex15.subtract(complex25);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex35 = complex33.add((double) '#');
        org.apache.commons.math.complex.Complex complex36 = complex15.multiply(complex33);
        org.apache.commons.math.complex.Complex complex37 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex38.divide((double) ' ');
        boolean boolean41 = complex10.equals((java.lang.Object) complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex28", complex10.equals(complex28) ? complex10.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 100.0f, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        boolean boolean32 = complex27.isNaN();
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex37 = complex35.multiply((int) (byte) 100);
        boolean boolean38 = complex37.isNaN();
        double double39 = complex37.getReal();
        org.apache.commons.math.complex.Complex complex40 = complex27.subtract(complex37);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex40.divide(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex19.subtract(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex40 and complex43", complex40.equals(complex43) ? complex40.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex28.subtract(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex17.divide(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        java.lang.String str28 = complex27.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.conjugate();
        java.lang.Object obj46 = complex1.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex29.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        boolean boolean28 = complex17.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex32.nthRoot((int) '#');
        boolean boolean37 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        boolean boolean43 = complex42.isNaN();
        double double44 = complex42.getReal();
        org.apache.commons.math.complex.Complex complex45 = complex32.subtract(complex42);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex45.divide(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex46.conjugate();
        org.apache.commons.math.complex.Complex complex49 = complex27.divide(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex48", complex17.equals(complex48) ? complex17.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        boolean boolean23 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex18.subtract(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex10.add(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex31", complex10.equals(complex31) ? complex10.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex4.pow(complex38);
        boolean boolean40 = complex38.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.conjugate();
        double double46 = complex45.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex27.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList32 = complex28.nthRoot((int) '#');
        boolean boolean33 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex38 = complex36.multiply((int) (byte) 100);
        boolean boolean39 = complex38.isNaN();
        double double40 = complex38.getReal();
        org.apache.commons.math.complex.Complex complex41 = complex28.subtract(complex38);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex48 = complex46.add((double) '#');
        org.apache.commons.math.complex.Complex complex49 = complex28.multiply(complex46);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex54 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean58 = complex57.isInfinite();
        org.apache.commons.math.complex.Complex complex59 = complex57.tan();
        org.apache.commons.math.complex.Complex complex62 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex64 = complex62.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex66 = complex64.add((double) '#');
        double double67 = complex64.abs();
        org.apache.commons.math.complex.Complex complex69 = complex64.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex70 = complex64.negate();
        org.apache.commons.math.complex.Complex complex71 = complex59.subtract(complex64);
        org.apache.commons.math.complex.Complex complex72 = complex54.add(complex64);
        org.apache.commons.math.complex.Complex complex73 = complex64.reciprocal();
        double double74 = complex64.getImaginary();
        org.apache.commons.math.complex.Complex complex75 = complex64.log();
        org.apache.commons.math.complex.Complex complex76 = complex75.acos();
        org.apache.commons.math.complex.Complex complex77 = complex51.add(complex76);
        org.apache.commons.math.complex.Complex complex78 = complex23.divide(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex41", complex10.equals(complex41) ? complex10.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(complex18);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        double double27 = complex24.abs();
        org.apache.commons.math.complex.Complex complex28 = complex24.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = complex35.add((double) '#');
        org.apache.commons.math.complex.Complex complex38 = complex37.reciprocal();
        double double39 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex28.pow(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) 100.0f);
        org.apache.commons.math.complex.Complex complex44 = complex17.pow(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex30", complex17.equals(complex30) ? complex17.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField25 = complex20.getField();
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex20);
        org.apache.commons.math.complex.Complex complex27 = complex4.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex1.subtract(complex26);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex35 = complex33.add((double) '#');
        double double36 = complex33.abs();
        org.apache.commons.math.complex.Complex complex37 = complex33.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex44.add((double) '#');
        double double47 = complex44.abs();
        org.apache.commons.math.complex.Complex complex49 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex44.negate();
        org.apache.commons.math.complex.Complex complex51 = complex44.conjugate();
        org.apache.commons.math.complex.Complex complex52 = complex39.subtract(complex51);
        boolean boolean53 = complex26.equals((java.lang.Object) complex51);
        org.apache.commons.math.complex.Complex complex54 = complex26.log();
        org.apache.commons.math.complex.Complex complex55 = complex26.asin();
        org.apache.commons.math.complex.Complex complex58 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex60 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex62 = complex60.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList64 = complex60.nthRoot((int) '#');
        boolean boolean65 = complex60.isNaN();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex70 = complex68.multiply((int) (byte) 100);
        boolean boolean71 = complex70.isNaN();
        double double72 = complex70.getReal();
        org.apache.commons.math.complex.Complex complex73 = complex60.subtract(complex70);
        org.apache.commons.math.complex.Complex complex76 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex80 = complex78.add((double) '#');
        org.apache.commons.math.complex.Complex complex81 = complex73.add(complex78);
        org.apache.commons.math.complex.Complex complex82 = complex73.reciprocal();
        org.apache.commons.math.complex.Complex complex83 = complex26.multiply(complex82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex39 and complex73", complex39.equals(complex73) ? complex39.hashCode() == complex73.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (short) -1);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = complex35.divide(10000.0d);
        org.apache.commons.math.complex.Complex complex39 = complex17.pow(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex35", complex15.equals(complex35) ? complex15.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math.complex.Complex complex27 = complex22.cos();
        org.apache.commons.math.complex.Complex complex28 = complex22.reciprocal();
        org.apache.commons.math.complex.Complex complex29 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) '#');
        double double37 = complex34.abs();
        org.apache.commons.math.complex.Complex complex39 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex40 = complex34.negate();
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) 'a');
        boolean boolean43 = complex42.isInfinite();
        org.apache.commons.math.complex.Complex complex44 = complex42.conjugate();
        org.apache.commons.math.complex.Complex complex45 = complex44.exp();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex59 = complex57.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList61 = complex57.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex66 = complex64.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex68 = complex66.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList70 = complex66.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField71 = complex66.getField();
        org.apache.commons.math.complex.Complex complex72 = complex57.multiply(complex66);
        org.apache.commons.math.complex.Complex complex73 = complex50.divide(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex47.subtract(complex72);
        double double75 = complex72.getReal();
        double double76 = complex72.abs();
        org.apache.commons.math.complex.ComplexField complexField77 = complex72.getField();
        org.apache.commons.math.complex.Complex complex78 = complex44.subtract(complex72);
        org.apache.commons.math.complex.Complex complex81 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex83 = complex81.pow((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex84 = complex72.multiply(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex29.add(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex45", complex17.equals(complex45) ? complex17.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math.complex.Complex complex62 = complex54.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = complex59.exp();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.log();
        boolean boolean66 = complex59.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex67 = complex12.multiply(complex64);
        org.apache.commons.math.complex.Complex complex68 = complex67.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex67", complex34.equals(complex67) ? complex34.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        boolean boolean23 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex18.subtract(complex28);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        org.apache.commons.math.complex.Complex complex39 = complex18.multiply(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex41.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex44 = complex41.atan();
        org.apache.commons.math.complex.Complex complex45 = complex13.pow(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex31", complex10.equals(complex31) ? complex10.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex17.conjugate();
        double double21 = complex20.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex20", complex17.equals(complex20) ? complex17.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex35.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList48 = complex44.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField49 = complex44.getField();
        org.apache.commons.math.complex.Complex complex50 = complex35.multiply(complex44);
        org.apache.commons.math.complex.Complex complex51 = complex28.multiply(complex35);
        org.apache.commons.math.complex.Complex complex52 = complex28.asin();
        org.apache.commons.math.complex.Complex complex53 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex53.cos();
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList63 = complex59.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex66 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex70 = complex68.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList72 = complex68.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField73 = complex68.getField();
        org.apache.commons.math.complex.Complex complex74 = complex59.multiply(complex68);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex76 = complex74.pow(complex75);
        org.apache.commons.math.complex.Complex complex79 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex81 = complex79.multiply((int) (byte) 100);
        boolean boolean82 = complex81.isNaN();
        org.apache.commons.math.complex.Complex complex83 = complex81.tan();
        org.apache.commons.math.complex.Complex complex85 = complex81.multiply((-1));
        boolean boolean86 = complex81.isInfinite();
        org.apache.commons.math.complex.Complex complex87 = complex81.acos();
        org.apache.commons.math.complex.Complex complex88 = complex75.multiply(complex87);
        org.apache.commons.math.complex.Complex complex89 = complex53.pow(complex87);
        boolean boolean90 = complex23.equals((java.lang.Object) complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex75", complex10.equals(complex75) ? complex10.hashCode() == complex75.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex17.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField31 = complex26.getField();
        org.apache.commons.math.complex.Complex complex32 = complex17.multiply(complex26);
        org.apache.commons.math.complex.Complex complex33 = complex10.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex7.subtract(complex32);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = complex39.add((double) '#');
        double double42 = complex39.abs();
        org.apache.commons.math.complex.Complex complex43 = complex39.acos();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        double double53 = complex50.abs();
        org.apache.commons.math.complex.Complex complex55 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex50.negate();
        org.apache.commons.math.complex.Complex complex57 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex58 = complex45.subtract(complex57);
        boolean boolean59 = complex32.equals((java.lang.Object) complex57);
        org.apache.commons.math.complex.Complex complex60 = complex4.multiply(complex57);
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((int) (short) 0);
        org.apache.commons.math.complex.Complex complex63 = complex60.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex62", complex45.equals(complex62) ? complex45.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex31.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex36 = complex31.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math.complex.Complex complex38 = complex29.subtract(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex29.sin();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList48 = complex44.nthRoot((int) '#');
        boolean boolean49 = complex44.isNaN();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        boolean boolean55 = complex54.isNaN();
        double double56 = complex54.getReal();
        org.apache.commons.math.complex.Complex complex57 = complex44.subtract(complex54);
        org.apache.commons.math.complex.Complex complex59 = complex57.add((double) (short) 10);
        double double60 = complex57.abs();
        org.apache.commons.math.complex.Complex complex62 = complex57.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex63 = complex62.asin();
        boolean boolean64 = complex39.equals((java.lang.Object) complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex63", complex17.equals(complex63) ? complex17.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math.complex.Complex complex62 = complex54.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = complex59.exp();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.log();
        boolean boolean66 = complex59.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex67 = complex12.multiply(complex64);
        org.apache.commons.math.complex.Complex complex70 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        boolean boolean73 = complex72.isNaN();
        org.apache.commons.math.complex.Complex complex74 = complex72.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList76 = complex74.nthRoot((int) (short) 100);
        boolean boolean78 = complex74.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex81 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex83 = complex81.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex85 = complex83.add((double) '#');
        double double86 = complex83.abs();
        org.apache.commons.math.complex.Complex complex87 = complex83.acos();
        org.apache.commons.math.complex.Complex complex89 = complex87.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex90 = complex74.pow(complex87);
        org.apache.commons.math.complex.Complex complex91 = complex64.multiply(complex74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex64 and complex67", complex64.equals(complex67) ? complex64.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.negate();
        org.apache.commons.math.complex.Complex complex47 = complex45.subtract(9.999000099990002E-5d);
        org.apache.commons.math.complex.Complex complex48 = complex45.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex45.nthRoot(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex48", complex45.equals(complex48) ? complex45.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((-1));
        boolean boolean30 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex25.sin();
        org.apache.commons.math.complex.Complex complex33 = complex20.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex37 = complex32.createComplex(1.0001E8d, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex34", complex10.equals(complex34) ? complex10.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.asin();
        java.lang.Class<?> wildcardClass2 = complex0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.conjugate();
        double double46 = complex45.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply(2.8310590249018253d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        double double28 = complex27.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math.complex.Complex complex62 = complex54.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = complex59.exp();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.log();
        boolean boolean66 = complex59.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex67 = complex12.multiply(complex64);
        org.apache.commons.math.complex.ComplexField complexField68 = complex64.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex64 and complex67", complex64.equals(complex67) ? complex64.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        org.apache.commons.math.complex.Complex complex43 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.add(1.3440585709080678E43d);
        double double49 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex45.subtract(1.3440585709080678E43d);
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        org.apache.commons.math.complex.Complex complex53 = complex52.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex8 = complex6.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList10 = complex6.nthRoot(100);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex15.nthRoot(100);
        boolean boolean20 = complex6.equals((java.lang.Object) complexList19);
        java.lang.String str21 = complex6.toString();
        org.apache.commons.math.complex.Complex complex22 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex42.pow(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex44.add(Double.NaN);
        org.apache.commons.math.complex.Complex complex47 = complex6.add(complex44);
        org.apache.commons.math.complex.Complex complex50 = complex6.createComplex((-0.5063656411097588d), 100004.99987500624d);
        boolean boolean51 = complex0.equals((java.lang.Object) complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.exp();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.log();
        boolean boolean29 = complex22.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex30 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex22.atan();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math.complex.Complex complex40 = complex36.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        double double50 = complex47.abs();
        org.apache.commons.math.complex.Complex complex52 = complex47.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex53 = complex47.negate();
        org.apache.commons.math.complex.Complex complex54 = complex47.conjugate();
        org.apache.commons.math.complex.Complex complex55 = complex42.subtract(complex54);
        java.lang.Object obj56 = complex54.readResolve();
        org.apache.commons.math.complex.Complex complex57 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex31.subtract(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex42", complex17.equals(complex42) ? complex17.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex10.pow((double) (-1));
        boolean boolean26 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList35 = complex31.nthRoot((int) '#');
        boolean boolean36 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        boolean boolean42 = complex41.isNaN();
        double double43 = complex41.getReal();
        org.apache.commons.math.complex.Complex complex44 = complex31.subtract(complex41);
        org.apache.commons.math.complex.Complex complex46 = complex31.subtract((double) 100.0f);
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex10.divide(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex44", complex10.equals(complex44) ? complex10.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex6 = complex2.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex28.tan();
        org.apache.commons.math.complex.Complex complex32 = complex28.multiply((-1));
        boolean boolean33 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex34 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.acos();
        double double36 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean39 = complex38.isInfinite();
        org.apache.commons.math.complex.Complex complex40 = complex38.tan();
        org.apache.commons.math.complex.Complex complex41 = complex38.asin();
        org.apache.commons.math.complex.Complex complex43 = complex41.subtract((double) (byte) 0);
        boolean boolean44 = complex34.equals((java.lang.Object) complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.conjugate();
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList54 = complex50.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField55 = complex50.getField();
        org.apache.commons.math.complex.Complex complex56 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt();
        org.apache.commons.math.complex.Complex complex58 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex56.atan();
        org.apache.commons.math.complex.Complex complex60 = complex43.pow(complex56);
        org.apache.commons.math.complex.Complex complex61 = complex23.pow(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex20.divide(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex17.subtract(complex42);
        double double45 = complex42.getReal();
        double double46 = complex42.abs();
        org.apache.commons.math.complex.ComplexField complexField47 = complex42.getField();
        org.apache.commons.math.complex.Complex complex48 = complex14.subtract(complex42);
        org.apache.commons.math.complex.Complex complex50 = complex14.divide(0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex51.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex60 = complex58.add((double) '#');
        double double61 = complex58.abs();
        org.apache.commons.math.complex.Complex complex62 = complex58.reciprocal();
        org.apache.commons.math.complex.Complex complex63 = complex51.add(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex62.conjugate();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex67 = complex65.subtract(100.0d);
        double double68 = complex65.abs();
        org.apache.commons.math.complex.Complex complex69 = complex65.atan();
        org.apache.commons.math.complex.Complex complex72 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex74 = complex72.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex76 = complex74.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList78 = complex74.nthRoot(100);
        org.apache.commons.math.complex.Complex complex81 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex83 = complex81.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex85 = complex83.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList87 = complex83.nthRoot(100);
        boolean boolean88 = complex74.equals((java.lang.Object) complexList87);
        org.apache.commons.math.complex.Complex complex89 = complex74.sinh();
        org.apache.commons.math.complex.Complex complex90 = complex74.cosh();
        boolean boolean91 = complex65.equals((java.lang.Object) complex90);
        boolean boolean92 = complex64.equals((java.lang.Object) boolean91);
        org.apache.commons.math.complex.Complex complex93 = complex14.subtract(complex64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex51", complex15.equals(complex51) ? complex15.hashCode() == complex51.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex1.nthRoot((int) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract((-9.903537547537045d));
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot((int) '#');
        boolean boolean18 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        boolean boolean24 = complex23.isNaN();
        double double25 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex13.subtract(complex23);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) '#');
        org.apache.commons.math.complex.Complex complex34 = complex13.multiply(complex31);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex38 = complex34.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math.complex.Complex complex41 = complex38.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex8.pow(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex41", complex26.equals(complex41) ? complex26.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        org.apache.commons.math.complex.Complex complex43 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.add(1.3440585709080678E43d);
        double double49 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex45.subtract(1.3440585709080678E43d);
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        boolean boolean53 = complex52.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.divide(complex4);
        org.apache.commons.math.complex.Complex complex9 = complex4.cos();
        org.apache.commons.math.complex.Complex complex10 = complex4.conjugate();
        java.lang.String str11 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex10", complex4.equals(complex10) ? complex4.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex6 = complex2.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex6.add((-1.2990526713443544d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex7", complex2.equals(complex7) ? complex2.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex24.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex33.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField38 = complex33.getField();
        org.apache.commons.math.complex.Complex complex39 = complex24.multiply(complex33);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex19.pow(complex39);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList51 = complex47.nthRoot(100);
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex58 = complex56.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList60 = complex56.nthRoot(100);
        boolean boolean61 = complex47.equals((java.lang.Object) complexList60);
        org.apache.commons.math.complex.Complex complex62 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex64 = complex47.pow((double) 100.0f);
        org.apache.commons.math.complex.Complex complex66 = complex64.divide(0.0d);
        org.apache.commons.math.complex.Complex complex67 = complex19.pow(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex19.exp();
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex72 = complex68.createComplex((double) (byte) 0, (double) 0L);
        org.apache.commons.math.complex.Complex complex73 = complex68.sqrt1z();
        org.apache.commons.math.complex.Complex complex76 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex80 = complex78.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList82 = complex78.nthRoot((int) '#');
        boolean boolean83 = complex78.isNaN();
        org.apache.commons.math.complex.Complex complex86 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex88 = complex86.multiply((int) (byte) 100);
        boolean boolean89 = complex88.isNaN();
        double double90 = complex88.getReal();
        org.apache.commons.math.complex.Complex complex91 = complex78.subtract(complex88);
        org.apache.commons.math.complex.Complex complex92 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex93 = complex91.divide(complex92);
        org.apache.commons.math.complex.Complex complex94 = complex92.conjugate();
        org.apache.commons.math.complex.Complex complex95 = complex68.pow(complex92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex92 and complex94", complex92.equals(complex94) ? complex92.hashCode() == complex94.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math.complex.Complex complex41 = complex36.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex36.negate();
        org.apache.commons.math.complex.Complex complex43 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex44.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex53 = complex51.add((double) '#');
        double double54 = complex51.abs();
        org.apache.commons.math.complex.Complex complex55 = complex51.reciprocal();
        org.apache.commons.math.complex.Complex complex56 = complex44.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex36.add(complex44);
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex64 = complex62.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList66 = complex62.nthRoot((int) '#');
        boolean boolean67 = complex62.isNaN();
        org.apache.commons.math.complex.Complex complex70 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        boolean boolean73 = complex72.isNaN();
        double double74 = complex72.getReal();
        org.apache.commons.math.complex.Complex complex75 = complex62.subtract(complex72);
        org.apache.commons.math.complex.Complex complex78 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex80 = complex78.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex82 = complex80.add((double) '#');
        org.apache.commons.math.complex.Complex complex83 = complex62.multiply(complex80);
        org.apache.commons.math.complex.Complex complex84 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex85 = complex84.tanh();
        org.apache.commons.math.complex.Complex complex87 = complex85.multiply(0);
        org.apache.commons.math.complex.Complex complex89 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex90 = complex87.multiply(complex89);
        org.apache.commons.math.complex.Complex complex91 = complex87.sin();
        boolean boolean92 = complex57.equals((java.lang.Object) complex91);
        org.apache.commons.math.complex.Complex complex93 = complex57.negate();
        org.apache.commons.math.complex.Complex complex94 = complex93.tanh();
        boolean boolean95 = complex29.equals((java.lang.Object) complex94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.asin();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex1", complex0.equals(complex1) ? complex0.hashCode() == complex1.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((-1));
        boolean boolean30 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex25.sin();
        org.apache.commons.math.complex.Complex complex33 = complex20.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        double double35 = complex32.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex34", complex10.equals(complex34) ? complex10.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.negate();
        org.apache.commons.math.complex.Complex complex47 = complex45.subtract(9.999000099990002E-5d);
        org.apache.commons.math.complex.Complex complex48 = complex45.conjugate();
        org.apache.commons.math.complex.Complex complex49 = complex45.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex48", complex45.equals(complex48) ? complex45.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex10.createComplex((-1.5697866205873507d), 9.999000099990002E-5d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex4.pow(complex38);
        double double40 = complex39.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex11.add((double) (-1));
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        java.lang.Object obj17 = complex16.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex46 = complex1.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex45", complex1.equals(complex45) ? complex1.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math.complex.Complex complex7 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply(3.19968E9d);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = complex14.add((double) '#');
        double double17 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = complex14.acos();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex9.multiply(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex22", complex21.equals(complex22) ? complex21.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex4.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 100);
        boolean boolean10 = complex6.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex19 = complex15.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex22 = complex6.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex6.tan();
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex(0.0d);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) '#');
        org.apache.commons.math.complex.Complex complex34 = complex33.reciprocal();
        org.apache.commons.math.complex.Complex complex35 = complex33.reciprocal();
        org.apache.commons.math.complex.Complex complex36 = complex33.acos();
        org.apache.commons.math.complex.Complex complex37 = complex26.add(complex33);
        boolean boolean38 = complex24.equals((java.lang.Object) complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex26", complex21.equals(complex26) ? complex21.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.4999937502734214d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(9.904495251545704E11d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex17.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex17.exp();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex47 = complex45.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList49 = complex45.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex54.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList58 = complex54.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField59 = complex54.getField();
        org.apache.commons.math.complex.Complex complex60 = complex45.multiply(complex54);
        org.apache.commons.math.complex.Complex complex61 = complex38.divide(complex60);
        org.apache.commons.math.complex.Complex complex62 = complex35.subtract(complex60);
        org.apache.commons.math.complex.Complex complex65 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex67 = complex65.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex69 = complex67.add((double) '#');
        double double70 = complex67.abs();
        org.apache.commons.math.complex.Complex complex71 = complex67.acos();
        org.apache.commons.math.complex.Complex complex73 = complex71.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex76 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex78 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex80 = complex78.add((double) '#');
        double double81 = complex78.abs();
        org.apache.commons.math.complex.Complex complex83 = complex78.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex84 = complex78.negate();
        org.apache.commons.math.complex.Complex complex85 = complex78.conjugate();
        org.apache.commons.math.complex.Complex complex86 = complex73.subtract(complex85);
        boolean boolean87 = complex60.equals((java.lang.Object) complex85);
        org.apache.commons.math.complex.Complex complex88 = complex32.multiply(complex85);
        org.apache.commons.math.complex.Complex complex90 = complex32.multiply((int) (byte) -1);
        org.apache.commons.math.complex.Complex complex92 = complex90.pow(0.19999333373330475d);
        org.apache.commons.math.complex.Complex complex93 = complex17.subtract(complex90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex73", complex17.equals(complex73) ? complex17.hashCode() == complex73.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex34.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.asin();
        double double39 = complex37.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex38", complex34.equals(complex38) ? complex34.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math.complex.Complex complex27 = complex22.cos();
        java.lang.Object obj28 = complex22.readResolve();
        boolean boolean29 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex22.exp();
        org.apache.commons.math.complex.Complex complex31 = complex22.exp();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        org.apache.commons.math.complex.Complex complex40 = complex36.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        org.apache.commons.math.complex.Complex complex50 = complex49.reciprocal();
        double double51 = complex49.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex40.pow(complex49);
        org.apache.commons.math.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex52.subtract((double) (short) -1);
        org.apache.commons.math.complex.Complex complex57 = complex55.pow(0.009999666686665238d);
        org.apache.commons.math.complex.Complex complex58 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex61 = complex55.createComplex(2.8310090299016712d, (double) (byte) 10);
        boolean boolean62 = complex31.equals((java.lang.Object) complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex42", complex17.equals(complex42) ? complex17.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cos();
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) (-1L));
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex27.add(complex29);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex36.nthRoot((int) '#');
        boolean boolean41 = complex36.isNaN();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        boolean boolean47 = complex46.isNaN();
        double double48 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex49 = complex36.subtract(complex46);
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex54.add((double) '#');
        org.apache.commons.math.complex.Complex complex57 = complex49.add(complex54);
        double double58 = complex49.getImaginary();
        org.apache.commons.math.complex.Complex complex59 = complex49.exp();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100);
        double double62 = complex61.getReal();
        org.apache.commons.math.complex.Complex complex63 = complex61.negate();
        org.apache.commons.math.complex.Complex complex64 = complex63.atan();
        org.apache.commons.math.complex.Complex complex65 = complex63.atan();
        org.apache.commons.math.complex.Complex complex66 = complex59.multiply(complex63);
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex73 = complex71.add((double) '#');
        double double74 = complex71.abs();
        org.apache.commons.math.complex.Complex complex75 = complex71.reciprocal();
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) 100);
        double double78 = complex77.getReal();
        boolean boolean79 = complex77.isInfinite();
        org.apache.commons.math.complex.Complex complex80 = complex77.sin();
        org.apache.commons.math.complex.Complex complex81 = complex71.add(complex80);
        org.apache.commons.math.complex.Complex complex83 = complex80.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex84 = complex66.divide(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex31.subtract(complex83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex49", complex10.equals(complex49) ? complex10.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex6 = complex2.log();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        java.lang.Object obj10 = complex6.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex17.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField31 = complex26.getField();
        org.apache.commons.math.complex.Complex complex32 = complex17.multiply(complex26);
        org.apache.commons.math.complex.Complex complex33 = complex10.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex7.subtract(complex32);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = complex39.add((double) '#');
        double double42 = complex39.abs();
        org.apache.commons.math.complex.Complex complex43 = complex39.acos();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        double double53 = complex50.abs();
        org.apache.commons.math.complex.Complex complex55 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex50.negate();
        org.apache.commons.math.complex.Complex complex57 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex58 = complex45.subtract(complex57);
        boolean boolean59 = complex32.equals((java.lang.Object) complex57);
        org.apache.commons.math.complex.Complex complex60 = complex4.multiply(complex57);
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex67 = complex65.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList69 = complex65.nthRoot((int) '#');
        boolean boolean70 = complex65.isNaN();
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex75 = complex73.multiply((int) (byte) 100);
        boolean boolean76 = complex75.isNaN();
        double double77 = complex75.getReal();
        org.apache.commons.math.complex.Complex complex78 = complex65.subtract(complex75);
        org.apache.commons.math.complex.Complex complex81 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex83 = complex81.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex85 = complex83.add((double) '#');
        org.apache.commons.math.complex.Complex complex86 = complex78.add(complex83);
        double double87 = complex86.getReal();
        org.apache.commons.math.complex.Complex complex88 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex90 = complex88.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex91 = complex86.divide(complex90);
        org.apache.commons.math.complex.Complex complex92 = complex4.add(complex90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex78", complex45.equals(complex78) ? complex45.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((double) 0L);
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex29.conjugate();
        boolean boolean32 = complex29.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex34.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cos();
        org.apache.commons.math.complex.Complex complex40 = complex37.subtract(0.009999666686665241d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(6.365966333226996E-7d, (double) 1L);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex7.nthRoot((int) '#');
        boolean boolean12 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        boolean boolean18 = complex17.isNaN();
        double double19 = complex17.getReal();
        org.apache.commons.math.complex.Complex complex20 = complex7.subtract(complex17);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) '#');
        org.apache.commons.math.complex.Complex complex28 = complex20.add(complex25);
        double double29 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex20.exp();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100);
        double double33 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex34 = complex32.negate();
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex36 = complex34.atan();
        org.apache.commons.math.complex.Complex complex37 = complex30.multiply(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex34.negate();
        org.apache.commons.math.complex.Complex complex39 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex2.multiply(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex39", complex34.equals(complex39) ? complex34.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math.complex.Complex complex29 = complex25.multiply((-1));
        boolean boolean30 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex25.sin();
        org.apache.commons.math.complex.Complex complex33 = complex20.divide(complex32);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean40 = complex39.isInfinite();
        org.apache.commons.math.complex.Complex complex41 = complex39.tan();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex48 = complex46.add((double) '#');
        double double49 = complex46.abs();
        org.apache.commons.math.complex.Complex complex51 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex46.negate();
        org.apache.commons.math.complex.Complex complex53 = complex41.subtract(complex46);
        org.apache.commons.math.complex.Complex complex54 = complex36.add(complex46);
        org.apache.commons.math.complex.Complex complex55 = complex46.reciprocal();
        double double56 = complex46.getImaginary();
        org.apache.commons.math.complex.Complex complex59 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex63 = complex61.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList65 = complex61.nthRoot((int) '#');
        boolean boolean66 = complex61.isNaN();
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        boolean boolean72 = complex71.isNaN();
        double double73 = complex71.getReal();
        org.apache.commons.math.complex.Complex complex74 = complex61.subtract(complex71);
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex79 = complex77.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex81 = complex79.add((double) '#');
        org.apache.commons.math.complex.Complex complex82 = complex74.add(complex79);
        double double83 = complex82.getReal();
        org.apache.commons.math.complex.Complex complex84 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex86 = complex84.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex87 = complex82.divide(complex86);
        org.apache.commons.math.complex.Complex complex88 = complex87.cos();
        org.apache.commons.math.complex.Complex complex89 = complex88.cos();
        boolean boolean90 = complex46.equals((java.lang.Object) complex89);
        org.apache.commons.math.complex.Complex complex91 = complex33.multiply(complex46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex74", complex10.equals(complex74) ? complex10.hashCode() == complex74.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex1.nthRoot((int) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex1.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        boolean boolean16 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 100);
        boolean boolean22 = complex21.isNaN();
        double double23 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex24 = complex11.subtract(complex21);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex29.add((double) '#');
        org.apache.commons.math.complex.Complex complex32 = complex24.add(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex32.acos();
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        org.apache.commons.math.complex.Complex complex35 = complex6.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex48 = complex46.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex46.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex57 = complex55.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList59 = complex55.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField60 = complex55.getField();
        org.apache.commons.math.complex.Complex complex61 = complex46.multiply(complex55);
        org.apache.commons.math.complex.Complex complex62 = complex39.divide(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex39.negate();
        org.apache.commons.math.complex.Complex complex65 = complex63.pow((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex67 = complex63.pow((double) 0);
        org.apache.commons.math.complex.Complex complex68 = complex36.multiply(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex36 and complex67", complex36.equals(complex67) ? complex36.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField41 = complex36.getField();
        org.apache.commons.math.complex.Complex complex42 = complex27.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex20.divide(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex17.subtract(complex42);
        double double45 = complex42.getReal();
        double double46 = complex42.abs();
        org.apache.commons.math.complex.ComplexField complexField47 = complex42.getField();
        org.apache.commons.math.complex.Complex complex48 = complex14.subtract(complex42);
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, (double) ' ');
        org.apache.commons.math.complex.Complex complex52 = complex51.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex48.subtract(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex53.negate();
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        double double62 = complex59.abs();
        org.apache.commons.math.complex.Complex complex63 = complex59.acos();
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex67 = new org.apache.commons.math.complex.Complex(1.4141135588379148E8d);
        org.apache.commons.math.complex.Complex complex68 = complex65.multiply(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex53.pow(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex68", complex15.equals(complex68) ? complex15.hashCode() == complex68.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex12.nthRoot((int) '#');
        boolean boolean17 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        boolean boolean23 = complex22.isNaN();
        double double24 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex12.subtract(complex22);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        org.apache.commons.math.complex.Complex complex33 = complex25.add(complex30);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex35.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex38 = complex33.divide(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex4.pow(complex38);
        double double40 = complex38.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex25 and complex39", complex25.equals(complex39) ? complex25.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-9999.999950005d), 10000.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex5 = complex3.divide(10000.499937513123d);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex10.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex19.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex19.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField24 = complex19.getField();
        org.apache.commons.math.complex.Complex complex25 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) '#');
        double double35 = complex32.abs();
        org.apache.commons.math.complex.Complex complex36 = complex32.reciprocal();
        org.apache.commons.math.complex.Complex complex37 = complex32.tan();
        org.apache.commons.math.complex.Complex complex38 = complex25.divide(complex32);
        org.apache.commons.math.complex.Complex complex40 = complex25.pow((double) '4');
        org.apache.commons.math.complex.Complex complex41 = complex25.asin();
        org.apache.commons.math.complex.Complex complex42 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex43 = complex5.multiply(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt();
        org.apache.commons.math.complex.Complex complex47 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex49 = complex47.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex51 = complex49.add((double) '#');
        double double52 = complex49.abs();
        org.apache.commons.math.complex.Complex complex53 = complex49.acos();
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex56.cosh();
        org.apache.commons.math.complex.Complex complex58 = complex56.atan();
        org.apache.commons.math.complex.Complex complex59 = complex42.subtract(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex55", complex26.equals(complex55) ? complex26.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex17.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex17.exp();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        double double30 = complex29.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex31.atan();
        org.apache.commons.math.complex.Complex complex34 = complex27.multiply(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex31.negate();
        org.apache.commons.math.complex.Complex complex36 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex36", complex31.equals(complex36) ? complex31.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex41.nthRoot((int) '#');
        boolean boolean46 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply((int) (byte) 100);
        boolean boolean52 = complex51.isNaN();
        double double53 = complex51.getReal();
        org.apache.commons.math.complex.Complex complex54 = complex41.subtract(complex51);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) '#');
        org.apache.commons.math.complex.Complex complex62 = complex54.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = complex59.exp();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.log();
        boolean boolean66 = complex59.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex67 = complex12.multiply(complex64);
        org.apache.commons.math.complex.Complex complex69 = complex12.subtract(9.903437570297555d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex67", complex34.equals(complex67) ? complex34.hashCode() == complex67.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex10.pow((double) (-1));
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex26.add(0.00499983334333262d);
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList38 = complex34.nthRoot((int) '#');
        boolean boolean39 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        boolean boolean45 = complex44.isNaN();
        double double46 = complex44.getReal();
        org.apache.commons.math.complex.Complex complex47 = complex34.subtract(complex44);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex52.add((double) '#');
        org.apache.commons.math.complex.Complex complex55 = complex47.add(complex52);
        double double56 = complex47.getImaginary();
        org.apache.commons.math.complex.Complex complex57 = complex47.exp();
        org.apache.commons.math.complex.Complex complex59 = new org.apache.commons.math.complex.Complex((double) 100);
        double double60 = complex59.getReal();
        org.apache.commons.math.complex.Complex complex61 = complex59.negate();
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = complex61.atan();
        org.apache.commons.math.complex.Complex complex64 = complex57.multiply(complex61);
        org.apache.commons.math.complex.Complex complex67 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex71 = complex69.add((double) '#');
        double double72 = complex69.abs();
        org.apache.commons.math.complex.Complex complex73 = complex69.reciprocal();
        org.apache.commons.math.complex.Complex complex75 = new org.apache.commons.math.complex.Complex((double) 100);
        double double76 = complex75.getReal();
        boolean boolean77 = complex75.isInfinite();
        org.apache.commons.math.complex.Complex complex78 = complex75.sin();
        org.apache.commons.math.complex.Complex complex79 = complex69.add(complex78);
        org.apache.commons.math.complex.Complex complex81 = complex78.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex82 = complex64.divide(complex81);
        org.apache.commons.math.complex.Complex complex83 = complex82.tan();
        org.apache.commons.math.complex.Complex complex84 = complex28.subtract(complex83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex47", complex10.equals(complex47) ? complex10.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        boolean boolean23 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex18.subtract(complex28);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        org.apache.commons.math.complex.Complex complex39 = complex18.multiply(complex36);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex44 = complex43.sinh();
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex47 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean48 = complex47.isInfinite();
        org.apache.commons.math.complex.Complex complex49 = complex47.tan();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex54.add((double) '#');
        double double57 = complex54.abs();
        org.apache.commons.math.complex.Complex complex59 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex60 = complex54.negate();
        org.apache.commons.math.complex.Complex complex61 = complex49.subtract(complex54);
        org.apache.commons.math.complex.Complex complex62 = complex44.add(complex54);
        org.apache.commons.math.complex.Complex complex63 = complex54.reciprocal();
        double double64 = complex54.getImaginary();
        org.apache.commons.math.complex.Complex complex65 = complex54.log();
        org.apache.commons.math.complex.Complex complex66 = complex65.acos();
        org.apache.commons.math.complex.Complex complex67 = complex41.add(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex41.sin();
        org.apache.commons.math.complex.Complex complex70 = complex68.multiply(0.4999937502734214d);
        org.apache.commons.math.complex.Complex complex71 = complex68.sqrt1z();
        org.apache.commons.math.complex.Complex complex72 = complex13.divide(complex68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex31", complex10.equals(complex31) ? complex10.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex10.pow((double) (-1));
        org.apache.commons.math.complex.Complex complex26 = complex25.tan();
        org.apache.commons.math.complex.Complex complex27 = complex26.log();
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex26.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList38 = complex34.nthRoot((int) '#');
        boolean boolean39 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        boolean boolean45 = complex44.isNaN();
        double double46 = complex44.getReal();
        org.apache.commons.math.complex.Complex complex47 = complex34.subtract(complex44);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex52.add((double) '#');
        org.apache.commons.math.complex.Complex complex55 = complex34.multiply(complex52);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex59 = complex55.add(0.019999333373330475d);
        org.apache.commons.math.complex.Complex complex60 = complex55.negate();
        org.apache.commons.math.complex.Complex complex61 = complex26.subtract(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex47", complex10.equals(complex47) ? complex10.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        double double26 = complex17.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex17.exp();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        double double30 = complex29.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex29.negate();
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex31.atan();
        org.apache.commons.math.complex.Complex complex34 = complex27.multiply(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex31.negate();
        org.apache.commons.math.complex.Complex complex36 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex31.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex36", complex31.equals(complex36) ? complex31.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex4.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = complex14.add((double) '#');
        double double17 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = complex14.acos();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) '#');
        org.apache.commons.math.complex.Complex complex28 = complex27.reciprocal();
        double double29 = complex27.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex18.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex30.subtract((double) (short) -1);
        org.apache.commons.math.complex.Complex complex34 = complex4.pow(complex30);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = complex39.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList43 = complex39.nthRoot((int) '#');
        boolean boolean44 = complex39.isNaN();
        org.apache.commons.math.complex.Complex complex47 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex49 = complex47.multiply((int) (byte) 100);
        boolean boolean50 = complex49.isNaN();
        double double51 = complex49.getReal();
        org.apache.commons.math.complex.Complex complex52 = complex39.subtract(complex49);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex59 = complex57.add((double) '#');
        org.apache.commons.math.complex.Complex complex60 = complex39.multiply(complex57);
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex65 = complex64.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex65.sin();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean69 = complex68.isInfinite();
        org.apache.commons.math.complex.Complex complex70 = complex68.tan();
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex75 = complex73.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex77 = complex75.add((double) '#');
        double double78 = complex75.abs();
        org.apache.commons.math.complex.Complex complex80 = complex75.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex81 = complex75.negate();
        org.apache.commons.math.complex.Complex complex82 = complex70.subtract(complex75);
        org.apache.commons.math.complex.Complex complex83 = complex65.add(complex75);
        org.apache.commons.math.complex.Complex complex84 = complex75.reciprocal();
        double double85 = complex75.getImaginary();
        org.apache.commons.math.complex.Complex complex86 = complex75.log();
        org.apache.commons.math.complex.Complex complex87 = complex86.acos();
        org.apache.commons.math.complex.Complex complex88 = complex62.add(complex87);
        org.apache.commons.math.complex.Complex complex89 = complex62.sin();
        org.apache.commons.math.complex.Complex complex90 = complex4.divide(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex52", complex20.equals(complex52) ? complex20.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex10.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex7.multiply(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex20.createComplex((-3.131592986903128d), (-3.1314950466772697d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex21", complex20.equals(complex21) ? complex20.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex24.nthRoot((int) '#');
        boolean boolean29 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        boolean boolean35 = complex34.isNaN();
        double double36 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex37 = complex24.subtract(complex34);
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = complex42.add((double) '#');
        org.apache.commons.math.complex.Complex complex45 = complex37.add(complex42);
        org.apache.commons.math.complex.Complex complex46 = complex45.acos();
        org.apache.commons.math.complex.Complex complex47 = complex13.multiply(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex47.reciprocal();
        org.apache.commons.math.complex.Complex complex51 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex55 = complex53.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList57 = complex53.nthRoot((int) '#');
        boolean boolean58 = complex53.isNaN();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        boolean boolean64 = complex63.isNaN();
        double double65 = complex63.getReal();
        org.apache.commons.math.complex.Complex complex66 = complex53.subtract(complex63);
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex73 = complex71.add((double) '#');
        org.apache.commons.math.complex.Complex complex74 = complex66.add(complex71);
        double double75 = complex66.getImaginary();
        org.apache.commons.math.complex.Complex complex76 = complex66.log();
        java.lang.Object obj77 = complex66.readResolve();
        org.apache.commons.math.complex.Complex complex78 = complex66.atan();
        org.apache.commons.math.complex.Complex complex79 = complex78.sinh();
        org.apache.commons.math.complex.Complex complex81 = complex78.add(0.0d);
        org.apache.commons.math.complex.Complex complex82 = complex81.sinh();
        org.apache.commons.math.complex.Complex complex83 = complex82.asin();
        boolean boolean84 = complex48.equals((java.lang.Object) complex82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex37 and complex83", complex37.equals(complex83) ? complex37.hashCode() == complex83.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1L, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.reciprocal();
        org.apache.commons.math.complex.Complex complex5 = complex3.add(5.19948E9d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply(0);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex32 = complex29.multiply(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex35 = complex32.subtract((double) (-1));
        org.apache.commons.math.complex.Complex complex36 = complex35.acos();
        org.apache.commons.math.complex.Complex complex37 = complex35.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex36", complex17.equals(complex36) ? complex17.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex6 = complex2.log();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex21.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex21.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex30.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField35 = complex30.getField();
        org.apache.commons.math.complex.Complex complex36 = complex21.multiply(complex30);
        org.apache.commons.math.complex.Complex complex37 = complex14.multiply(complex21);
        org.apache.commons.math.complex.Complex complex38 = complex14.asin();
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex43.nthRoot(100);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex52.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList56 = complex52.nthRoot(100);
        boolean boolean57 = complex43.equals((java.lang.Object) complexList56);
        org.apache.commons.math.complex.Complex complex58 = complex43.sinh();
        org.apache.commons.math.complex.Complex complex60 = complex43.pow((double) 100.0f);
        org.apache.commons.math.complex.Complex complex61 = complex14.pow(complex43);
        org.apache.commons.math.complex.Complex complex63 = complex61.pow((-2.356194490192345d));
        org.apache.commons.math.complex.Complex complex64 = complex61.negate();
        org.apache.commons.math.complex.Complex complex65 = complex64.reciprocal();
        org.apache.commons.math.complex.Complex complex67 = complex64.multiply(1);
        boolean boolean68 = complex9.equals((java.lang.Object) complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (short) -1);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean20 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot((int) '#');
        boolean boolean31 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        boolean boolean37 = complex36.isNaN();
        double double38 = complex36.getReal();
        org.apache.commons.math.complex.Complex complex39 = complex26.subtract(complex36);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex44.add((double) '#');
        org.apache.commons.math.complex.Complex complex47 = complex26.multiply(complex44);
        org.apache.commons.math.complex.Complex complex48 = complex44.sin();
        org.apache.commons.math.complex.Complex complex49 = complex44.cos();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex54 = complex52.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex54.add((double) '#');
        double double57 = complex54.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList59 = complex54.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex60 = complex44.multiply(complex54);
        org.apache.commons.math.complex.Complex complex61 = complex19.add(complex60);
        double double62 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex63 = complex19.negate();
        org.apache.commons.math.complex.Complex complex64 = complex15.subtract(complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex39", complex15.equals(complex39) ? complex15.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math.complex.Complex complex7 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex8 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        double double16 = complex13.abs();
        org.apache.commons.math.complex.Complex complex17 = complex13.acos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        double double27 = complex24.abs();
        org.apache.commons.math.complex.Complex complex29 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = complex24.negate();
        org.apache.commons.math.complex.Complex complex31 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex19.subtract(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex6.add(complex31);
        java.lang.Object obj34 = complex33.readResolve();
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean41 = complex40.isInfinite();
        org.apache.commons.math.complex.Complex complex42 = complex40.tan();
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        double double50 = complex47.abs();
        org.apache.commons.math.complex.Complex complex52 = complex47.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex53 = complex47.negate();
        org.apache.commons.math.complex.Complex complex54 = complex42.subtract(complex47);
        org.apache.commons.math.complex.Complex complex55 = complex37.add(complex47);
        org.apache.commons.math.complex.Complex complex56 = complex47.reciprocal();
        double double57 = complex47.getImaginary();
        org.apache.commons.math.complex.Complex complex58 = complex47.log();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex65 = complex63.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList67 = complex63.nthRoot((int) '#');
        boolean boolean68 = complex63.isNaN();
        org.apache.commons.math.complex.Complex complex71 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        boolean boolean74 = complex73.isNaN();
        double double75 = complex73.getReal();
        org.apache.commons.math.complex.Complex complex76 = complex63.subtract(complex73);
        org.apache.commons.math.complex.Complex complex78 = complex76.add((double) (short) 10);
        org.apache.commons.math.complex.Complex complex79 = complex78.sqrt1z();
        org.apache.commons.math.complex.Complex complex80 = complex78.cosh();
        org.apache.commons.math.complex.Complex complex81 = complex78.log();
        java.lang.Object obj82 = complex81.readResolve();
        org.apache.commons.math.complex.Complex complex83 = complex47.multiply(complex81);
        org.apache.commons.math.complex.Complex complex84 = complex33.multiply(complex83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex76", complex19.equals(complex76) ? complex19.hashCode() == complex76.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-2.094672689364676E-87d), 0.7853981633974483d);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex21.add(complex26);
        double double30 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex21.log();
        java.lang.Object obj32 = complex21.readResolve();
        org.apache.commons.math.complex.Complex complex33 = complex21.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        boolean boolean35 = complex2.equals((java.lang.Object) complex33);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList44 = complex40.nthRoot((int) '#');
        boolean boolean45 = complex40.isNaN();
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        boolean boolean51 = complex50.isNaN();
        double double52 = complex50.getReal();
        org.apache.commons.math.complex.Complex complex53 = complex40.subtract(complex50);
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex60 = complex58.add((double) '#');
        org.apache.commons.math.complex.Complex complex61 = complex53.add(complex58);
        double double62 = complex53.getImaginary();
        org.apache.commons.math.complex.Complex complex63 = complex53.log();
        java.lang.Object obj64 = complex53.readResolve();
        org.apache.commons.math.complex.Complex complex65 = complex53.atan();
        org.apache.commons.math.complex.Complex complex66 = complex65.sinh();
        org.apache.commons.math.complex.Complex complex68 = complex65.add(0.0d);
        org.apache.commons.math.complex.Complex complex69 = complex68.sinh();
        org.apache.commons.math.complex.Complex complex70 = complex69.asin();
        boolean boolean71 = complex2.equals((java.lang.Object) complex69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex70", complex21.equals(complex70) ? complex21.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex15 = complex11.add((double) (-1));
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.4999937502734214d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex2.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        org.apache.commons.math.complex.Complex complex20 = complex19.asin();
        double double21 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex22 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex22", complex19.equals(complex22) ? complex19.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex17.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex23.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex4.subtract((double) 100.0f);
        org.apache.commons.math.complex.Complex complex20 = complex4.log();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex35.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField40 = complex35.getField();
        org.apache.commons.math.complex.Complex complex41 = complex26.multiply(complex35);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex43 = complex41.pow(complex42);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) '#');
        double double51 = complex48.abs();
        org.apache.commons.math.complex.Complex complex52 = complex48.reciprocal();
        org.apache.commons.math.complex.Complex complex53 = complex48.tan();
        org.apache.commons.math.complex.Complex complex54 = complex41.divide(complex48);
        org.apache.commons.math.complex.Complex complex56 = complex41.add((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex58 = complex41.subtract((-9.903537547537045d));
        org.apache.commons.math.complex.Complex complex59 = complex58.sqrt1z();
        org.apache.commons.math.complex.Complex complex60 = complex21.add(complex59);
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex67 = complex65.add((double) '#');
        double double68 = complex65.abs();
        org.apache.commons.math.complex.Complex complex69 = complex65.acos();
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex76 = complex74.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex78 = complex76.add((double) '#');
        double double79 = complex76.abs();
        org.apache.commons.math.complex.Complex complex81 = complex76.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex82 = complex76.negate();
        org.apache.commons.math.complex.Complex complex83 = complex76.conjugate();
        org.apache.commons.math.complex.Complex complex84 = complex71.subtract(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex59.multiply(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex71", complex17.equals(complex71) ? complex17.hashCode() == complex71.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        org.apache.commons.math.complex.Complex complex43 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.add(1.3440585709080678E43d);
        double double49 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex45.subtract(1.3440585709080678E43d);
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        double double53 = complex52.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        org.apache.commons.math.complex.Complex complex20 = complex19.asin();
        double double21 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex22 = complex19.conjugate();
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex22", complex19.equals(complex22) ? complex19.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex(0.19999333373330475d);
        org.apache.commons.math.complex.Complex complex6 = complex3.subtract(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex17.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField31 = complex26.getField();
        org.apache.commons.math.complex.Complex complex32 = complex17.multiply(complex26);
        org.apache.commons.math.complex.Complex complex33 = complex10.divide(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex7.subtract(complex32);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = complex39.add((double) '#');
        double double42 = complex39.abs();
        org.apache.commons.math.complex.Complex complex43 = complex39.acos();
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        double double53 = complex50.abs();
        org.apache.commons.math.complex.Complex complex55 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex56 = complex50.negate();
        org.apache.commons.math.complex.Complex complex57 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex58 = complex45.subtract(complex57);
        boolean boolean59 = complex32.equals((java.lang.Object) complex57);
        org.apache.commons.math.complex.Complex complex60 = complex4.multiply(complex57);
        boolean boolean61 = complex4.isNaN();
        boolean boolean62 = complex4.isInfinite();
        double double63 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex64 = complex4.cos();
        org.apache.commons.math.complex.Complex complex67 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex69 = complex67.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex71 = complex69.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList73 = complex69.nthRoot((int) '#');
        boolean boolean74 = complex69.isNaN();
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex79 = complex77.multiply((int) (byte) 100);
        boolean boolean80 = complex79.isNaN();
        double double81 = complex79.getReal();
        org.apache.commons.math.complex.Complex complex82 = complex69.subtract(complex79);
        org.apache.commons.math.complex.Complex complex84 = complex82.add((double) (short) 10);
        org.apache.commons.math.complex.Complex complex85 = complex84.sqrt1z();
        org.apache.commons.math.complex.Complex complex86 = complex84.cosh();
        org.apache.commons.math.complex.Complex complex87 = complex84.log();
        org.apache.commons.math.complex.Complex complex89 = complex84.divide(17320.508046824147d);
        org.apache.commons.math.complex.Complex complex90 = complex64.divide(complex89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex82", complex45.equals(complex82) ? complex45.hashCode() == complex82.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply((-1));
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex13.multiply((-1));
        boolean boolean18 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        boolean boolean24 = complex23.isNaN();
        double double25 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex23.negate();
        org.apache.commons.math.complex.Complex complex27 = complex13.add(complex26);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math.complex.Complex complex32 = complex29.asin();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt1z();
        java.lang.Object obj34 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex13.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex8.pow(complex36);
        org.apache.commons.math.complex.ComplexField complexField38 = complex37.getField();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.reciprocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex39", complex27.equals(complex39) ? complex27.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex26.acos();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex26.multiply(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex35.subtract(100.0d);
        java.lang.String str38 = complex37.toString();
        double double39 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex44.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList48 = complex44.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField49 = complex44.getField();
        org.apache.commons.math.complex.Complex complex50 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex51 = complex50.sqrt();
        org.apache.commons.math.complex.Complex complex53 = complex50.pow((double) 10.0f);
        org.apache.commons.math.complex.ComplexField complexField54 = complex53.getField();
        org.apache.commons.math.complex.Complex complex55 = complex37.subtract(complex53);
        org.apache.commons.math.complex.Complex complex56 = complex34.pow(complex55);
        org.apache.commons.math.complex.Complex complex59 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex61 = complex59.multiply((int) (byte) 100);
        boolean boolean62 = complex61.isNaN();
        org.apache.commons.math.complex.Complex complex63 = complex61.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList65 = complex63.nthRoot((int) (short) 100);
        boolean boolean67 = complex63.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex70 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex72 = complex70.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex74 = complex72.add((double) '#');
        double double75 = complex72.abs();
        org.apache.commons.math.complex.Complex complex76 = complex72.acos();
        org.apache.commons.math.complex.Complex complex78 = complex76.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex79 = complex63.pow(complex76);
        org.apache.commons.math.complex.Complex complex80 = complex79.tan();
        org.apache.commons.math.complex.Complex complex82 = complex79.multiply((int) ' ');
        boolean boolean83 = complex56.equals((java.lang.Object) complex82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex78", complex17.equals(complex78) ? complex17.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        double double14 = complex12.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        org.apache.commons.math.complex.Complex complex43 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.add(1.3440585709080678E43d);
        double double49 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex45.subtract(1.3440585709080678E43d);
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        org.apache.commons.math.complex.Complex complex53 = complex52.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex21", complex20.equals(complex21) ? complex20.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex9.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField23 = complex18.getField();
        org.apache.commons.math.complex.Complex complex24 = complex9.multiply(complex18);
        org.apache.commons.math.complex.Complex complex25 = complex2.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex2.negate();
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = complex26.pow((double) 0);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = complex35.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex35.nthRoot((int) '#');
        boolean boolean40 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        boolean boolean46 = complex45.isNaN();
        double double47 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex48 = complex35.subtract(complex45);
        org.apache.commons.math.complex.Complex complex50 = complex35.subtract((double) 100.0f);
        org.apache.commons.math.complex.Complex complex51 = complex35.log();
        boolean boolean52 = complex51.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex51.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex30.pow(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex54.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex54", complex30.equals(complex54) ? complex30.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex17.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex34.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.asin();
        org.apache.commons.math.complex.Complex complex40 = complex38.add((double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex34 and complex38", complex34.equals(complex38) ? complex34.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex32.nthRoot((int) '#');
        boolean boolean37 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        boolean boolean43 = complex42.isNaN();
        double double44 = complex42.getReal();
        org.apache.commons.math.complex.Complex complex45 = complex32.subtract(complex42);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        org.apache.commons.math.complex.Complex complex53 = complex32.multiply(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex57 = complex53.multiply((double) 0L);
        boolean boolean58 = complex57.isNaN();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex61 = complex59.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex64 = complex59.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex65 = complex64.exp();
        org.apache.commons.math.complex.Complex complex66 = complex57.subtract(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex57.sin();
        org.apache.commons.math.complex.Complex complex70 = complex67.createComplex(3.337076898827955d, 0.0d);
        org.apache.commons.math.complex.Complex complex72 = complex67.subtract((-1.2679114584199251d));
        org.apache.commons.math.complex.Complex complex73 = complex27.multiply(complex67);
        org.apache.commons.math.complex.Complex complex74 = complex73.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex73", complex17.equals(complex73) ? complex17.hashCode() == complex73.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex(1.4141135588379148E8d);
        org.apache.commons.math.complex.Complex complex13 = complex10.multiply(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex10.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex13", complex10.equals(complex13) ? complex10.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply((-1));
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex13.multiply((-1));
        boolean boolean18 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        boolean boolean24 = complex23.isNaN();
        double double25 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex23.negate();
        org.apache.commons.math.complex.Complex complex27 = complex13.add(complex26);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean30 = complex29.isInfinite();
        org.apache.commons.math.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math.complex.Complex complex32 = complex29.asin();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt1z();
        java.lang.Object obj34 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex13.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex8.pow(complex36);
        org.apache.commons.math.complex.ComplexField complexField38 = complex37.getField();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex39.nthRoot(10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex27 and complex39", complex27.equals(complex39) ? complex27.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cos();
        java.lang.String str25 = complex24.toString();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex30.nthRoot(100);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = complex39.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList43 = complex39.nthRoot(100);
        boolean boolean44 = complex30.equals((java.lang.Object) complexList43);
        org.apache.commons.math.complex.Complex complex45 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex47 = complex30.pow((double) 100.0f);
        boolean boolean49 = complex47.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex50 = complex47.tan();
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex57 = complex55.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList59 = complex55.nthRoot((int) '#');
        boolean boolean60 = complex55.isNaN();
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        boolean boolean66 = complex65.isNaN();
        double double67 = complex65.getReal();
        org.apache.commons.math.complex.Complex complex68 = complex55.subtract(complex65);
        org.apache.commons.math.complex.Complex complex71 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex75 = complex73.add((double) '#');
        org.apache.commons.math.complex.Complex complex76 = complex55.multiply(complex73);
        org.apache.commons.math.complex.Complex complex77 = complex55.sqrt();
        boolean boolean78 = complex50.equals((java.lang.Object) complex77);
        org.apache.commons.math.complex.Complex complex79 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex80 = complex79.exp();
        org.apache.commons.math.complex.Complex complex81 = complex24.add(complex79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex68", complex10.equals(complex68) ? complex10.hashCode() == complex68.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex24.nthRoot((int) '#');
        boolean boolean29 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex32.multiply((int) (byte) 100);
        boolean boolean35 = complex34.isNaN();
        double double36 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex37 = complex24.subtract(complex34);
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = complex42.add((double) '#');
        org.apache.commons.math.complex.Complex complex45 = complex37.add(complex42);
        org.apache.commons.math.complex.Complex complex46 = complex45.acos();
        org.apache.commons.math.complex.Complex complex47 = complex13.multiply(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex47.asin();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        double double50 = complex48.getArgument();
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex57 = complex55.add((double) '#');
        double double58 = complex55.abs();
        org.apache.commons.math.complex.Complex complex59 = complex55.acos();
        org.apache.commons.math.complex.Complex complex61 = complex59.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex66 = complex64.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex68 = complex66.add((double) '#');
        double double69 = complex66.abs();
        org.apache.commons.math.complex.Complex complex71 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex72 = complex66.negate();
        org.apache.commons.math.complex.Complex complex73 = complex66.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex61.subtract(complex73);
        java.lang.Object obj75 = complex73.readResolve();
        org.apache.commons.math.complex.Complex complex76 = complex73.conjugate();
        boolean boolean77 = complex48.equals((java.lang.Object) complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex37 and complex61", complex37.equals(complex61) ? complex37.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        boolean boolean13 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex27.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex27.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField32 = complex27.getField();
        org.apache.commons.math.complex.Complex complex33 = complex18.multiply(complex27);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex12.subtract(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex34.atan();
        org.apache.commons.math.complex.Complex complex38 = complex37.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex37.nthRoot((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex38", complex35.equals(complex38) ? complex35.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex14 = complex12.add((-1.2679114584199251d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cos();
        java.lang.Object obj25 = null;
        boolean boolean26 = complex24.equals(obj25);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList35 = complex31.nthRoot((int) '#');
        boolean boolean36 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        boolean boolean42 = complex41.isNaN();
        double double43 = complex41.getReal();
        org.apache.commons.math.complex.Complex complex44 = complex31.subtract(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt1z();
        org.apache.commons.math.complex.Complex complex47 = complex44.divide(10000.0d);
        org.apache.commons.math.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex51 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex53 = complex51.multiply((int) (byte) 100);
        boolean boolean54 = complex53.isNaN();
        org.apache.commons.math.complex.Complex complex55 = complex53.tan();
        org.apache.commons.math.complex.Complex complex57 = complex53.multiply((-1));
        org.apache.commons.math.complex.Complex complex58 = complex47.pow(complex53);
        org.apache.commons.math.complex.Complex complex59 = complex58.cos();
        org.apache.commons.math.complex.Complex complex60 = complex24.divide(complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex44", complex10.equals(complex44) ? complex10.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex4.acos();
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex19.log();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) '#');
        double double28 = complex25.abs();
        org.apache.commons.math.complex.Complex complex30 = complex25.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex25.negate();
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) 'a');
        boolean boolean34 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList52 = complex48.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex59 = complex57.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList61 = complex57.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField62 = complex57.getField();
        org.apache.commons.math.complex.Complex complex63 = complex48.multiply(complex57);
        org.apache.commons.math.complex.Complex complex64 = complex41.divide(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex38.subtract(complex63);
        double double66 = complex63.getReal();
        double double67 = complex63.abs();
        org.apache.commons.math.complex.ComplexField complexField68 = complex63.getField();
        org.apache.commons.math.complex.Complex complex69 = complex35.subtract(complex63);
        org.apache.commons.math.complex.Complex complex71 = complex35.divide(0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex72 = complex20.divide(complex71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex36", complex17.equals(complex36) ? complex17.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        org.apache.commons.math.complex.Complex complex36 = complex4.pow(0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex36.reciprocal();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex(0.009999666686665241d, 9.999000099990002E-5d);
        org.apache.commons.math.complex.Complex complex44 = complex40.multiply(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex40", complex21.equals(complex40) ? complex21.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex8.nthRoot((int) '#');
        boolean boolean13 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex8.subtract(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        org.apache.commons.math.complex.Complex complex29 = complex8.multiply(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sin();
        org.apache.commons.math.complex.Complex complex31 = complex26.cos();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        double double39 = complex36.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex36.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex26.multiply(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex42);
        double double44 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex1.negate();
        org.apache.commons.math.complex.Complex complex47 = complex45.subtract(9.999000099990002E-5d);
        org.apache.commons.math.complex.Complex complex49 = complex47.pow(3.131592986903128d);
        org.apache.commons.math.complex.Complex complex50 = complex47.acos();
        org.apache.commons.math.complex.Complex complex51 = complex50.sqrt1z();
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex58 = complex56.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList60 = complex56.nthRoot(100);
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex65 = complex63.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex67 = complex65.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList69 = complex65.nthRoot(100);
        boolean boolean70 = complex56.equals((java.lang.Object) complexList69);
        org.apache.commons.math.complex.Complex complex71 = complex56.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex56.pow((double) 100.0f);
        org.apache.commons.math.complex.Complex complex75 = complex73.divide(0.0d);
        org.apache.commons.math.complex.Complex complex78 = complex75.createComplex(1.3440585709080678E43d, 10000.0d);
        org.apache.commons.math.complex.Complex complex79 = complex78.tanh();
        org.apache.commons.math.complex.Complex complex80 = complex79.atan();
        org.apache.commons.math.complex.Complex complex83 = complex80.createComplex(9.999E7d, 0.7853981633974483d);
        org.apache.commons.math.complex.Complex complex86 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex88 = complex86.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex90 = complex88.add((double) '#');
        double double91 = complex88.abs();
        org.apache.commons.math.complex.Complex complex92 = complex88.acos();
        org.apache.commons.math.complex.Complex complex94 = complex92.multiply((double) (short) 0);
        boolean boolean95 = complex83.equals((java.lang.Object) complex94);
        org.apache.commons.math.complex.Complex complex97 = complex94.divide(2.728181092670989d);
        org.apache.commons.math.complex.Complex complex98 = complex50.pow(complex97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex94", complex21.equals(complex94) ? complex21.hashCode() == complex94.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField18 = complex13.getField();
        org.apache.commons.math.complex.Complex complex19 = complex4.multiply(complex13);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex24.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex35 = complex33.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex33.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField38 = complex33.getField();
        org.apache.commons.math.complex.Complex complex39 = complex24.multiply(complex33);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex19.pow(complex39);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList51 = complex47.nthRoot(100);
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex56 = complex54.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex58 = complex56.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList60 = complex56.nthRoot(100);
        boolean boolean61 = complex47.equals((java.lang.Object) complexList60);
        org.apache.commons.math.complex.Complex complex62 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex64 = complex47.pow((double) 100.0f);
        org.apache.commons.math.complex.Complex complex66 = complex64.divide(0.0d);
        org.apache.commons.math.complex.Complex complex67 = complex19.pow(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex19.exp();
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex69.tanh();
        double double71 = complex70.getArgument();
        org.apache.commons.math.complex.Complex complex74 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex76 = complex74.multiply((int) (byte) 100);
        boolean boolean77 = complex76.isNaN();
        org.apache.commons.math.complex.Complex complex78 = complex76.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList80 = complex78.nthRoot((int) (short) 100);
        boolean boolean82 = complex78.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex85 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex87 = complex85.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex89 = complex87.add((double) '#');
        double double90 = complex87.abs();
        org.apache.commons.math.complex.Complex complex91 = complex87.acos();
        org.apache.commons.math.complex.Complex complex93 = complex91.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex94 = complex78.pow(complex91);
        org.apache.commons.math.complex.Complex complex95 = complex78.tan();
        org.apache.commons.math.complex.Complex complex96 = complex95.atan();
        org.apache.commons.math.complex.Complex complex97 = complex95.exp();
        org.apache.commons.math.complex.Complex complex98 = complex70.divide(complex97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex40 and complex93", complex40.equals(complex93) ? complex40.hashCode() == complex93.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cos();
        java.lang.String str25 = complex24.toString();
        org.apache.commons.math.complex.Complex complex27 = complex24.subtract(0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex32.nthRoot((int) '#');
        boolean boolean37 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        boolean boolean43 = complex42.isNaN();
        double double44 = complex42.getReal();
        org.apache.commons.math.complex.Complex complex45 = complex32.subtract(complex42);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex52 = complex50.add((double) '#');
        org.apache.commons.math.complex.Complex complex53 = complex32.multiply(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean62 = complex61.isInfinite();
        org.apache.commons.math.complex.Complex complex63 = complex61.tan();
        org.apache.commons.math.complex.Complex complex66 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex70 = complex68.add((double) '#');
        double double71 = complex68.abs();
        org.apache.commons.math.complex.Complex complex73 = complex68.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex74 = complex68.negate();
        org.apache.commons.math.complex.Complex complex75 = complex63.subtract(complex68);
        org.apache.commons.math.complex.Complex complex76 = complex58.add(complex68);
        org.apache.commons.math.complex.Complex complex77 = complex68.reciprocal();
        double double78 = complex68.getImaginary();
        org.apache.commons.math.complex.Complex complex79 = complex68.log();
        org.apache.commons.math.complex.Complex complex80 = complex79.acos();
        org.apache.commons.math.complex.Complex complex81 = complex55.add(complex80);
        org.apache.commons.math.complex.Complex complex82 = complex55.atan();
        org.apache.commons.math.complex.Complex complex83 = complex24.divide(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex45", complex10.equals(complex45) ? complex10.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.4999937502734214d);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        double double3 = complex1.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean24 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex48.sin();
        org.apache.commons.math.complex.Complex complex53 = complex48.cos();
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex58 = complex56.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex60 = complex58.add((double) '#');
        double double61 = complex58.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList63 = complex58.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex64 = complex48.multiply(complex58);
        org.apache.commons.math.complex.Complex complex65 = complex23.add(complex64);
        org.apache.commons.math.complex.Complex complex66 = complex23.tanh();
        java.lang.Object obj67 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex68 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex69 = complex23.reciprocal();
        org.apache.commons.math.complex.Complex complex70 = complex69.negate();
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.valueOf((-9999.999950005d), (-1.2825791919432494d));
        org.apache.commons.math.complex.Complex complex74 = complex70.add(complex73);
        org.apache.commons.math.complex.Complex complex77 = org.apache.commons.math.complex.Complex.valueOf((double) 1L, 0.0d);
        org.apache.commons.math.complex.Complex complex78 = complex77.acos();
        org.apache.commons.math.complex.Complex complex81 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, (double) ' ');
        org.apache.commons.math.complex.Complex complex82 = complex81.cosh();
        org.apache.commons.math.complex.Complex complex83 = complex81.conjugate();
        org.apache.commons.math.complex.Complex complex84 = complex81.atan();
        org.apache.commons.math.complex.Complex complex87 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex89 = complex87.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex91 = complex89.add((double) '#');
        double double92 = complex89.abs();
        org.apache.commons.math.complex.Complex complex93 = complex89.acos();
        org.apache.commons.math.complex.Complex complex94 = complex89.exp();
        org.apache.commons.math.complex.Complex complex95 = complex81.add(complex94);
        org.apache.commons.math.complex.Complex complex97 = complex95.multiply((int) (short) 10);
        org.apache.commons.math.complex.Complex complex98 = complex78.subtract(complex97);
        org.apache.commons.math.complex.Complex complex99 = complex70.add(complex98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex43 and complex78", complex43.equals(complex78) ? complex43.hashCode() == complex78.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex10.pow((double) (-1));
        boolean boolean26 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) '#');
        double double34 = complex31.abs();
        org.apache.commons.math.complex.Complex complex36 = complex31.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = complex31.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.reciprocal();
        org.apache.commons.math.complex.Complex complex39 = complex38.asin();
        org.apache.commons.math.complex.Complex complex40 = complex10.subtract(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex38", complex10.equals(complex38) ? complex10.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math.complex.Complex complex11 = complex7.reciprocal();
        org.apache.commons.math.complex.Complex complex12 = complex0.add(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex0.multiply(Double.NaN);
        double double15 = complex0.abs();
        org.apache.commons.math.complex.Complex complex16 = complex0.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        java.lang.String str19 = complex4.toString();
        org.apache.commons.math.complex.Complex complex20 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex21.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = complex28.add((double) '#');
        double double31 = complex28.abs();
        org.apache.commons.math.complex.Complex complex32 = complex28.reciprocal();
        org.apache.commons.math.complex.Complex complex33 = complex21.add(complex32);
        boolean boolean34 = complex4.equals((java.lang.Object) complex33);
        org.apache.commons.math.complex.Complex complex36 = complex4.pow(0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex36.reciprocal();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex42 = complex38.add(10035.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex40", complex21.equals(complex40) ? complex21.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex4.multiply(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.sin();
        org.apache.commons.math.complex.Complex complex27 = complex22.cos();
        java.lang.Object obj28 = complex22.readResolve();
        boolean boolean29 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex22.exp();
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex37 = complex35.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex39 = complex37.add((double) '#');
        double double40 = complex37.abs();
        org.apache.commons.math.complex.Complex complex41 = complex37.acos();
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) '#');
        double double51 = complex48.abs();
        org.apache.commons.math.complex.Complex complex53 = complex48.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex48.negate();
        org.apache.commons.math.complex.Complex complex55 = complex48.conjugate();
        org.apache.commons.math.complex.Complex complex56 = complex43.subtract(complex55);
        java.lang.Object obj57 = complex55.readResolve();
        org.apache.commons.math.complex.Complex complex58 = complex55.negate();
        org.apache.commons.math.complex.Complex complex59 = complex30.subtract(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex43", complex17.equals(complex43) ? complex17.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot(100);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex13.nthRoot(100);
        boolean boolean18 = complex4.equals((java.lang.Object) complexList17);
        org.apache.commons.math.complex.Complex complex19 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex4.pow((double) 100.0f);
        boolean boolean23 = complex21.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex24 = complex21.tan();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex29.add((double) '#');
        double double32 = complex29.abs();
        org.apache.commons.math.complex.Complex complex34 = complex29.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex35 = complex29.negate();
        org.apache.commons.math.complex.Complex complex37 = complex35.add((double) 'a');
        boolean boolean38 = complex37.isInfinite();
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex43.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex52.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList56 = complex52.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField57 = complex52.getField();
        org.apache.commons.math.complex.Complex complex58 = complex43.multiply(complex52);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex58.pow(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex37.subtract(complex59);
        java.lang.Object obj62 = complex37.readResolve();
        boolean boolean63 = complex37.isInfinite();
        org.apache.commons.math.complex.Complex complex64 = complex24.multiply(complex37);
        org.apache.commons.math.complex.Complex complex66 = complex24.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex73 = complex71.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList75 = complex71.nthRoot((int) '#');
        boolean boolean76 = complex71.isNaN();
        org.apache.commons.math.complex.Complex complex79 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex81 = complex79.multiply((int) (byte) 100);
        boolean boolean82 = complex81.isNaN();
        double double83 = complex81.getReal();
        org.apache.commons.math.complex.Complex complex84 = complex71.subtract(complex81);
        org.apache.commons.math.complex.Complex complex87 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex89 = complex87.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex91 = complex89.add((double) '#');
        org.apache.commons.math.complex.Complex complex92 = complex71.multiply(complex89);
        org.apache.commons.math.complex.Complex complex94 = complex92.multiply((double) (short) -1);
        boolean boolean95 = complex94.isNaN();
        org.apache.commons.math.complex.Complex complex97 = complex94.pow(0.0d);
        org.apache.commons.math.complex.Complex complex98 = complex24.pow(complex97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex60 and complex97", complex60.equals(complex97) ? complex60.hashCode() == complex97.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        org.apache.commons.math.complex.Complex complex18 = complex17.reciprocal();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex8.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex21.add((double) 100.0f);
        java.lang.Object obj24 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex31 = complex29.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex29.nthRoot((int) '#');
        boolean boolean34 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((int) (byte) 100);
        boolean boolean40 = complex39.isNaN();
        double double41 = complex39.getReal();
        org.apache.commons.math.complex.Complex complex42 = complex29.subtract(complex39);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex47 = complex45.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex49 = complex47.add((double) '#');
        org.apache.commons.math.complex.Complex complex50 = complex42.add(complex47);
        double double51 = complex50.getReal();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex54 = complex52.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex55 = complex50.divide(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex55.cos();
        org.apache.commons.math.complex.Complex complex58 = complex55.multiply(100);
        org.apache.commons.math.complex.Complex complex59 = complex23.subtract(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex42", complex10.equals(complex42) ? complex10.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) ' ', (double) 0.0f);
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 100, 10.0d);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = complex23.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList27 = complex23.nthRoot((int) '#');
        boolean boolean28 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((int) (byte) 100);
        boolean boolean34 = complex33.isNaN();
        double double35 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex23.subtract(complex33);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex43 = complex41.add((double) '#');
        org.apache.commons.math.complex.Complex complex44 = complex23.multiply(complex41);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex48 = complex44.multiply((double) 0L);
        boolean boolean49 = complex48.isNaN();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex50.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex55 = complex50.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex48.subtract(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex57.exp();
        org.apache.commons.math.complex.Complex complex59 = complex18.multiply(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex13.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex36", complex10.equals(complex36) ? complex10.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex17.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = complex17.conjugate();
        boolean boolean28 = complex27.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex27", complex17.equals(complex27) ? complex17.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (short) 10);
        double double20 = complex17.abs();
        org.apache.commons.math.complex.Complex complex22 = complex17.multiply(10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex17.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math.complex.Complex complex11 = complex7.reciprocal();
        org.apache.commons.math.complex.Complex complex12 = complex0.add(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex0.multiply(Double.NaN);
        double double15 = complex0.abs();
        org.apache.commons.math.complex.Complex complex16 = complex0.asin();
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex11.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex20.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField25 = complex20.getField();
        org.apache.commons.math.complex.Complex complex26 = complex11.multiply(complex20);
        org.apache.commons.math.complex.Complex complex27 = complex4.multiply(complex11);
        org.apache.commons.math.complex.Complex complex28 = complex4.asin();
        org.apache.commons.math.complex.Complex complex29 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.divide((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex30.log();
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex(3.131592986903128d, Double.NaN);
        org.apache.commons.math.complex.Complex complex38 = complex33.pow((-2000002.910519876d));
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex45 = complex43.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex43.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = complex52.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList56 = complex52.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField57 = complex52.getField();
        org.apache.commons.math.complex.Complex complex58 = complex43.multiply(complex52);
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex63 = complex61.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex65 = complex63.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList67 = complex63.nthRoot((int) '#');
        boolean boolean68 = complex63.isNaN();
        org.apache.commons.math.complex.Complex complex71 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex73 = complex71.multiply((int) (byte) 100);
        boolean boolean74 = complex73.isNaN();
        double double75 = complex73.getReal();
        org.apache.commons.math.complex.Complex complex76 = complex63.subtract(complex73);
        org.apache.commons.math.complex.Complex complex79 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex81 = complex79.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex83 = complex81.add((double) '#');
        org.apache.commons.math.complex.Complex complex84 = complex76.add(complex81);
        org.apache.commons.math.complex.Complex complex85 = complex84.acos();
        org.apache.commons.math.complex.Complex complex86 = complex52.multiply(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex33.pow(complex52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex38 and complex76", complex38.equals(complex76) ? complex38.hashCode() == complex76.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex6 = complex2.log();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.reciprocal();
        org.apache.commons.math.complex.Complex complex9 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex6.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex9", complex6.equals(complex9) ? complex6.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) '#');
        double double18 = complex15.abs();
        org.apache.commons.math.complex.Complex complex20 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex22);
        java.lang.Object obj24 = complex22.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex22.exp();
        boolean boolean26 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex22.add(100004.99987500624d);
        double double29 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex30.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex35 = complex30.createComplex((double) (short) 10, (double) (short) -1);
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = complex36.log();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = complex42.add((double) '#');
        org.apache.commons.math.complex.Complex complex45 = complex42.reciprocal();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.log();
        boolean boolean48 = complex45.equals((java.lang.Object) complex46);
        double double49 = complex45.getImaginary();
        org.apache.commons.math.complex.Complex complex50 = complex37.multiply(complex45);
        org.apache.commons.math.complex.Complex complex51 = complex45.atan();
        org.apache.commons.math.complex.Complex complex52 = complex22.add(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex30", complex10.equals(complex30) ? complex10.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.reciprocal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100);
        double double11 = complex10.getReal();
        boolean boolean12 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex13 = complex10.sin();
        org.apache.commons.math.complex.Complex complex14 = complex4.add(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex17 = complex16.reciprocal();
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(9.999E7d);
        org.apache.commons.math.complex.Complex complex21 = complex17.divide(1.6108133814752233E-87d);
        org.apache.commons.math.complex.Complex complex22 = complex17.acos();
        org.apache.commons.math.complex.Complex complex23 = complex17.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex17.nthRoot((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex23", complex17.equals(complex23) ? complex17.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-9999.999950005d), (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex2.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.log();
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex6.log();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean12 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex13 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex18.nthRoot((int) '#');
        boolean boolean23 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((int) (byte) 100);
        boolean boolean29 = complex28.isNaN();
        double double30 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex31 = complex18.subtract(complex28);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        org.apache.commons.math.complex.Complex complex39 = complex18.multiply(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex36.sin();
        org.apache.commons.math.complex.Complex complex41 = complex36.cos();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex48 = complex46.add((double) '#');
        double double49 = complex46.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList51 = complex46.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex52 = complex36.multiply(complex46);
        org.apache.commons.math.complex.Complex complex53 = complex11.add(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex54.asin();
        java.lang.Object obj56 = complex54.readResolve();
        org.apache.commons.math.complex.Complex complex57 = complex54.acos();
        org.apache.commons.math.complex.Complex complex58 = complex9.add(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex31 and complex57", complex31.equals(complex57) ? complex31.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex9.subtract(10000.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) '#');
        double double20 = complex17.abs();
        java.lang.String str21 = complex17.toString();
        org.apache.commons.math.complex.Complex complex22 = complex9.subtract(complex17);
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.divide((double) 10.0f);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex30.nthRoot((int) '#');
        boolean boolean35 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        boolean boolean41 = complex40.isNaN();
        double double42 = complex40.getReal();
        org.apache.commons.math.complex.Complex complex43 = complex30.subtract(complex40);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex50 = complex48.add((double) '#');
        org.apache.commons.math.complex.Complex complex51 = complex30.multiply(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply(0);
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex58 = complex55.multiply(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        org.apache.commons.math.complex.Complex complex60 = complex58.cos();
        org.apache.commons.math.complex.Complex complex61 = complex60.log();
        org.apache.commons.math.complex.Complex complex62 = complex25.multiply(complex61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex43 and complex61", complex43.equals(complex61) ? complex43.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.reciprocal();
        org.apache.commons.math.complex.Complex complex12 = complex11.asin();
        double double13 = complex12.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex17.divide(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex17.conjugate();
        boolean boolean21 = complex20.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex20", complex17.equals(complex20) ? complex17.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex4.nthRoot((int) '#');
        boolean boolean9 = complex4.isNaN();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((int) (byte) 100);
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex4.subtract(complex14);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList26 = complex22.nthRoot((int) '#');
        boolean boolean27 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex22.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        org.apache.commons.math.complex.Complex complex43 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = complex40.cos();
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex45.add(1.3440585709080678E43d);
        double double49 = complex45.getReal();
        org.apache.commons.math.complex.Complex complex51 = complex45.subtract(1.3440585709080678E43d);
        org.apache.commons.math.complex.Complex complex52 = complex51.exp();
        java.lang.Object obj53 = complex51.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex52", complex17.equals(complex52) ? complex17.hashCode() == complex52.hashCode() : true);
    }
}

