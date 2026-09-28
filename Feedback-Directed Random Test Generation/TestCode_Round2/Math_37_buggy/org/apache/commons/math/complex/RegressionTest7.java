package org.apache.commons.math.complex;

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
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 100);
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(1);
        org.apache.commons.math.complex.Complex complex4 = complex3.reciprocal();
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.apache.commons.math.complex.Complex complex19 = complex14.subtract((double) (short) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean26 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex25.tan();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex30.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) '#');
        double double35 = complex32.abs();
        org.apache.commons.math.complex.Complex complex37 = complex32.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex32.negate();
        org.apache.commons.math.complex.Complex complex39 = complex27.subtract(complex32);
        org.apache.commons.math.complex.Complex complex40 = complex22.add(complex32);
        org.apache.commons.math.complex.Complex complex41 = complex32.sin();
        org.apache.commons.math.complex.Complex complex42 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex43 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex14.multiply(complex32);
        java.lang.Object obj45 = complex32.readResolve();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10000.499987500623d + "'", double35 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "(10000.0, 100.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "(10000.0, 100.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "(10000.0, 100.0)");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        double double26 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex27.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex30.sin();
        java.lang.String str34 = complex30.toString();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10000.0d + "'", double26 == 10000.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(-99.98000199980001, -1.9998000199980002)" + "'", str34, "(-99.98000199980001, -1.9998000199980002)");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.apache.commons.math.complex.Complex complex55 = complex53.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex56 = complex25.divide(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        org.apache.commons.math.complex.Complex complex58 = complex57.asin();
        org.apache.commons.math.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math.complex.Complex complex62 = complex59.createComplex(0.0d, (-9.903537547537045d));
        org.apache.commons.math.complex.Complex complex63 = complex59.exp();
        org.apache.commons.math.complex.Complex complex64 = complex63.sinh();
        double double65 = complex64.getReal();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10000.0d + "'", double42 == 10000.0d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-0.14271213868951826d) + "'", double65 == (-0.14271213868951826d));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        org.apache.commons.math.complex.Complex complex27 = complex24.add((double) 1.0f);
        double double28 = complex27.abs();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0001000099980001E8d + "'", double28 == 1.0001000099980001E8d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.apache.commons.math.complex.Complex complex23 = complex21.divide(0.0d);
        java.lang.Object obj24 = complex21.readResolve();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "(Infinity, Infinity)");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex(0.010000666686665239d, 10000.0d);
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex4.subtract(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.negate();
        org.apache.commons.math.complex.Complex complex27 = complex26.acos();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.apache.commons.math.complex.Complex complex31 = complex22.multiply((-5.298292365610485d));
        org.apache.commons.math.complex.Complex complex32 = complex22.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt1z();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.009999500037496875d);
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex8.tan();
        org.apache.commons.math.complex.Complex complex12 = complex8.multiply((-1));
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math.complex.Complex complex21 = complex17.multiply((-1));
        boolean boolean22 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex25.multiply((int) (byte) 100);
        boolean boolean28 = complex27.isNaN();
        double double29 = complex27.getReal();
        org.apache.commons.math.complex.Complex complex30 = complex27.negate();
        org.apache.commons.math.complex.Complex complex31 = complex17.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean34 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex33.tan();
        org.apache.commons.math.complex.Complex complex36 = complex33.asin();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt1z();
        java.lang.Object obj38 = complex36.readResolve();
        org.apache.commons.math.complex.Complex complex39 = complex17.divide(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex12.pow(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex12.pow((double) 100);
        org.apache.commons.math.complex.Complex complex44 = complex1.pow(complex12);
        org.apache.commons.math.complex.Complex complex45 = complex1.acos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10000.0d + "'", double29 == 10000.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "(1.5707963267948966, -5.298292365610485)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "(1.5707963267948966, -5.298292365610485)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "(1.5707963267948966, -5.298292365610485)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        double double26 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex28 = complex25.subtract((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex30 = complex25.add((-1.0d));
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean34 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex33.tan();
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
        org.apache.commons.math.complex.Complex complex61 = complex40.multiply(complex58);
        org.apache.commons.math.complex.Complex complex62 = complex58.sin();
        org.apache.commons.math.complex.Complex complex63 = complex58.cos();
        org.apache.commons.math.complex.Complex complex66 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex68 = complex66.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex70 = complex68.add((double) '#');
        double double71 = complex68.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList73 = complex68.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex74 = complex58.multiply(complex68);
        org.apache.commons.math.complex.Complex complex75 = complex33.add(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex33.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList78 = complex33.nthRoot((int) (short) 1);
        boolean boolean79 = complex31.equals((java.lang.Object) complexList78);
        org.apache.commons.math.complex.Complex complex82 = new org.apache.commons.math.complex.Complex(0.0d, 0.010000666686665239d);
        org.apache.commons.math.complex.Complex complex83 = complex31.add(complex82);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10000.0d + "'", double26 == 10000.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complexList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10000.0d + "'", double52 == 10000.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10000.499987500623d + "'", double71 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complexList73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complexList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(complex83);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-0.7782526418622326d));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean6 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) '#');
        double double15 = complex12.abs();
        org.apache.commons.math.complex.Complex complex17 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex18 = complex12.negate();
        org.apache.commons.math.complex.Complex complex19 = complex7.subtract(complex12);
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex25.nthRoot((int) '#');
        boolean boolean30 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        boolean boolean36 = complex35.isNaN();
        double double37 = complex35.getReal();
        org.apache.commons.math.complex.Complex complex38 = complex25.subtract(complex35);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex45 = complex43.add((double) '#');
        org.apache.commons.math.complex.Complex complex46 = complex38.add(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex43.exp();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.log();
        boolean boolean50 = complex43.equals((java.lang.Object) complex48);
        org.apache.commons.math.complex.Complex complex51 = complex2.pow(complex48);
        boolean boolean52 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex53 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10000.499987500623d + "'", double15 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10000.0d + "'", double37 == 10000.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex3 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.tan();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((-1.413496251565358d));
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        double double29 = complex26.abs();
        org.apache.commons.math.complex.Complex complex30 = complex26.reciprocal();
        org.apache.commons.math.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math.complex.Complex complex32 = complex19.divide(complex26);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow((double) '4');
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
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
        org.apache.commons.math.complex.Complex complex55 = complex50.subtract((double) (short) 1);
        boolean boolean56 = complex55.isNaN();
        org.apache.commons.math.complex.Complex complex57 = complex35.add(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex55.negate();
        org.apache.commons.math.complex.Complex complex60 = complex58.pow((-90.0501256289338d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10000.499987500623d + "'", double29 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complexList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10000.0d + "'", double52 == 10000.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        boolean boolean61 = complex60.isNaN();
        double double62 = complex60.getReal();
        org.apache.commons.math.complex.Complex complex63 = complex60.acos();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexList21);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertNotNull(complexField31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10000.499987500623d + "'", double42 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10000.499987500623d + "'", double53 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0001E8d + "'", double62 == 1.0001E8d);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        org.apache.commons.math.complex.Complex complex50 = complex29.multiply(complex47);
        org.apache.commons.math.complex.Complex complex51 = complex29.sqrt();
        boolean boolean52 = complex24.equals((java.lang.Object) complex51);
        org.apache.commons.math.complex.Complex complex54 = complex51.divide(9.999E7d);
        org.apache.commons.math.complex.Complex complex55 = complex51.sin();
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex56.negate();
        org.apache.commons.math.complex.Complex complex59 = complex57.divide(9.999000066676663E-5d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10000.0d + "'", double41 == 10000.0d);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) '#');
        double double11 = complex8.abs();
        org.apache.commons.math.complex.Complex complex13 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math.complex.Complex complex15 = complex3.subtract(complex8);
        org.apache.commons.math.complex.Complex complex17 = complex8.subtract(9999.500037501875d);
        org.apache.commons.math.complex.Complex complex18 = complex8.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.add(9.998999999756389E-7d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10000.499987500623d + "'", double11 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.00499983334333262d, 10000.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex3.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex3.reciprocal();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(0);
        org.apache.commons.math.complex.Complex complex4 = complex1.reciprocal();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1, (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.valueOf((-9999.999950005d), (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex10.subtract(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex14 = complex7.add(complex10);
        org.apache.commons.math.complex.Complex complex16 = complex10.add((-3.1305308352318293d));
        org.apache.commons.math.complex.Complex complex17 = complex4.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex4.reciprocal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.acos();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex1.acos();
        double double5 = complex4.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.247154382013722d + "'", double5 == 1.247154382013722d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex9.subtract(10.0d);
        boolean boolean14 = complex13.isInfinite();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.499987500623d + "'", double7 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        double double29 = complex26.getReal();
        double double30 = complex26.abs();
        org.apache.commons.math.complex.ComplexField complexField31 = complex26.getField();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex36 = complex34.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex36.nthRoot(100);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex45 = complex43.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex47 = complex45.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList49 = complex45.nthRoot(100);
        boolean boolean50 = complex36.equals((java.lang.Object) complexList49);
        org.apache.commons.math.complex.Complex complex51 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex53 = complex51.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex54 = complex51.negate();
        org.apache.commons.math.complex.Complex complex55 = complex26.divide(complex54);
        double double56 = complex54.getReal();
        org.apache.commons.math.complex.Complex complex57 = complex54.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 9.999E7d + "'", double29 == 9.999E7d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0001E8d + "'", double30 == 1.0001E8d);
        org.junit.Assert.assertNotNull(complexField31);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexList40);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complexList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + Double.NEGATIVE_INFINITY + "'", double56 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex57);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.conjugate();
        java.lang.Object obj28 = complex27.readResolve();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "(9.999E7, -2000000.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "(9.999E7, -2000000.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "(9.999E7, -2000000.0)");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf(0.00999966673665524d, (double) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        double double9 = complex6.abs();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex12.tan();
        org.apache.commons.math.complex.Complex complex16 = complex6.add(complex12);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1.3440585709080678E43, 0.0)" + "'", str3, "(1.3440585709080678E43, 0.0)");
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.00000051542956d + "'", double9 == 97.00000051542956d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math.complex.Complex complex2 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.log();
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        double double29 = complex26.abs();
        org.apache.commons.math.complex.Complex complex30 = complex26.reciprocal();
        org.apache.commons.math.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math.complex.Complex complex32 = complex19.divide(complex26);
        org.apache.commons.math.complex.Complex complex34 = complex19.pow((double) '4');
        org.apache.commons.math.complex.Complex complex35 = complex19.conjugate();
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
        double double62 = complex61.getReal();
        org.apache.commons.math.complex.Complex complex64 = complex61.subtract((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex66 = complex61.add((-1.0d));
        org.apache.commons.math.complex.Complex complex67 = complex66.asin();
        org.apache.commons.math.complex.Complex complex69 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex70 = complex69.exp();
        org.apache.commons.math.complex.Complex complex71 = complex67.multiply(complex70);
        org.apache.commons.math.complex.Complex complex72 = complex19.multiply(complex67);
        org.apache.commons.math.complex.Complex complex73 = complex67.tan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10000.499987500623d + "'", double29 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complexList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10000.0d + "'", double52 == 10000.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10000.0d + "'", double62 == 10000.0d);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(9.903542595900264d);
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract((double) (short) 10);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex7 = complex5.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) '#');
        double double10 = complex7.abs();
        org.apache.commons.math.complex.Complex complex11 = complex7.reciprocal();
        org.apache.commons.math.complex.Complex complex12 = complex0.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        org.apache.commons.math.complex.Complex complex21 = complex20.reciprocal();
        double double22 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex20.divide(1.0001E8d);
        org.apache.commons.math.complex.Complex complex25 = complex0.add(complex20);
        org.apache.commons.math.complex.ComplexField complexField26 = complex20.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10000.499987500623d + "'", double10 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexField26);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean34 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        double double43 = complex40.abs();
        org.apache.commons.math.complex.Complex complex45 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex40.negate();
        org.apache.commons.math.complex.Complex complex47 = complex35.subtract(complex40);
        org.apache.commons.math.complex.Complex complex48 = complex30.add(complex40);
        org.apache.commons.math.complex.Complex complex49 = complex40.reciprocal();
        double double50 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex51 = complex40.log();
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex27.add(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex27.exp();
        org.apache.commons.math.complex.Complex complex55 = complex27.log();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10000.499987500623d + "'", double43 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex50.pow(complex51);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((int) (byte) 100);
        boolean boolean58 = complex57.isNaN();
        org.apache.commons.math.complex.Complex complex59 = complex57.tan();
        org.apache.commons.math.complex.Complex complex61 = complex57.multiply((-1));
        boolean boolean62 = complex57.isInfinite();
        org.apache.commons.math.complex.Complex complex63 = complex57.acos();
        org.apache.commons.math.complex.Complex complex64 = complex51.multiply(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex29.pow(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex65.sinh();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10000.0d + "'", double6 == 10000.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complexList39);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complexList48);
        org.junit.Assert.assertNotNull(complexField49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.apache.commons.math.complex.Complex complex22 = complex4.multiply((int) (byte) 0);
        java.lang.String str23 = complex4.toString();
        org.apache.commons.math.complex.Complex complex24 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList27 = complex25.nthRoot((int) (short) 10);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(10000.0, 100.0)" + "'", str19, "(10000.0, 100.0)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10000.0, 100.0)" + "'", str23, "(10000.0, 100.0)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        double double2 = complex1.getReal();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.sin();
        org.apache.commons.math.complex.Complex complex5 = complex1.atan();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex10 = complex8.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex10.nthRoot((int) '#');
        boolean boolean15 = complex10.isNaN();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        boolean boolean21 = complex20.isNaN();
        double double22 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex23.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex5.pow(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex5.sqrt1z();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10000.0d + "'", double22 == 10000.0d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f);
        double double2 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (short) 10);
        double double31 = complex28.getReal();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.divide(complex4);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex0.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.asin();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex21.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex21.nthRoot(100);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = complex30.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex30.nthRoot(100);
        boolean boolean35 = complex21.equals((java.lang.Object) complexList34);
        org.apache.commons.math.complex.Complex complex36 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex38 = complex36.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex39 = complex36.negate();
        org.apache.commons.math.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math.complex.Complex complex41 = complex39.tanh();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.multiply((int) (byte) 100);
        boolean boolean47 = complex46.isNaN();
        org.apache.commons.math.complex.Complex complex48 = complex46.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex48.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex51 = complex48.exp();
        org.apache.commons.math.complex.Complex complex52 = complex41.pow(complex48);
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean56 = complex55.isInfinite();
        org.apache.commons.math.complex.Complex complex57 = complex55.tan();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex62 = complex60.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex64 = complex62.add((double) '#');
        double double65 = complex62.abs();
        org.apache.commons.math.complex.Complex complex67 = complex62.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex68 = complex62.negate();
        org.apache.commons.math.complex.Complex complex69 = complex57.subtract(complex62);
        org.apache.commons.math.complex.Complex complex71 = complex62.multiply(0);
        org.apache.commons.math.complex.Complex complex72 = complex71.acos();
        java.lang.Class<?> wildcardClass73 = complex72.getClass();
        boolean boolean74 = complex52.equals((java.lang.Object) wildcardClass73);
        org.apache.commons.math.complex.Complex complex75 = complex16.add(complex52);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complexList50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10000.499987500623d + "'", double65 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(complex75);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean2 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract((-9.999000099990003E-7d));
        org.apache.commons.math.complex.Complex complex9 = complex6.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.negate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex1.nthRoot((int) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex1.subtract((-9.903537547537045d));
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.log();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (short) 100, (double) 100);
        java.lang.Object obj15 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex16 = complex14.asin();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = complex21.add((double) '#');
        double double24 = complex21.abs();
        org.apache.commons.math.complex.Complex complex25 = complex21.reciprocal();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) 100);
        double double28 = complex27.getReal();
        boolean boolean29 = complex27.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex27.sin();
        org.apache.commons.math.complex.Complex complex31 = complex21.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex34 = complex33.reciprocal();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex14.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex7.subtract(complex14);
        org.junit.Assert.assertNotNull(complexList3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "(100.0, 100.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "(100.0, 100.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "(100.0, 100.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10000.499987500623d + "'", double24 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.divide(complex4);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply(1.2113620263962437d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        org.apache.commons.math.complex.Complex complex8 = complex4.subtract((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex10 = complex4.subtract((-1.0d));
        org.apache.commons.math.complex.ComplexField complexField11 = complex10.getField();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        double double13 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex10.add(0.0d);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex20 = complex18.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) '#');
        org.apache.commons.math.complex.Complex complex24 = complex20.subtract((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex27 = complex24.negate();
        org.apache.commons.math.complex.Complex complex28 = complex27.asin();
        boolean boolean29 = complex10.equals((java.lang.Object) complex28);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.009998666886625247d + "'", double13 == 0.009998666886625247d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(10035.0d, 6.36469341704154E-7d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean6 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex12 = complex10.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) '#');
        double double15 = complex12.abs();
        org.apache.commons.math.complex.Complex complex17 = complex12.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex18 = complex12.negate();
        org.apache.commons.math.complex.Complex complex19 = complex7.subtract(complex12);
        org.apache.commons.math.complex.Complex complex20 = complex2.add(complex12);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex27 = complex25.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex25.nthRoot((int) '#');
        boolean boolean30 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex33.multiply((int) (byte) 100);
        boolean boolean36 = complex35.isNaN();
        double double37 = complex35.getReal();
        org.apache.commons.math.complex.Complex complex38 = complex25.subtract(complex35);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex45 = complex43.add((double) '#');
        org.apache.commons.math.complex.Complex complex46 = complex38.add(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex43.exp();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.log();
        boolean boolean50 = complex43.equals((java.lang.Object) complex48);
        org.apache.commons.math.complex.Complex complex51 = complex2.pow(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        java.lang.Object obj54 = complex53.readResolve();
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex57.multiply((int) (byte) 100);
        boolean boolean60 = complex59.isNaN();
        org.apache.commons.math.complex.Complex complex61 = complex59.tan();
        org.apache.commons.math.complex.Complex complex63 = complex59.multiply((-1));
        boolean boolean64 = complex59.isInfinite();
        org.apache.commons.math.complex.Complex complex65 = complex59.conjugate();
        org.apache.commons.math.complex.Complex complex66 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex67 = complex53.divide(complex59);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10000.499987500623d + "'", double15 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10000.0d + "'", double37 == 10000.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "(0.6508801680230075, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "(0.6508801680230075, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "(0.6508801680230075, 0.0)");
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(5.874956495094207d, 0.009964462429417354d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) 100);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean34 = complex33.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex38.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex42 = complex40.add((double) '#');
        double double43 = complex40.abs();
        org.apache.commons.math.complex.Complex complex45 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex46 = complex40.negate();
        org.apache.commons.math.complex.Complex complex47 = complex35.subtract(complex40);
        org.apache.commons.math.complex.Complex complex48 = complex30.add(complex40);
        org.apache.commons.math.complex.Complex complex49 = complex40.reciprocal();
        double double50 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex51 = complex40.log();
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex27.add(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex27.sin();
        org.apache.commons.math.complex.ComplexField complexField55 = complex27.getField();
        boolean boolean56 = complex27.isInfinite();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10000.0d + "'", double16 == 10000.0d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10000.499987500623d + "'", double43 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complexField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex3 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex0.subtract(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.tan();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (byte) 1, (double) 10L);
        org.apache.commons.math.complex.Complex complex11 = complex7.asin();
        java.lang.Class<?> wildcardClass12 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.add((double) 'a');
        org.apache.commons.math.complex.Complex complex13 = complex10.atan();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex16.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = complex18.add((double) '#');
        double double21 = complex18.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex18.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = complex18.atan();
        org.apache.commons.math.complex.Complex complex25 = complex13.subtract(complex24);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((int) (byte) 100);
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex30.tanh();
        java.lang.String str33 = complex32.toString();
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
        org.apache.commons.math.complex.Complex complex36 = complex24.subtract(complex35);
        org.apache.commons.math.complex.ComplexField complexField37 = complex24.getField();
        org.apache.commons.math.complex.Complex complex38 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex38.negate();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.499987500623d + "'", double7 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10000.499987500623d + "'", double21 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(NaN, -0.0)" + "'", str33, "(NaN, -0.0)");
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexField37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract(100.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) 100);
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex0.divide(complex4);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex11.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = complex0.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.apache.commons.math.complex.Complex complex37 = complex36.asin();
        org.apache.commons.math.complex.Complex complex38 = complex36.acos();
        org.apache.commons.math.complex.Complex complex39 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(35.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.499987500623d + "'", double7 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complexList31);
        org.junit.Assert.assertNotNull(complexField32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) '#');
        double double7 = complex4.abs();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = complex4.negate();
        org.apache.commons.math.complex.Complex complex12 = complex4.divide(9.999000083411612E-9d);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex17.nthRoot(100);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex26.nthRoot(100);
        boolean boolean31 = complex17.equals((java.lang.Object) complexList30);
        org.apache.commons.math.complex.Complex complex32 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex34 = complex17.pow((double) 100.0f);
        boolean boolean36 = complex34.equals((java.lang.Object) 100);
        org.apache.commons.math.complex.Complex complex37 = complex34.tan();
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = complex42.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex42.nthRoot((int) '#');
        boolean boolean47 = complex42.isNaN();
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((int) (byte) 100);
        boolean boolean53 = complex52.isNaN();
        double double54 = complex52.getReal();
        org.apache.commons.math.complex.Complex complex55 = complex42.subtract(complex52);
        org.apache.commons.math.complex.Complex complex58 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex60 = complex58.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex62 = complex60.add((double) '#');
        org.apache.commons.math.complex.Complex complex63 = complex42.multiply(complex60);
        org.apache.commons.math.complex.Complex complex64 = complex42.sqrt();
        boolean boolean65 = complex37.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex66 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex67 = complex66.acos();
        double double68 = complex66.abs();
        boolean boolean69 = complex12.equals((java.lang.Object) complex66);
        org.apache.commons.math.complex.Complex complex70 = complex66.sinh();
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex75 = complex73.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex78 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex80 = complex78.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex82 = complex80.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList84 = complex80.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex87 = new org.apache.commons.math.complex.Complex((double) 100L, (double) 1);
        org.apache.commons.math.complex.Complex complex89 = complex87.multiply((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex91 = complex89.add((double) '#');
        java.util.List<org.apache.commons.math.complex.Complex> complexList93 = complex89.nthRoot(100);
        org.apache.commons.math.complex.ComplexField complexField94 = complex89.getField();
        org.apache.commons.math.complex.Complex complex95 = complex80.multiply(complex89);
        org.apache.commons.math.complex.Complex complex96 = complex73.divide(complex95);
        org.apache.commons.math.complex.Complex complex97 = complex66.subtract(complex96);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.499987500623d + "'", double7 == 10000.499987500623d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexList21);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10000.0d + "'", double54 == 10000.0d);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complexList84);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complexList93);
        org.junit.Assert.assertNotNull(complexField94);
        org.junit.Assert.assertNotNull(complex95);
        org.junit.Assert.assertNotNull(complex96);
        org.junit.Assert.assertNotNull(complex97);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.apache.commons.math.complex.Complex complex28 = complex11.acos();
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = complex30.reciprocal();
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = complex31.reciprocal();
        org.apache.commons.math.complex.Complex complex34 = complex31.atan();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10000.0d + "'", double6 == 10000.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexField32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }
}

