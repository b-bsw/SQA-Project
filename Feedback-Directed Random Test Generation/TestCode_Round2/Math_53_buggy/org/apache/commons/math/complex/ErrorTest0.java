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
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        java.lang.String str3 = complex1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex1.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        boolean boolean3 = complex2.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex4.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.conjugate();
        java.lang.Class<?> wildcardClass12 = complex4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex11", complex4.equals(complex11) ? complex4.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) 10L, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex15 = complex1.divide(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        boolean boolean12 = complex4.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex8 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj10 = complex9.readResolve();
        boolean boolean12 = complex9.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField13 = complex9.getField();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex9);
        java.lang.Object obj15 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex2.multiply(complex14);
        java.lang.String str18 = complex2.toString();
        org.apache.commons.math.complex.Complex complex19 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex2.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex19", complex2.equals(complex19) ? complex2.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean6 = complex3.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex7 = complex3.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex8.subtract(complex12);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex15 = complex0.add(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex0.conjugate();
        java.lang.Object obj17 = complex0.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex20 = complex16.add(complex18);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj22 = complex21.readResolve();
        boolean boolean24 = complex21.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField25 = complex21.getField();
        org.apache.commons.math.complex.Complex complex26 = complex20.subtract(complex21);
        boolean boolean27 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj29 = complex28.readResolve();
        double double30 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex26.subtract(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex14.subtract(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math.complex.Complex complex35 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex35.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex38.cos();
        double double42 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex43 = complex41.acos();
        org.apache.commons.math.complex.Complex complex44 = complex37.add(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex32.divide(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex44", complex41.equals(complex44) ? complex41.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        boolean boolean3 = complex0.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        boolean boolean5 = complex4.isNaN();
        double double6 = complex4.abs();
        double double7 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex4.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj15 = complex14.readResolve();
        boolean boolean17 = complex14.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex18 = complex14.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex23);
        double double25 = complex24.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex11.add(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex4.add(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex27", complex0.equals(complex27) ? complex0.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean6 = complex3.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex7 = complex3.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex8.subtract(complex12);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex15 = complex0.add(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex0.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj5 = complex4.readResolve();
        boolean boolean7 = complex4.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex8 = complex4.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj14 = complex13.readResolve();
        boolean boolean16 = complex13.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex17 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex18 = complex9.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj20 = complex19.readResolve();
        org.apache.commons.math.complex.Complex complex21 = complex19.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        java.lang.String str23 = complex21.toString();
        org.apache.commons.math.complex.Complex complex24 = complex21.cos();
        double double25 = complex24.getReal();
        org.apache.commons.math.complex.Complex complex28 = complex24.createComplex(1.6704649792860586d, 0.0d);
        org.apache.commons.math.complex.Complex complex29 = complex9.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.exp();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField33 = complex32.getField();
        org.apache.commons.math.complex.Complex complex34 = complex30.add(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj36 = complex35.readResolve();
        boolean boolean38 = complex35.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField39 = complex35.getField();
        org.apache.commons.math.complex.Complex complex40 = complex34.subtract(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex34.exp();
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex44 = complex43.acos();
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = complex44.cos();
        org.apache.commons.math.complex.Complex complex47 = complex29.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj49 = complex48.readResolve();
        org.apache.commons.math.complex.Complex complex50 = complex48.asin();
        org.apache.commons.math.complex.Complex complex51 = complex50.acos();
        org.apache.commons.math.complex.Complex complex52 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex47.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex2.multiply(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex30", complex2.equals(complex30) ? complex2.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex7.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((double) (short) 100);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex5.divide(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex5.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean21 = complex20.isNaN();
        double double22 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex20.atan();
        org.apache.commons.math.complex.Complex complex24 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex19.add(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex24", complex20.equals(complex24) ? complex20.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        boolean boolean11 = complex10.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj14 = complex13.readResolve();
        boolean boolean16 = complex13.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        double double22 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex18.add(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math.complex.Complex complex27 = complex10.pow(complex23);
        org.apache.commons.math.complex.Complex complex30 = complex23.createComplex((double) (short) 0, (-0.0d));
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex33.acos();
        org.apache.commons.math.complex.Complex complex36 = complex35.asin();
        org.apache.commons.math.complex.Complex complex37 = complex30.add(complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex33", complex30.equals(complex33) ? complex30.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj3 = complex2.readResolve();
        boolean boolean5 = complex2.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex7 = complex0.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex0.negate();
        org.apache.commons.math.complex.Complex complex10 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex0.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        boolean boolean6 = complex2.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.conjugate();
        java.lang.String str7 = complex0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj20 = complex19.readResolve();
        boolean boolean22 = complex19.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex23 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj25 = complex24.readResolve();
        boolean boolean27 = complex24.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex28 = complex24.exp();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex19.subtract(complex28);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        double double38 = complex36.abs();
        org.apache.commons.math.complex.Complex complex39 = complex19.subtract(complex36);
        java.lang.String str40 = complex19.toString();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        double double43 = complex42.getImaginary();
        double double44 = complex42.getReal();
        java.lang.String str45 = complex42.toString();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean47 = complex46.isNaN();
        double double48 = complex46.getImaginary();
        org.apache.commons.math.complex.Complex complex49 = complex46.cos();
        org.apache.commons.math.complex.Complex complex50 = complex42.pow(complex49);
        org.apache.commons.math.complex.ComplexField complexField51 = complex49.getField();
        org.apache.commons.math.complex.Complex complex52 = complex19.add(complex49);
        boolean boolean53 = complex52.isInfinite();
        java.lang.String str54 = complex52.toString();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = complex52.subtract(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex55.cos();
        org.apache.commons.math.complex.Complex complex59 = complex58.log();
        boolean boolean60 = complex18.equals((java.lang.Object) complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex58", complex13.equals(complex58) ? complex13.hashCode() == complex58.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex2", complex1.equals(complex2) ? complex1.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.createComplex((double) (byte) 0, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.negate();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj8 = complex7.readResolve();
        boolean boolean10 = complex7.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex11 = complex5.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex5.asin();
        org.apache.commons.math.complex.Complex complex13 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex5.negate();
        org.apache.commons.math.complex.Complex complex15 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex4.add(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        double double16 = complex15.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex15", complex12.equals(complex15) ? complex12.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        double double9 = complex8.getReal();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex19 = complex11.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex28 = complex21.pow(complex25);
        boolean boolean29 = complex8.equals((java.lang.Object) complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex13", complex12.equals(complex13) ? complex12.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(complex6);
        double double9 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.add(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex6.multiply(complex14);
        org.apache.commons.math.complex.Complex complex20 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex14.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex20", complex14.equals(complex20) ? complex14.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex14 = complex4.createComplex(1.0d, 10.0d);
        double double15 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex4.acos();
        org.apache.commons.math.complex.Complex complex17 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex17", complex4.equals(complex17) ? complex4.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 1, Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        double double6 = complex5.getImaginary();
        double double7 = complex5.getReal();
        org.apache.commons.math.complex.Complex complex8 = complex5.log();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex11.isNaN();
        double double13 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex11.cos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        double double19 = complex18.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        boolean boolean26 = complex24.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex11.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math.complex.Complex complex30 = complex27.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex10.divide(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex30", complex24.equals(complex30) ? complex24.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj11 = complex10.readResolve();
        boolean boolean13 = complex10.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex5.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex17.cos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        double double24 = complex22.abs();
        org.apache.commons.math.complex.Complex complex25 = complex5.subtract(complex22);
        java.lang.String str26 = complex5.toString();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        double double30 = complex28.getReal();
        java.lang.String str31 = complex28.toString();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = complex32.cos();
        org.apache.commons.math.complex.Complex complex36 = complex28.pow(complex35);
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex38 = complex5.add(complex35);
        boolean boolean39 = complex38.isInfinite();
        java.lang.String str40 = complex38.toString();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex38.subtract(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex((double) 10L, (double) ' ');
        org.apache.commons.math.complex.ComplexField complexField48 = complex47.getField();
        org.apache.commons.math.complex.Complex complex49 = complex47.sqrt();
        double double50 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex51 = complex1.add(complex47);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.abs();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj56 = complex55.readResolve();
        boolean boolean57 = complex53.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex58 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex60 = complex53.conjugate();
        org.apache.commons.math.complex.Complex complex61 = complex60.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex60", complex18.equals(complex60) ? complex18.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) (short) 10);
        double double6 = complex3.getReal();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        boolean boolean10 = complex7.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex11 = complex7.sin();
        org.apache.commons.math.complex.Complex complex12 = complex3.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex13.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex13.cos();
        org.apache.commons.math.complex.Complex complex17 = complex13.conjugate();
        double double18 = complex17.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        double double13 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex17 = complex10.pow(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex10.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex22 = complex18.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex18.nthRoot((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex22", complex18.equals(complex22) ? complex18.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-1.0d), (double) 1L);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex2.subtract(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) '#', 0.6393342588846141d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex19 = complex11.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex28 = complex21.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex21.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex33 = complex29.sin();
        java.lang.String str34 = complex33.toString();
        org.apache.commons.math.complex.ComplexField complexField35 = complex33.getField();
        org.apache.commons.math.complex.Complex complex36 = complex33.asin();
        org.apache.commons.math.complex.Complex complex37 = complex7.subtract(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex36", complex29.equals(complex36) ? complex29.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        boolean boolean2 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex14 = complex4.createComplex(1.0d, 10.0d);
        double double15 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex4.acos();
        org.apache.commons.math.complex.Complex complex17 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        double double20 = complex19.abs();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj22 = complex21.readResolve();
        boolean boolean24 = complex21.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex25 = complex21.exp();
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math.complex.Complex complex29 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex27.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex36 = complex25.subtract(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex19.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj39 = complex38.readResolve();
        boolean boolean41 = complex38.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj43 = complex42.readResolve();
        double double44 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex38.pow(complex42);
        org.apache.commons.math.complex.Complex complex46 = complex45.asin();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex46.sinh();
        double double49 = complex46.getImaginary();
        org.apache.commons.math.complex.Complex complex50 = complex36.add(complex46);
        boolean boolean51 = complex4.equals((java.lang.Object) complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex17", complex4.equals(complex17) ? complex4.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        double double19 = complex18.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        double double24 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex23.conjugate();
        boolean boolean26 = complex14.equals((java.lang.Object) complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex25", complex0.equals(complex25) ? complex0.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj8 = complex7.readResolve();
        boolean boolean10 = complex7.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj12 = complex11.readResolve();
        double double13 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex14 = complex7.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj18 = complex17.readResolve();
        boolean boolean20 = complex17.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex21 = complex17.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex22.subtract(complex26);
        double double28 = complex27.abs();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex27.multiply(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex27.createComplex(0.0d, Double.NaN);
        java.lang.Object obj34 = complex33.readResolve();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.exp();
        double double39 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex40 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex43 = complex35.pow(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex46 = complex45.cos();
        org.apache.commons.math.complex.Complex complex47 = complex33.pow(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex16.divide(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex6.pow(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex7.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean6 = complex3.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex7 = complex3.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex8.subtract(complex12);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex15 = complex0.add(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex(7.0001840869445076d, (double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex16", complex0.equals(complex16) ? complex0.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj11 = complex10.readResolve();
        boolean boolean13 = complex10.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex5.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex17.cos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        double double24 = complex22.abs();
        org.apache.commons.math.complex.Complex complex25 = complex5.subtract(complex22);
        java.lang.String str26 = complex5.toString();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        double double30 = complex28.getReal();
        java.lang.String str31 = complex28.toString();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = complex32.cos();
        org.apache.commons.math.complex.Complex complex36 = complex28.pow(complex35);
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex38 = complex5.add(complex35);
        boolean boolean39 = complex38.isInfinite();
        java.lang.String str40 = complex38.toString();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex38.subtract(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex((double) 10L, (double) ' ');
        org.apache.commons.math.complex.ComplexField complexField48 = complex47.getField();
        org.apache.commons.math.complex.Complex complex49 = complex47.sqrt();
        double double50 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex51 = complex1.add(complex47);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.abs();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj56 = complex55.readResolve();
        boolean boolean57 = complex53.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex58 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex60 = complex53.conjugate();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.exp();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField64 = complex63.getField();
        org.apache.commons.math.complex.Complex complex65 = complex61.add(complex63);
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj67 = complex66.readResolve();
        boolean boolean69 = complex66.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField70 = complex66.getField();
        org.apache.commons.math.complex.Complex complex71 = complex65.subtract(complex66);
        boolean boolean72 = complex71.isInfinite();
        org.apache.commons.math.complex.Complex complex73 = complex71.acos();
        org.apache.commons.math.complex.Complex complex74 = complex73.log();
        org.apache.commons.math.complex.Complex complex75 = complex73.atan();
        org.apache.commons.math.complex.Complex complex76 = complex73.exp();
        org.apache.commons.math.complex.Complex complex77 = complex53.add(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex60", complex18.equals(complex60) ? complex18.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(complex6);
        double double9 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.add(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex6.multiply(complex14);
        org.apache.commons.math.complex.Complex complex20 = complex14.conjugate();
        double double21 = complex20.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex20", complex10.equals(complex20) ? complex10.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj14 = complex13.readResolve();
        boolean boolean16 = complex13.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        double double22 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex18.add(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math.complex.Complex complex27 = complex10.pow(complex23);
        org.apache.commons.math.complex.Complex complex30 = complex23.createComplex((double) (short) 0, (-0.0d));
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        double double35 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex34.sinh();
        org.apache.commons.math.complex.Complex complex38 = complex36.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex39 = complex31.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex39.log();
        boolean boolean42 = complex30.equals((java.lang.Object) complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex30 and complex41", complex30.equals(complex41) ? complex30.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex0.pow(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex7.cos();
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex0.subtract(complex10);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj16 = complex15.readResolve();
        boolean boolean18 = complex15.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj20 = complex19.readResolve();
        double double21 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex15.pow(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj26 = complex25.readResolve();
        boolean boolean28 = complex25.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex29 = complex25.exp();
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex30.subtract(complex34);
        double double36 = complex35.abs();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex38 = complex35.multiply(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex35.createComplex(0.0d, Double.NaN);
        java.lang.Object obj42 = complex41.readResolve();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = complex43.exp();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.exp();
        double double47 = complex46.getImaginary();
        org.apache.commons.math.complex.Complex complex48 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex50 = complex48.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex51 = complex43.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex51.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex54 = complex53.cos();
        org.apache.commons.math.complex.Complex complex55 = complex41.pow(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex24.divide(complex54);
        boolean boolean57 = complex54.isInfinite();
        org.apache.commons.math.complex.Complex complex59 = complex54.multiply((-0.7853981633974483d));
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex61 = complex60.exp();
        org.apache.commons.math.complex.Complex complex62 = complex60.sqrt1z();
        org.apache.commons.math.complex.Complex complex63 = complex60.cos();
        boolean boolean64 = complex63.isNaN();
        org.apache.commons.math.complex.Complex complex65 = complex63.asin();
        boolean boolean66 = complex54.equals((java.lang.Object) complex65);
        org.apache.commons.math.complex.Complex complex67 = complex54.tan();
        double double68 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex69 = complex10.multiply(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex52", complex1.equals(complex52) ? complex1.hashCode() == complex52.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField6 = complex5.getField();
        org.apache.commons.math.complex.Complex complex7 = complex3.add(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj9 = complex8.readResolve();
        boolean boolean11 = complex8.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField12 = complex8.getField();
        org.apache.commons.math.complex.Complex complex13 = complex7.subtract(complex8);
        boolean boolean14 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj17 = complex16.readResolve();
        boolean boolean19 = complex16.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex20 = complex16.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj23 = complex22.readResolve();
        org.apache.commons.math.complex.Complex complex24 = complex20.multiply(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex13.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex26.cos();
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex33 = complex32.acos();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj35 = complex34.readResolve();
        double double36 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex37 = complex32.multiply(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = complex13.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex1.multiply(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj11 = complex10.readResolve();
        boolean boolean13 = complex10.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex5.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex17.cos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        double double24 = complex22.abs();
        org.apache.commons.math.complex.Complex complex25 = complex5.subtract(complex22);
        java.lang.String str26 = complex5.toString();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        double double30 = complex28.getReal();
        java.lang.String str31 = complex28.toString();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = complex32.cos();
        org.apache.commons.math.complex.Complex complex36 = complex28.pow(complex35);
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex38 = complex5.add(complex35);
        boolean boolean39 = complex38.isInfinite();
        java.lang.String str40 = complex38.toString();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex38.subtract(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex((double) 10L, (double) ' ');
        org.apache.commons.math.complex.ComplexField complexField48 = complex47.getField();
        org.apache.commons.math.complex.Complex complex49 = complex47.sqrt();
        double double50 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex51 = complex1.add(complex47);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.abs();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj56 = complex55.readResolve();
        boolean boolean57 = complex53.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex58 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex51.pow(complex53);
        org.apache.commons.math.complex.Complex complex60 = complex53.conjugate();
        org.apache.commons.math.complex.Complex complex61 = complex60.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex60", complex18.equals(complex60) ? complex18.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex3.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex11", complex10.equals(complex11) ? complex10.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex0.multiply(54.03023058681398d);
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        double double9 = complex7.getReal();
        java.lang.String str10 = complex7.toString();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex11.isNaN();
        double double13 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex11.cos();
        org.apache.commons.math.complex.Complex complex15 = complex7.pow(complex14);
        boolean boolean16 = complex5.equals((java.lang.Object) complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex17.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex24 = complex23.asin();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex23 and complex25", complex23.equals(complex25) ? complex23.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj3 = complex2.readResolve();
        boolean boolean5 = complex2.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex7 = complex0.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex0.negate();
        org.apache.commons.math.complex.Complex complex10 = complex0.conjugate();
        double double11 = complex0.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        boolean boolean10 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.asin();
        boolean boolean14 = complex13.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex13", complex9.equals(complex13) ? complex9.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.negate();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) 0, 0.8414709848078965d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply(2.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        org.apache.commons.math.complex.Complex complex11 = complex4.add(complex8);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex12.cos();
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex18 = complex17.asin();
        double double19 = complex17.abs();
        org.apache.commons.math.complex.Complex complex20 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex17.acos();
        double double22 = complex17.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.exp();
        double double27 = complex26.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex31 = complex23.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.exp();
        double double36 = complex35.getImaginary();
        org.apache.commons.math.complex.Complex complex37 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex40 = complex33.pow(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex33.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex45 = complex41.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj47 = complex46.readResolve();
        boolean boolean49 = complex46.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex50 = complex46.exp();
        org.apache.commons.math.complex.Complex complex51 = complex50.atan();
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex55 = complex54.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex51.subtract(complex55);
        double double57 = complex56.abs();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex59 = complex56.multiply(complex58);
        org.apache.commons.math.complex.Complex complex62 = complex56.createComplex(0.0d, Double.NaN);
        org.apache.commons.math.complex.Complex complex63 = complex41.subtract(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex17.multiply(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex63.sin();
        boolean boolean66 = complex4.equals((java.lang.Object) complex63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex11", complex8.equals(complex11) ? complex8.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.negate();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        boolean boolean9 = complex8.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex14.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex16", complex4.equals(complex16) ? complex4.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex5.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        double double9 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.exp();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getImaginary();
        double double17 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex18.subtract(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex14.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex13.multiply(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj28 = complex27.readResolve();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math.complex.Complex complex30 = complex27.acos();
        org.apache.commons.math.complex.Complex complex31 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex26.multiply(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        double double37 = complex36.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex41 = complex33.pow(complex40);
        boolean boolean42 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex43 = complex32.add(complex33);
        org.apache.commons.math.complex.Complex complex44 = complex33.acos();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.exp();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField48 = complex47.getField();
        org.apache.commons.math.complex.Complex complex49 = complex45.add(complex47);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj51 = complex50.readResolve();
        boolean boolean53 = complex50.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField54 = complex50.getField();
        org.apache.commons.math.complex.Complex complex55 = complex49.subtract(complex50);
        boolean boolean56 = complex55.isInfinite();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj58 = complex57.readResolve();
        double double59 = complex57.getArgument();
        org.apache.commons.math.complex.Complex complex60 = complex55.subtract(complex57);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.exp();
        org.apache.commons.math.complex.Complex complex63 = complex61.sqrt1z();
        org.apache.commons.math.complex.Complex complex64 = complex61.sqrt();
        double double65 = complex64.getArgument();
        org.apache.commons.math.complex.Complex complex66 = complex64.sinh();
        org.apache.commons.math.complex.Complex complex67 = complex57.divide(complex66);
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math.complex.Complex complex72 = complex68.createComplex((double) 1L, (double) 'a');
        org.apache.commons.math.complex.Complex complex73 = complex67.multiply(complex68);
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex75 = complex74.exp();
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex77 = complex76.exp();
        double double78 = complex77.getImaginary();
        org.apache.commons.math.complex.Complex complex79 = complex77.sinh();
        org.apache.commons.math.complex.Complex complex81 = complex79.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex82 = complex74.pow(complex81);
        double double83 = complex82.getReal();
        org.apache.commons.math.complex.Complex complex84 = complex67.divide(complex82);
        org.apache.commons.math.complex.Complex complex85 = complex82.acos();
        org.apache.commons.math.complex.Complex complex86 = complex44.subtract(complex82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex44", complex20.equals(complex44) ? complex20.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex4.log();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        double double7 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex4.conjugate();
        double double9 = complex4.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex8", complex4.equals(complex8) ? complex4.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean6 = complex3.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex7 = complex3.negate();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj9 = complex8.readResolve();
        boolean boolean11 = complex8.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex12 = complex8.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex3.subtract(complex12);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex15.cos();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        double double22 = complex20.abs();
        org.apache.commons.math.complex.Complex complex23 = complex3.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex3.multiply(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex2.add(complex26);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean31 = complex30.isNaN();
        double double32 = complex30.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = complex30.cos();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.exp();
        double double38 = complex37.getImaginary();
        org.apache.commons.math.complex.Complex complex39 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex42 = complex34.pow(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = complex43.tanh();
        boolean boolean45 = complex43.isInfinite();
        org.apache.commons.math.complex.Complex complex46 = complex30.multiply(complex43);
        double double47 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex48 = complex29.add(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.exp();
        double double51 = complex50.getImaginary();
        double double52 = complex50.getReal();
        org.apache.commons.math.complex.Complex complex53 = complex50.log();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.exp();
        org.apache.commons.math.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex54.cos();
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex60 = complex59.asin();
        org.apache.commons.math.complex.Complex complex61 = complex60.acos();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj63 = complex62.readResolve();
        double double64 = complex62.getArgument();
        org.apache.commons.math.complex.Complex complex65 = complex60.multiply(complex62);
        org.apache.commons.math.complex.Complex complex66 = complex60.sqrt1z();
        org.apache.commons.math.complex.Complex complex67 = complex53.divide(complex60);
        org.apache.commons.math.complex.Complex complex68 = complex67.negate();
        org.apache.commons.math.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math.complex.Complex complex70 = complex29.multiply(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex70.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex70", complex2.equals(complex70) ? complex2.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex14 = complex4.createComplex(1.0d, 10.0d);
        double double15 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex4.acos();
        org.apache.commons.math.complex.Complex complex17 = complex4.conjugate();
        double double18 = complex4.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex17", complex4.equals(complex17) ? complex4.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex3.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex9.divide(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex12", complex1.equals(complex12) ? complex1.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj3 = complex2.readResolve();
        boolean boolean5 = complex2.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex7 = complex0.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex0.negate();
        org.apache.commons.math.complex.Complex complex10 = complex0.conjugate();
        double double11 = complex0.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        java.lang.String str18 = complex16.toString();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj20 = complex19.readResolve();
        org.apache.commons.math.complex.Complex complex21 = complex19.asin();
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math.complex.Complex complex24 = complex16.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.exp();
        double double27 = complex26.abs();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj29 = complex28.readResolve();
        boolean boolean31 = complex28.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex32 = complex28.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex34.cos();
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex43 = complex32.subtract(complex39);
        org.apache.commons.math.complex.Complex complex44 = complex26.multiply(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex26.exp();
        org.apache.commons.math.complex.Complex complex46 = complex24.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex45.conjugate();
        org.apache.commons.math.complex.Complex complex48 = complex45.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex47", complex45.equals(complex47) ? complex45.hashCode() == complex47.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        java.lang.String str18 = complex16.toString();
        org.apache.commons.math.complex.Complex complex19 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex16.createComplex((double) ' ', 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex19", complex13.equals(complex19) ? complex13.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        java.lang.Object obj16 = complex15.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        java.lang.Object obj11 = complex10.readResolve();
        org.apache.commons.math.complex.Complex complex13 = complex10.multiply((double) (byte) 100);
        double double14 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex10.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex10.divide(complex18);
        double double20 = complex19.abs();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math.complex.Complex complex23 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex23.atan();
        double double26 = complex23.getArgument();
        java.lang.String str27 = complex23.toString();
        org.apache.commons.math.complex.Complex complex28 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex23.asin();
        org.apache.commons.math.complex.Complex complex30 = complex19.pow(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex23 and complex29", complex23.equals(complex29) ? complex23.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.conjugate();
        double double17 = complex14.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex16", complex4.equals(complex16) ? complex4.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex7.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((double) (short) 100);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex5.divide(complex15);
        org.apache.commons.math.complex.ComplexField complexField18 = complex5.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex23 = complex19.createComplex((double) 1L, (double) 'a');
        double double24 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex19.negate();
        org.apache.commons.math.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj28 = complex27.readResolve();
        boolean boolean30 = complex27.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex31 = complex27.negate();
        org.apache.commons.math.complex.Complex complex32 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (short) 100, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex36 = complex35.asin();
        boolean boolean37 = complex26.equals((java.lang.Object) complex36);
        org.apache.commons.math.complex.Complex complex38 = complex5.multiply(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex26", complex7.equals(complex26) ? complex7.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex2.getArgument();
        java.lang.String str6 = complex2.toString();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        boolean boolean9 = complex8.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex15 = complex4.subtract(complex11);
        java.lang.Object obj16 = complex15.readResolve();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex15.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        double double21 = complex20.getImaginary();
        double double22 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex20.log();
        org.apache.commons.math.complex.Complex complex24 = complex15.pow(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex20.negate();
        org.apache.commons.math.complex.Complex complex26 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex20.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex26", complex7.equals(complex26) ? complex7.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex16.sqrt();
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex12.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex27 = complex23.createComplex((double) 1L, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex22.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = complex23.acos();
        org.apache.commons.math.complex.Complex complex30 = complex23.asin();
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex30", complex18.equals(complex30) ? complex18.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 1L, (double) '4');
        boolean boolean12 = complex7.equals((java.lang.Object) complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex9 = complex5.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj11 = complex10.readResolve();
        boolean boolean13 = complex10.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex5.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex17.cos();
        org.apache.commons.math.complex.Complex complex22 = complex20.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        double double24 = complex22.abs();
        org.apache.commons.math.complex.Complex complex25 = complex5.subtract(complex22);
        java.lang.String str26 = complex5.toString();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        double double30 = complex28.getReal();
        java.lang.String str31 = complex28.toString();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean33 = complex32.isNaN();
        double double34 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = complex32.cos();
        org.apache.commons.math.complex.Complex complex36 = complex28.pow(complex35);
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex38 = complex5.add(complex35);
        boolean boolean39 = complex38.isInfinite();
        java.lang.String str40 = complex38.toString();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex38.subtract(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex((double) 10L, (double) ' ');
        org.apache.commons.math.complex.ComplexField complexField48 = complex47.getField();
        org.apache.commons.math.complex.Complex complex49 = complex47.sqrt();
        double double50 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex51 = complex1.add(complex47);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.abs();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj56 = complex55.readResolve();
        boolean boolean57 = complex53.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex58 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex51.pow(complex53);
        double double60 = complex53.abs();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.exp();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField64 = complex63.getField();
        org.apache.commons.math.complex.Complex complex65 = complex61.add(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex61.cosh();
        double double67 = complex66.getArgument();
        org.apache.commons.math.complex.Complex complex70 = complex66.createComplex(0.0d, 7.544137102816975d);
        org.apache.commons.math.complex.Complex complex71 = complex53.multiply(complex66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex44 and complex66", complex44.equals(complex66) ? complex44.hashCode() == complex66.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj25 = complex24.readResolve();
        double double26 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex22.multiply(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.atan();
        double double34 = complex31.getArgument();
        org.apache.commons.math.complex.Complex complex35 = complex31.exp();
        org.apache.commons.math.complex.Complex complex36 = complex28.subtract(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex15.subtract(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math.complex.Complex complex6 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex3.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        double double9 = complex8.getReal();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        double double11 = complex8.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex10", complex0.equals(complex10) ? complex0.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.conjugate();
        double double7 = complex6.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj3 = complex2.readResolve();
        boolean boolean5 = complex2.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex9 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        double double12 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.multiply((-2.356194490192345d));
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (short) 0, Double.NaN);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj21 = complex20.readResolve();
        boolean boolean23 = complex20.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex24 = complex20.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math.complex.Complex complex32 = complex25.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex30.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean35 = complex34.isNaN();
        double double36 = complex34.getImaginary();
        double double37 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean43 = complex42.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex38.subtract(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex34.divide(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex33.multiply(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex33.createComplex((-0.0d), (double) 1L);
        org.apache.commons.math.complex.Complex complex50 = complex16.subtract(complex33);
        org.apache.commons.math.complex.Complex complex51 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = complex6.divide(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex49", complex0.equals(complex49) ? complex0.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex16", complex4.equals(complex16) ? complex4.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex11", complex4.equals(complex11) ? complex4.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        java.lang.String str18 = complex16.toString();
        org.apache.commons.math.complex.Complex complex19 = complex16.conjugate();
        double double20 = complex16.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex19", complex13.equals(complex19) ? complex13.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex16.sqrt();
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex12.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex27 = complex23.createComplex((double) 1L, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex22.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj30 = complex29.readResolve();
        boolean boolean32 = complex29.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex33 = complex29.negate();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj35 = complex34.readResolve();
        boolean boolean37 = complex34.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex38 = complex34.exp();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex29.subtract(complex38);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex41.sqrt1z();
        org.apache.commons.math.complex.Complex complex44 = complex41.cos();
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex47 = complex46.asin();
        double double48 = complex46.abs();
        org.apache.commons.math.complex.Complex complex49 = complex29.subtract(complex46);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math.complex.Complex complex52 = complex50.sqrt1z();
        org.apache.commons.math.complex.Complex complex53 = complex52.tan();
        org.apache.commons.math.complex.Complex complex54 = complex29.multiply(complex52);
        org.apache.commons.math.complex.Complex complex55 = complex23.multiply(complex29);
        org.apache.commons.math.complex.Complex complex56 = complex23.asin();
        org.apache.commons.math.complex.Complex complex57 = complex56.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex56", complex18.equals(complex56) ? complex18.hashCode() == complex56.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex16.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex16", complex4.equals(complex16) ? complex4.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 1.0f, Double.NEGATIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex7.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        double double20 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex21.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex24 = complex17.pow(complex21);
        boolean boolean25 = complex24.isInfinite();
        org.apache.commons.math.complex.Complex complex28 = complex24.createComplex(Double.NaN, 0.9126365759632115d);
        org.apache.commons.math.complex.Complex complex29 = complex24.negate();
        double double30 = complex29.abs();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex0.multiply(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex29 and complex32", complex29.equals(complex32) ? complex29.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        boolean boolean10 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.asin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex14.isNaN();
        double double16 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex14.atan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean19 = complex18.isNaN();
        double double20 = complex18.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = complex18.cos();
        org.apache.commons.math.complex.Complex complex22 = complex17.add(complex18);
        org.apache.commons.math.complex.Complex complex23 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex13", complex9.equals(complex13) ? complex9.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex(1.253170784117739d, 1.3101624706687731d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex15", complex12.equals(complex15) ? complex12.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        boolean boolean2 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex3.cos();
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex12 = complex8.log();
        org.apache.commons.math.complex.Complex complex13 = complex0.pow(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex16 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = complex13.acos();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) (byte) 1, Double.NaN);
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        double double24 = complex23.getImaginary();
        double double25 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex23.log();
        org.apache.commons.math.complex.Complex complex27 = complex20.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.exp();
        double double32 = complex31.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex34 = complex31.atan();
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex38 = complex37.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex29.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex17.pow(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex17", complex5.equals(complex17) ? complex5.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        boolean boolean5 = complex4.isNaN();
        org.apache.commons.math.complex.ComplexField complexField6 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        org.apache.commons.math.complex.Complex complex12 = complex4.multiply(complex7);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj19 = complex18.readResolve();
        boolean boolean21 = complex18.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex22 = complex18.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex23.subtract(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex23.sin();
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        boolean boolean31 = complex15.equals((java.lang.Object) complex29);
        org.apache.commons.math.complex.Complex complex32 = complex7.divide(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex7.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex38 = complex34.createComplex((double) 1L, (double) 'a');
        double double39 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex40 = complex34.negate();
        org.apache.commons.math.complex.Complex complex41 = complex34.cos();
        org.apache.commons.math.complex.Complex complex43 = complex34.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex44 = complex34.cos();
        org.apache.commons.math.complex.Complex complex45 = complex7.subtract(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex41", complex7.equals(complex41) ? complex7.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex6.atan();
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex13 = complex4.multiply(complex9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        double double6 = complex5.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.tan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex2.add(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex15", complex12.equals(complex15) ? complex12.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex4.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex7 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj16 = complex15.readResolve();
        boolean boolean18 = complex15.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex19 = complex15.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex20.subtract(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex20.sin();
        org.apache.commons.math.complex.Complex complex27 = complex26.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math.complex.Complex complex29 = complex13.multiply(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex8.multiply(complex13);
        org.apache.commons.math.complex.Complex complex31 = complex4.divide(complex8);
        org.apache.commons.math.complex.Complex complex32 = complex4.asin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        double double35 = complex34.getImaginary();
        double double36 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex37 = complex34.log();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex38.cos();
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex44 = complex43.asin();
        org.apache.commons.math.complex.Complex complex45 = complex44.acos();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj47 = complex46.readResolve();
        double double48 = complex46.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex44.multiply(complex46);
        org.apache.commons.math.complex.Complex complex50 = complex44.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex37.divide(complex44);
        org.apache.commons.math.complex.Complex complex52 = complex51.negate();
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = complex4.pow(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex32", complex2.equals(complex32) ? complex2.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex8", complex6.equals(complex8) ? complex6.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.conjugate();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        boolean boolean11 = complex9.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex9.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex12", complex9.equals(complex12) ? complex9.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField11 = complex10.getField();
        org.apache.commons.math.complex.Complex complex12 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj14 = complex13.readResolve();
        boolean boolean16 = complex13.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex12.subtract(complex13);
        boolean boolean19 = complex18.isInfinite();
        double double20 = complex18.getArgument();
        double double21 = complex18.abs();
        org.apache.commons.math.complex.Complex complex22 = complex5.divide(complex18);
        java.lang.String str23 = complex5.toString();
        double double24 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex5.negate();
        org.apache.commons.math.complex.Complex complex26 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex26", complex0.equals(complex26) ? complex0.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex7 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj16 = complex15.readResolve();
        boolean boolean18 = complex15.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex19 = complex15.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex20.subtract(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex20.sin();
        org.apache.commons.math.complex.Complex complex27 = complex26.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.cos();
        org.apache.commons.math.complex.Complex complex29 = complex13.multiply(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex8.multiply(complex13);
        org.apache.commons.math.complex.Complex complex31 = complex4.divide(complex8);
        org.apache.commons.math.complex.Complex complex32 = complex4.asin();
        boolean boolean33 = complex4.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex32", complex2.equals(complex32) ? complex2.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        java.lang.Object obj5 = complex4.readResolve();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        double double7 = complex4.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        java.lang.String str2 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) '#');
        org.apache.commons.math.complex.Complex complex6 = complex0.pow(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj8 = complex7.readResolve();
        boolean boolean10 = complex7.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex11 = complex7.negate();
        org.apache.commons.math.complex.Complex complex12 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (short) 100, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex16 = complex5.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        double double21 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex22 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex25 = complex17.pow(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        double double30 = complex29.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex34 = complex27.pow(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex27.sin();
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) 100L, (double) 1L);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex(100.0d, Double.NaN);
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        boolean boolean43 = complex38.equals((java.lang.Object) complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.sinh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex42.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex47 = complex15.subtract(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex26", complex1.equals(complex26) ? complex1.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((double) (short) 10);
        double double15 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        boolean boolean19 = complex16.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex20 = complex16.sin();
        org.apache.commons.math.complex.Complex complex21 = complex12.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex6.divide(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex20.conjugate();
        java.lang.Object obj24 = complex23.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex23", complex20.equals(complex23) ? complex20.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '#', (double) (short) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex11.acos();
        java.lang.String str14 = complex11.toString();
        org.apache.commons.math.complex.Complex complex17 = complex11.createComplex(4.574764116289713d, (double) (byte) 1);
        boolean boolean18 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex19 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex2.divide(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex19", complex11.equals(complex19) ? complex11.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex4.asin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex4.multiply(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex4.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex4.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex12", complex7.equals(complex12) ? complex7.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex2.getArgument();
        java.lang.String str6 = complex2.toString();
        org.apache.commons.math.complex.Complex complex7 = complex2.cos();
        org.apache.commons.math.complex.Complex complex8 = complex2.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField20 = complex19.getField();
        org.apache.commons.math.complex.Complex complex21 = complex17.add(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        boolean boolean24 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex19.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex25.log();
        org.apache.commons.math.complex.Complex complex27 = complex25.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex16.multiply(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex23", complex13.equals(complex23) ? complex13.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex2.getArgument();
        java.lang.String str6 = complex2.toString();
        org.apache.commons.math.complex.Complex complex7 = complex2.cos();
        double double8 = complex7.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        double double13 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex17 = complex10.pow(complex14);
        boolean boolean18 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex17.createComplex(Double.NaN, 0.9126365759632115d);
        org.apache.commons.math.complex.Complex complex22 = complex17.negate();
        double double23 = complex22.abs();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex22.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex25", complex22.equals(complex25) ? complex22.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex11", complex9.equals(complex11) ? complex9.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        double double5 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((-0.0d), (double) 1.0f);
        org.apache.commons.math.complex.Complex complex9 = complex4.atan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj16 = complex15.readResolve();
        boolean boolean18 = complex15.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex14.subtract(complex15);
        java.lang.Object obj21 = complex20.readResolve();
        org.apache.commons.math.complex.Complex complex23 = complex20.multiply((double) (byte) 100);
        double double24 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex20.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math.complex.Complex complex29 = complex20.divide(complex28);
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex20.nthRoot(100);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj35 = complex34.readResolve();
        boolean boolean37 = complex34.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex38 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex39 = complex32.asin();
        org.apache.commons.math.complex.Complex complex40 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex20.divide(complex32);
        boolean boolean42 = complex4.equals((java.lang.Object) complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex27", complex8.equals(complex27) ? complex8.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, (double) (short) 0);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        double double4 = complex2.abs();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        double double8 = complex6.getReal();
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.cos();
        org.apache.commons.math.complex.Complex complex14 = complex6.pow(complex13);
        org.apache.commons.math.complex.ComplexField complexField15 = complex13.getField();
        org.apache.commons.math.complex.Complex complex16 = complex2.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex13.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex17.nthRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex0.multiply(54.03023058681398d);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math.complex.Complex complex12 = complex5.pow(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        java.lang.Object obj15 = complex13.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex14", complex9.equals(complex14) ? complex9.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        double double11 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((double) (short) 10);
        double double15 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        boolean boolean19 = complex16.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex20 = complex16.sin();
        org.apache.commons.math.complex.Complex complex21 = complex12.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex6.divide(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex23.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex23", complex20.equals(complex23) ? complex20.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean6 = complex3.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex7 = complex3.negate();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj9 = complex8.readResolve();
        boolean boolean11 = complex8.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex12 = complex8.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex3.subtract(complex12);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex15.cos();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        double double22 = complex20.abs();
        org.apache.commons.math.complex.Complex complex23 = complex3.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex3.multiply(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex2.add(complex26);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean31 = complex30.isNaN();
        double double32 = complex30.getImaginary();
        org.apache.commons.math.complex.Complex complex33 = complex30.cos();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.exp();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.exp();
        double double38 = complex37.getImaginary();
        org.apache.commons.math.complex.Complex complex39 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex39.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex42 = complex34.pow(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = complex43.tanh();
        boolean boolean45 = complex43.isInfinite();
        org.apache.commons.math.complex.Complex complex46 = complex30.multiply(complex43);
        double double47 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex48 = complex29.add(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.exp();
        double double51 = complex50.getImaginary();
        double double52 = complex50.getReal();
        org.apache.commons.math.complex.Complex complex53 = complex50.log();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.exp();
        org.apache.commons.math.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex54.cos();
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex60 = complex59.asin();
        org.apache.commons.math.complex.Complex complex61 = complex60.acos();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj63 = complex62.readResolve();
        double double64 = complex62.getArgument();
        org.apache.commons.math.complex.Complex complex65 = complex60.multiply(complex62);
        org.apache.commons.math.complex.Complex complex66 = complex60.sqrt1z();
        org.apache.commons.math.complex.Complex complex67 = complex53.divide(complex60);
        org.apache.commons.math.complex.Complex complex68 = complex67.negate();
        org.apache.commons.math.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math.complex.Complex complex70 = complex29.multiply(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex29.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex70", complex2.equals(complex70) ? complex2.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        boolean boolean10 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex12.log();
        org.apache.commons.math.complex.Complex complex14 = complex12.cos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex15.sqrt();
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.exp();
        double double25 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex29 = complex21.pow(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex21.sqrt1z();
        boolean boolean31 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex20.subtract(complex21);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj34 = complex33.readResolve();
        boolean boolean36 = complex33.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.exp();
        double double42 = complex41.getImaginary();
        org.apache.commons.math.complex.Complex complex43 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math.complex.Complex complex45 = complex38.add(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex43.exp();
        org.apache.commons.math.complex.Complex complex47 = complex43.log();
        org.apache.commons.math.complex.Complex complex48 = complex32.subtract(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex47.acos();
        java.lang.String str50 = complex49.toString();
        org.apache.commons.math.complex.Complex complex51 = complex12.divide(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex14 = complex4.createComplex(1.0d, 10.0d);
        double double15 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex4.acos();
        org.apache.commons.math.complex.Complex complex17 = complex4.conjugate();
        java.lang.String str18 = complex17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex17", complex4.equals(complex17) ? complex4.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply(0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        double double1 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex2 = complex0.negate();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        double double13 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex17 = complex9.pow(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        boolean boolean20 = complex18.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex5.multiply(complex18);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (byte) 1, Double.NaN);
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        double double28 = complex27.getImaginary();
        double double29 = complex27.getReal();
        org.apache.commons.math.complex.Complex complex30 = complex27.log();
        org.apache.commons.math.complex.Complex complex31 = complex24.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.exp();
        double double34 = complex33.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex36 = complex30.multiply(complex33);
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField41 = complex40.getField();
        org.apache.commons.math.complex.Complex complex42 = complex38.add(complex40);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj44 = complex43.readResolve();
        boolean boolean46 = complex43.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField47 = complex43.getField();
        org.apache.commons.math.complex.Complex complex48 = complex42.subtract(complex43);
        java.lang.Object obj49 = complex48.readResolve();
        org.apache.commons.math.complex.Complex complex51 = complex48.multiply((double) (byte) 100);
        double double52 = complex48.getArgument();
        org.apache.commons.math.complex.Complex complex54 = complex48.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex58 = complex57.exp();
        double double59 = complex58.getImaginary();
        org.apache.commons.math.complex.Complex complex60 = complex58.sinh();
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex63 = complex55.pow(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        org.apache.commons.math.complex.Complex complex65 = complex64.tanh();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex67 = complex66.exp();
        double double68 = complex67.getImaginary();
        org.apache.commons.math.complex.Complex complex69 = complex67.sinh();
        org.apache.commons.math.complex.Complex complex71 = complex69.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex72 = complex65.pow(complex69);
        double double73 = complex65.abs();
        org.apache.commons.math.complex.Complex complex74 = complex48.subtract(complex65);
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex76 = complex75.exp();
        org.apache.commons.math.complex.Complex complex77 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex78 = complex77.exp();
        double double79 = complex78.getImaginary();
        org.apache.commons.math.complex.Complex complex80 = complex78.sinh();
        org.apache.commons.math.complex.Complex complex82 = complex80.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex83 = complex75.pow(complex82);
        org.apache.commons.math.complex.Complex complex84 = complex82.asin();
        org.apache.commons.math.complex.Complex complex85 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex86 = complex85.sin();
        org.apache.commons.math.complex.Complex complex87 = complex82.multiply(complex85);
        org.apache.commons.math.complex.Complex complex88 = complex65.pow(complex85);
        boolean boolean89 = complex37.equals((java.lang.Object) complex85);
        org.apache.commons.math.complex.Complex complex90 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex91 = complex90.exp();
        org.apache.commons.math.complex.Complex complex92 = complex90.sqrt1z();
        org.apache.commons.math.complex.Complex complex93 = complex90.cos();
        boolean boolean94 = complex93.isNaN();
        org.apache.commons.math.complex.Complex complex95 = complex93.exp();
        org.apache.commons.math.complex.Complex complex96 = complex85.multiply(complex95);
        org.apache.commons.math.complex.Complex complex97 = complex5.multiply(complex95);
        org.apache.commons.math.complex.Complex complex98 = complex3.multiply(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex95 and complex97", complex95.equals(complex97) ? complex95.hashCode() == complex97.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = complex2.acos();
        java.lang.String str4 = complex2.toString();
        org.apache.commons.math.complex.Complex complex5 = complex2.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean8 = complex7.isNaN();
        double double9 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex11.isNaN();
        double double13 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex11.cos();
        org.apache.commons.math.complex.Complex complex15 = complex10.add(complex11);
        org.apache.commons.math.complex.Complex complex16 = complex5.divide(complex10);
        org.apache.commons.math.complex.Complex complex17 = complex10.log();
        org.apache.commons.math.complex.Complex complex18 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean21 = complex20.isNaN();
        double double22 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex20.cos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        double double28 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex29 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex32 = complex24.pow(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.tanh();
        boolean boolean35 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex36 = complex20.multiply(complex33);
        org.apache.commons.math.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math.complex.Complex complex38 = complex37.negate();
        org.apache.commons.math.complex.Complex complex39 = complex17.subtract(complex37);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj41 = complex40.readResolve();
        boolean boolean43 = complex40.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex44 = complex40.exp();
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex45.subtract(complex49);
        double double51 = complex50.abs();
        org.apache.commons.math.complex.Complex complex52 = complex50.asin();
        org.apache.commons.math.complex.ComplexField complexField53 = complex50.getField();
        org.apache.commons.math.complex.Complex complex54 = complex17.multiply(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex55", complex17.equals(complex55) ? complex17.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex2.getArgument();
        java.lang.String str6 = complex2.toString();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.asin();
        double double9 = complex2.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.cos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex9 = complex5.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj13 = complex12.readResolve();
        boolean boolean15 = complex12.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex16 = complex12.negate();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj18 = complex17.readResolve();
        boolean boolean20 = complex17.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex21 = complex17.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex12.subtract(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = complex24.cos();
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex30 = complex29.asin();
        double double31 = complex29.abs();
        org.apache.commons.math.complex.Complex complex32 = complex12.subtract(complex29);
        java.lang.String str33 = complex12.toString();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.exp();
        double double36 = complex35.getImaginary();
        double double37 = complex35.getReal();
        java.lang.String str38 = complex35.toString();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean40 = complex39.isNaN();
        double double41 = complex39.getImaginary();
        org.apache.commons.math.complex.Complex complex42 = complex39.cos();
        org.apache.commons.math.complex.Complex complex43 = complex35.pow(complex42);
        org.apache.commons.math.complex.ComplexField complexField44 = complex42.getField();
        org.apache.commons.math.complex.Complex complex45 = complex12.add(complex42);
        boolean boolean46 = complex45.isInfinite();
        java.lang.String str47 = complex45.toString();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex49 = complex48.exp();
        org.apache.commons.math.complex.Complex complex50 = complex45.subtract(complex48);
        org.apache.commons.math.complex.Complex complex51 = complex48.cos();
        org.apache.commons.math.complex.Complex complex54 = complex51.createComplex((double) 10L, (double) ' ');
        org.apache.commons.math.complex.Complex complex55 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt();
        boolean boolean57 = complex11.equals((java.lang.Object) complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex24", complex8.equals(complex24) ? complex8.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex16.sqrt();
        double double20 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex12.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex27 = complex23.createComplex((double) 1L, (double) 'a');
        org.apache.commons.math.complex.Complex complex28 = complex22.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex37 = complex29.pow(complex36);
        double double38 = complex37.getReal();
        org.apache.commons.math.complex.Complex complex39 = complex22.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex37.acos();
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex40", complex18.equals(complex40) ? complex18.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math.complex.Complex complex6 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex3.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex8 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj10 = complex9.readResolve();
        boolean boolean12 = complex9.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField13 = complex9.getField();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex9);
        java.lang.Object obj15 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex16 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex2.multiply(complex14);
        java.lang.String str18 = complex2.toString();
        org.apache.commons.math.complex.Complex complex19 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex2.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex19", complex2.equals(complex19) ? complex2.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.negate();
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex18.log();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.exp();
        double double25 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex29 = complex21.pow(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.exp();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex30.multiply(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex30.multiply(52.0d);
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) 1L, (double) '#');
        org.apache.commons.math.complex.Complex complex42 = complex38.tanh();
        double double43 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex42.asin();
        org.apache.commons.math.complex.Complex complex45 = complex20.divide(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex44.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex45", complex18.equals(complex45) ? complex18.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex6 = complex1.multiply((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj8 = complex7.readResolve();
        boolean boolean10 = complex7.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex11 = complex7.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex12.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex12.asin();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        double double20 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.negate();
        boolean boolean24 = complex1.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex25 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj27 = complex26.readResolve();
        boolean boolean29 = complex26.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex30 = complex26.exp();
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj33 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex34 = complex30.multiply(complex32);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        double double37 = complex36.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((double) (short) 10);
        double double41 = complex38.getReal();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.exp();
        boolean boolean45 = complex42.equals((java.lang.Object) 100L);
        org.apache.commons.math.complex.Complex complex46 = complex42.sin();
        org.apache.commons.math.complex.Complex complex47 = complex38.divide(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex32.divide(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex1.multiply(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex25", complex1.equals(complex25) ? complex1.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, (double) (short) 0);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        double double4 = complex2.abs();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getImaginary();
        double double8 = complex6.getReal();
        java.lang.String str9 = complex6.toString();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex10.isNaN();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.cos();
        org.apache.commons.math.complex.Complex complex14 = complex6.pow(complex13);
        org.apache.commons.math.complex.ComplexField complexField15 = complex13.getField();
        org.apache.commons.math.complex.Complex complex16 = complex2.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        double double22 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = complex18.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex28.cos();
        org.apache.commons.math.complex.Complex complex30 = complex13.subtract(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex13 and complex17", complex13.equals(complex17) ? complex13.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex4.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex11", complex4.equals(complex11) ? complex4.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.negate();
        org.apache.commons.math.complex.Complex complex7 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj6 = complex5.readResolve();
        boolean boolean8 = complex5.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex4.exp();
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply((double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex16", complex4.equals(complex16) ? complex4.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.abs();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj4 = complex3.readResolve();
        boolean boolean5 = complex1.equals((java.lang.Object) complex3);
        org.apache.commons.math.complex.Complex complex6 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex1.multiply(2.8949979108172723d);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj10 = complex9.readResolve();
        boolean boolean12 = complex9.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex13 = complex9.exp();
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex15.cos();
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex24 = complex13.subtract(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) 'a', (double) (byte) 0);
        double double29 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj31 = complex30.readResolve();
        boolean boolean33 = complex30.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex34 = complex30.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex25.pow(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex35.cosh();
        boolean boolean38 = complex8.equals((java.lang.Object) complex35);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.exp();
        org.apache.commons.math.complex.Complex complex41 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = complex39.cos();
        org.apache.commons.math.complex.Complex complex44 = complex42.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex48 = complex44.log();
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex48.sin();
        org.apache.commons.math.complex.Complex complex51 = complex50.asin();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.getImaginary();
        org.apache.commons.math.complex.Complex complex55 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex53.atan();
        org.apache.commons.math.complex.Complex complex58 = complex53.multiply((-2.356194490192345d));
        org.apache.commons.math.complex.Complex complex59 = complex58.negate();
        org.apache.commons.math.complex.Complex complex60 = complex59.exp();
        org.apache.commons.math.complex.Complex complex61 = complex51.pow(complex59);
        org.apache.commons.math.complex.Complex complex62 = complex51.sin();
        org.apache.commons.math.complex.Complex complex63 = complex35.add(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex50 and complex62", complex50.equals(complex62) ? complex50.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        boolean boolean7 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj9 = complex8.readResolve();
        boolean boolean11 = complex8.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex12 = complex8.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1.0f), (double) 10L);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex13.subtract(complex17);
        double double19 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex20 = complex5.add(complex18);
        boolean boolean21 = complex4.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex22 = complex4.conjugate();
        java.lang.Class<?> wildcardClass23 = complex4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = complex6.cos();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex15 = complex4.subtract(complex11);
        java.lang.Object obj16 = complex15.readResolve();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex15.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        double double21 = complex20.getImaginary();
        double double22 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex20.log();
        org.apache.commons.math.complex.Complex complex24 = complex15.pow(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex20.negate();
        org.apache.commons.math.complex.Complex complex26 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math.complex.Complex complex29 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex27.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        org.apache.commons.math.complex.Complex complex36 = complex26.pow(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex26", complex7.equals(complex26) ? complex7.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) 1L, (double) 'a');
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (byte) 1, Double.NaN);
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        double double23 = complex22.getImaginary();
        double double24 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex22.log();
        org.apache.commons.math.complex.Complex complex26 = complex19.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex25.multiply(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField36 = complex35.getField();
        org.apache.commons.math.complex.Complex complex37 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj39 = complex38.readResolve();
        boolean boolean41 = complex38.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField42 = complex38.getField();
        org.apache.commons.math.complex.Complex complex43 = complex37.subtract(complex38);
        java.lang.Object obj44 = complex43.readResolve();
        org.apache.commons.math.complex.Complex complex46 = complex43.multiply((double) (byte) 100);
        double double47 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex43.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.getImaginary();
        org.apache.commons.math.complex.Complex complex55 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex58 = complex50.pow(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.exp();
        double double63 = complex62.getImaginary();
        org.apache.commons.math.complex.Complex complex64 = complex62.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex64.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex67 = complex60.pow(complex64);
        double double68 = complex60.abs();
        org.apache.commons.math.complex.Complex complex69 = complex43.subtract(complex60);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex71 = complex70.exp();
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex73 = complex72.exp();
        double double74 = complex73.getImaginary();
        org.apache.commons.math.complex.Complex complex75 = complex73.sinh();
        org.apache.commons.math.complex.Complex complex77 = complex75.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex78 = complex70.pow(complex77);
        org.apache.commons.math.complex.Complex complex79 = complex77.asin();
        org.apache.commons.math.complex.Complex complex80 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex81 = complex80.sin();
        org.apache.commons.math.complex.Complex complex82 = complex77.multiply(complex80);
        org.apache.commons.math.complex.Complex complex83 = complex60.pow(complex80);
        boolean boolean84 = complex32.equals((java.lang.Object) complex80);
        org.apache.commons.math.complex.Complex complex85 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex86 = complex85.exp();
        org.apache.commons.math.complex.Complex complex87 = complex85.sqrt1z();
        org.apache.commons.math.complex.Complex complex88 = complex85.cos();
        boolean boolean89 = complex88.isNaN();
        org.apache.commons.math.complex.Complex complex90 = complex88.exp();
        org.apache.commons.math.complex.Complex complex91 = complex80.multiply(complex90);
        org.apache.commons.math.complex.Complex complex92 = complex0.multiply(complex90);
        org.apache.commons.math.complex.Complex complex93 = complex92.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex90 and complex92", complex90.equals(complex92) ? complex90.hashCode() == complex92.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj1 = complex0.readResolve();
        boolean boolean3 = complex0.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        double double9 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex5.add(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex17 = complex13.createComplex((double) 1L, (double) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex17.log();
        org.apache.commons.math.complex.Complex complex19 = complex18.asin();
        org.apache.commons.math.complex.Complex complex20 = complex10.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.acos();
        org.apache.commons.math.complex.Complex complex25 = complex24.acos();
        double double26 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex19.multiply(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex32 = complex28.createComplex((double) (-1L), (double) 0);
        org.apache.commons.math.complex.Complex complex33 = complex32.negate();
        org.apache.commons.math.complex.Complex complex34 = complex19.multiply(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex33", complex7.equals(complex33) ? complex7.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.log();
        org.apache.commons.math.complex.Complex complex11 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.exp();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        double double18 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex11.add(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex11", complex9.equals(complex11) ? complex9.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex12.multiply(1.4711276743037347d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex15", complex12.equals(complex15) ? complex12.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        double double11 = complex9.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex10", complex9.equals(complex10) ? complex9.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.add(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj20 = complex19.readResolve();
        boolean boolean22 = complex19.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField23 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = complex18.subtract(complex19);
        boolean boolean25 = complex24.isInfinite();
        double double26 = complex24.getArgument();
        double double27 = complex24.abs();
        org.apache.commons.math.complex.Complex complex28 = complex11.divide(complex24);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj35 = complex34.readResolve();
        boolean boolean37 = complex34.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField38 = complex34.getField();
        org.apache.commons.math.complex.Complex complex39 = complex33.subtract(complex34);
        boolean boolean40 = complex39.isInfinite();
        org.apache.commons.math.complex.Complex complex41 = complex39.acos();
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex44 = complex43.exp();
        double double45 = complex43.getImaginary();
        org.apache.commons.math.complex.Complex complex46 = complex24.multiply(complex43);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj48 = complex47.readResolve();
        org.apache.commons.math.complex.Complex complex49 = complex47.conjugate();
        org.apache.commons.math.complex.Complex complex51 = complex47.multiply(54.03023058681398d);
        org.apache.commons.math.complex.Complex complex52 = complex51.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex51.log();
        org.apache.commons.math.complex.ComplexField complexField54 = complex53.getField();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex56 = complex55.exp();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField58 = complex57.getField();
        org.apache.commons.math.complex.Complex complex59 = complex55.add(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex57.acos();
        boolean boolean61 = complex53.equals((java.lang.Object) complex57);
        org.apache.commons.math.complex.Complex complex62 = complex57.negate();
        org.apache.commons.math.complex.Complex complex63 = complex46.add(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex28 and complex60", complex28.equals(complex60) ? complex28.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean1 = complex0.isNaN();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex12 = complex4.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        boolean boolean15 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex0.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (byte) 1, Double.NaN);
        org.apache.commons.math.complex.Complex complex20 = complex19.cos();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.exp();
        double double23 = complex22.getImaginary();
        double double24 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex22.log();
        org.apache.commons.math.complex.Complex complex26 = complex19.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        double double29 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex25.multiply(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField36 = complex35.getField();
        org.apache.commons.math.complex.Complex complex37 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj39 = complex38.readResolve();
        boolean boolean41 = complex38.equals((java.lang.Object) 10);
        org.apache.commons.math.complex.ComplexField complexField42 = complex38.getField();
        org.apache.commons.math.complex.Complex complex43 = complex37.subtract(complex38);
        java.lang.Object obj44 = complex43.readResolve();
        org.apache.commons.math.complex.Complex complex46 = complex43.multiply((double) (byte) 100);
        double double47 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex49 = complex43.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        double double54 = complex53.getImaginary();
        org.apache.commons.math.complex.Complex complex55 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex58 = complex50.pow(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.exp();
        double double63 = complex62.getImaginary();
        org.apache.commons.math.complex.Complex complex64 = complex62.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex64.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex67 = complex60.pow(complex64);
        double double68 = complex60.abs();
        org.apache.commons.math.complex.Complex complex69 = complex43.subtract(complex60);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex71 = complex70.exp();
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex73 = complex72.exp();
        double double74 = complex73.getImaginary();
        org.apache.commons.math.complex.Complex complex75 = complex73.sinh();
        org.apache.commons.math.complex.Complex complex77 = complex75.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex78 = complex70.pow(complex77);
        org.apache.commons.math.complex.Complex complex79 = complex77.asin();
        org.apache.commons.math.complex.Complex complex80 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex81 = complex80.sin();
        org.apache.commons.math.complex.Complex complex82 = complex77.multiply(complex80);
        org.apache.commons.math.complex.Complex complex83 = complex60.pow(complex80);
        boolean boolean84 = complex32.equals((java.lang.Object) complex80);
        org.apache.commons.math.complex.Complex complex85 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex86 = complex85.exp();
        org.apache.commons.math.complex.Complex complex87 = complex85.sqrt1z();
        org.apache.commons.math.complex.Complex complex88 = complex85.cos();
        boolean boolean89 = complex88.isNaN();
        org.apache.commons.math.complex.Complex complex90 = complex88.exp();
        org.apache.commons.math.complex.Complex complex91 = complex80.multiply(complex90);
        org.apache.commons.math.complex.Complex complex92 = complex0.multiply(complex90);
        org.apache.commons.math.complex.Complex complex93 = complex92.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex90 and complex92", complex90.equals(complex92) ? complex90.hashCode() == complex92.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.add(complex2);
        org.apache.commons.math.complex.Complex complex5 = complex0.cosh();
        double double6 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        java.lang.Object obj9 = complex8.readResolve();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex16 = complex7.multiply(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex18 = complex7.sqrt();
        double double19 = complex18.getReal();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex20.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex26 = complex25.cos();
        boolean boolean27 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex22.pow(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex18.add(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex26", complex5.equals(complex26) ? complex5.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex8 = complex0.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        org.apache.commons.math.complex.Complex complex14 = complex10.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        double double16 = complex14.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex15", complex10.equals(complex15) ? complex10.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        double double8 = complex5.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex5.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        org.apache.commons.math.complex.Complex complex9 = complex8.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex8", complex2.equals(complex8) ? complex2.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex9 = complex5.log();
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = complex9.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.asin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex17 = complex14.atan();
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply((-2.356194490192345d));
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math.complex.Complex complex22 = complex12.pow(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex12.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        double double26 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex24.asin();
        org.apache.commons.math.complex.Complex complex28 = complex24.sin();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex33.log();
        org.apache.commons.math.complex.Complex complex35 = complex33.sqrt();
        boolean boolean36 = complex24.equals((java.lang.Object) complex35);
        org.apache.commons.math.complex.Complex complex37 = complex23.add(complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex23", complex11.equals(complex23) ? complex11.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex5 = complex3.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex(2.718281828459045d, (double) (-1));
        org.apache.commons.math.complex.Complex complex9 = complex5.log();
        org.apache.commons.math.complex.Complex complex10 = complex5.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        double double12 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex13 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        double double16 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex14.asin();
        org.apache.commons.math.complex.Complex complex18 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex10.pow(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex18", complex14.equals(complex18) ? complex14.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        double double2 = complex1.getImaginary();
        double double3 = complex1.getReal();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex5.isNaN();
        double double7 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex5.cos();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex15", complex12.equals(complex15) ? complex12.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math.complex.Complex complex6 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply(2.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }
}

