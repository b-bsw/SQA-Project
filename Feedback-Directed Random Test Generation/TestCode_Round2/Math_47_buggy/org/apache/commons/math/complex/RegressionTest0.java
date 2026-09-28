package org.apache.commons.math.complex;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.junit.Assert.assertNotNull(complex0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) '#');
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        java.lang.Class<?> wildcardClass7 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        java.lang.Object obj4 = complex2.readResolve();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "(-1.0, 1.0)");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex10.getField();
        java.lang.Class<?> wildcardClass12 = complex10.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex11 = complex9.multiply(complex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex0.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        java.lang.Class<?> wildcardClass7 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex3.pow(complex11);
        java.lang.Object obj13 = complex12.readResolve();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex12.subtract(complex16);
        boolean boolean18 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex19 = complex5.pow(complex12);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        java.lang.Class<?> wildcardClass4 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        java.lang.Class<?> wildcardClass5 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex2.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, (double) (short) 100);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        double double10 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        boolean boolean15 = complex4.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex14.multiply(complex17);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex3.pow(complex12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex3.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex2.cos();
        double double21 = complex20.getImaginary();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9888977057628651d + "'", double21 == 0.9888977057628651d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = complex2.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex2.createComplex((double) (short) 100, (double) (-1.0f));
        java.lang.String str11 = complex10.toString();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100.0, -1.0)" + "'", str11, "(100.0, -1.0)");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex11.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        boolean boolean23 = complex17.equals((java.lang.Object) complex19);
        boolean boolean24 = complex7.equals((java.lang.Object) complex17);
        java.lang.Class<?> wildcardClass25 = complex17.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        double double4 = complex3.getReal();
        java.lang.Class<?> wildcardClass5 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.718281828459045d + "'", double4 == 1.718281828459045d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        double double18 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) ' ', (double) (short) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow(100.0d);
        org.apache.commons.math.complex.Complex complex6 = complex2.cos();
        boolean boolean7 = complex2.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        java.lang.String str6 = complex4.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0.0, 0.0)" + "'", str6, "(0.0, 0.0)");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) 100L);
        java.lang.Class<?> wildcardClass22 = complex19.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex11 = complex6.subtract(complex10);
        java.lang.Class<?> wildcardClass12 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex12);
        java.lang.Class<?> wildcardClass15 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1, (double) (byte) 1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex10.atan();
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex9.add((double) (byte) -1);
        java.lang.Object obj13 = complex12.readResolve();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(-1.0, 52.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(-1.0, 52.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(-1.0, 52.0)");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex2.multiply(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex3.pow(complex11);
        boolean boolean13 = complex11.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.tan();
        org.apache.commons.math.complex.Complex complex5 = complex0.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        double double5 = complex4.getArgument();
        java.lang.Class<?> wildcardClass6 = complex4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7649306308923087d + "'", double5 == 2.7649306308923087d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex1.subtract(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex1.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex5 = complex0.add(complex4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(0.0d, 2.6867724202798433d);
        java.lang.Class<?> wildcardClass6 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex(1.718281828459045d, (double) 1);
        java.lang.String str8 = complex7.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1.718281828459045, 1.0)" + "'", str8, "(1.718281828459045, 1.0)");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex8.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        java.lang.String str16 = complex15.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0.0, -32.0)" + "'", str16, "(0.0, -32.0)");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex21.nthRoot((int) (byte) 1);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        double double24 = complex14.getImaginary();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.356194490192345d + "'", double19 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex10.atan();
        org.apache.commons.math.complex.Complex complex16 = complex10.negate();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply((double) '#');
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        double double12 = complex7.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.abs();
        java.lang.Class<?> wildcardClass20 = complex17.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.4142135623730951d + "'", double19 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex6 = complex0.cos();
        double double7 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        double double14 = complex12.getArgument();
        java.lang.Class<?> wildcardClass15 = complex12.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11065722117389565d + "'", double14 == 0.11065722117389565d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex(1.718281828459045d, (double) 1);
        java.lang.Class<?> wildcardClass8 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex11.createComplex((double) '4', (double) 100.0f);
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(2.718281828459045d, 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        java.lang.Class<?> wildcardClass3 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex10.getField();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex17 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex10.divide(complex15);
        java.lang.Class<?> wildcardClass19 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double7 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex6.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        double double21 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        double double27 = complex25.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex25.negate();
        org.apache.commons.math.complex.Complex complex30 = complex28.divide((double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex28.asin();
        org.apache.commons.math.complex.Complex complex32 = complex28.tan();
        org.apache.commons.math.complex.Complex complex33 = complex17.divide(complex28);
        org.apache.commons.math.complex.Complex complex34 = complex3.add(complex17);
        org.apache.commons.math.complex.Complex complex36 = complex17.divide((double) 0);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.356194490192345d + "'", double19 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.356194490192345d + "'", double27 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.sin();
        boolean boolean7 = complex6.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        boolean boolean10 = complex6.isInfinite();
        double double11 = complex6.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4142135623730951d + "'", double11 == 1.4142135623730951d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) ' ', (double) (-1L));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        java.lang.String str9 = complex8.toString();
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex8.nthRoot(1);
        double double12 = complex8.getReal();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0.30689362367529766, 0.2028585393422162)" + "'", str9, "(0.30689362367529766, 0.2028585393422162)");
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.30689362367529766d + "'", double12 == 0.30689362367529766d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 10);
        double double2 = complex1.getReal();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex2.divide(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex0.multiply(0.7861513777574233d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex3.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex25.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex28 = complex21.multiply(complex25);
        java.lang.Class<?> wildcardClass29 = complex25.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex2.divide((double) 0);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex8.nthRoot(1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        java.lang.Class<?> wildcardClass21 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt1z();
        double double8 = complex7.abs();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.4953487812212205d + "'", double8 == 1.4953487812212205d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0.0f);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(100.0d, 2.356194490192345d);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex2.log();
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex16 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex15.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 10, (double) (byte) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.multiply(1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        boolean boolean14 = complex13.isNaN();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1.0f, 100.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        double double23 = complex10.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.03024390243902439d) + "'", double23 == (-0.03024390243902439d));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = complex2.acos();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.ComplexField complexField16 = complex13.getField();
        java.lang.Class<?> wildcardClass17 = complexField16.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.sin();
        org.apache.commons.math.complex.Complex complex7 = complex3.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, 0.7853981633974483d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex21 = complex17.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) 0L, (double) '4');
        boolean boolean25 = complex21.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex2.subtract(complex21);
        boolean boolean27 = complex26.isNaN();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(2.7649306308923087d, (double) (-1));
        java.lang.Object obj3 = complex2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(2.7649306308923087, -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(2.7649306308923087, -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(2.7649306308923087, -1.0)");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        boolean boolean5 = complex4.isInfinite();
        boolean boolean6 = complex4.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.atan();
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex3.subtract(0.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex7.sinh();
        java.lang.Class<?> wildcardClass14 = complex13.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.0d);
        boolean boolean2 = complex1.isNaN();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(11013.232874703393d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math.complex.Complex complex9 = complex5.tanh();
        java.lang.Class<?> wildcardClass10 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        java.lang.String str2 = complex1.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(2.718281828459045, 0.0)" + "'", str2, "(2.718281828459045, 0.0)");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((-0.0d), 0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex18 = complex17.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot((int) (short) 100);
        double double14 = complex11.getReal();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.19540692462289833d + "'", double14 == 0.19540692462289833d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex32 = complex25.divide(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex25.acos();
        org.apache.commons.math.complex.Complex complex35 = complex25.pow(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex36 = complex22.subtract(complex25);
        java.lang.Class<?> wildcardClass37 = complex22.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        double double10 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        boolean boolean15 = complex4.equals((java.lang.Object) complex14);
        double double16 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex19 = complex14.createComplex((double) 100L, 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex22.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex34 = complex19.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf(1.0000000000000002d);
        org.apache.commons.math.complex.Complex complex37 = complex34.subtract(complex36);
        boolean boolean38 = complex34.isInfinite();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-0.0d), (double) 100);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        java.lang.String str18 = complex17.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(-1.0, -1.0)" + "'", str18, "(-1.0, -1.0)");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        double double15 = complex13.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 1);
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex22.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex34 = complex19.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf(1.0000000000000002d);
        org.apache.commons.math.complex.Complex complex37 = complex34.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.ComplexField complexField39 = complex38.getField();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexField39);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) '#', (double) 1.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(2.356194490192345d);
        java.lang.String str9 = complex8.toString();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(-7.643805509807655, -10.0)" + "'", str9, "(-7.643805509807655, -10.0)");
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        boolean boolean6 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex21.subtract(complex28);
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex39 = complex32.divide(complex38);
        java.util.List<org.apache.commons.math.complex.Complex> complexList41 = complex39.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex42 = complex21.pow(complex39);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex46.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex49 = complex46.sin();
        org.apache.commons.math.complex.Complex complex50 = complex21.divide(complex46);
        org.apache.commons.math.complex.Complex complex51 = complex18.subtract(complex21);
        java.lang.Class<?> wildcardClass52 = complex18.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complexList41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        double double11 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex(2.6867724202798433d, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex9.multiply(complex15);
        boolean boolean17 = complex16.isNaN();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double23 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex22.subtract(complex29);
        double double31 = complex30.getArgument();
        boolean boolean32 = complex17.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex34 = complex30.divide(0.9888977057628651d);
        org.apache.commons.math.complex.Complex complex35 = complex30.conjugate();
        java.lang.Class<?> wildcardClass36 = complex35.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.5707963267948966d) + "'", double31 == (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract((double) ' ');
        double double8 = complex5.getImaginary();
        java.lang.Object obj9 = complex5.readResolve();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(-1.0, 32.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(-1.0, 32.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(-1.0, 32.0)");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot(1);
        org.apache.commons.math.complex.Complex complex15 = complex10.pow(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex10.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.ComplexField complexField8 = complex7.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 'a', (double) (byte) 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex13.log();
        double double20 = complex13.getReal();
        double double21 = complex13.getArgument();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.40059690294250294d));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(1.4953487812212205d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex8.tanh();
        java.lang.Object obj16 = complex15.readResolve();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "(-0.873089601016897, 0.2214767254004208)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "(-0.873089601016897, 0.2214767254004208)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "(-0.873089601016897, 0.2214767254004208)");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex4.add(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        double double10 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0000000000000002d + "'", double10 == 1.0000000000000002d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 0L);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex12 = complex4.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex1.multiply(complex12);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex21 = complex17.acos();
        double double22 = complex21.abs();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.457450346548196d + "'", double22 == 4.457450346548196d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        boolean boolean11 = complex9.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract((double) ' ');
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1L), 100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex7.add(complex10);
        boolean boolean12 = complex10.isInfinite();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex9 = complex5.add(complex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        java.lang.String str12 = complex2.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(-1.0, 1.0)" + "'", str12, "(-1.0, 1.0)");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.cos();
        org.apache.commons.math.complex.Complex complex10 = complex5.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex8.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        double double19 = complex16.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0612750619050357d) + "'", double19 == (-1.0612750619050357d));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.04417261042993862d, (double) (-1L));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex4 = complex3.log();
        java.lang.String str5 = complex4.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0.0, -3.141592653589793)" + "'", str5, "(0.0, -3.141592653589793)");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.tan();
        double double5 = complex0.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        boolean boolean10 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex12 = complex6.pow((double) (-1));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        boolean boolean3 = complex0.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(1.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex15.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex5.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex5.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex28 = complex5.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.exp();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math.complex.Complex complex16 = complex4.add(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex4.sqrt1z();
        double double18 = complex17.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0.30689362367529766, 0.2028585393422162)" + "'", str15, "(0.30689362367529766, 0.2028585393422162)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.2720196495140692d + "'", double18 == 1.2720196495140692d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.multiply(1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        double double14 = complex9.getReal();
        double double15 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.7861513777574233d, 0.0d);
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex2.subtract(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex4 = complex0.log();
        java.lang.Class<?> wildcardClass5 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        boolean boolean6 = complex5.isInfinite();
        java.lang.Class<?> wildcardClass7 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double23 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex22.subtract(complex29);
        double double31 = complex30.getArgument();
        boolean boolean32 = complex17.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex34 = complex30.divide(0.9888977057628651d);
        org.apache.commons.math.complex.Complex complex35 = complex30.conjugate();
        double double36 = complex30.getArgument();
        boolean boolean37 = complex30.isNaN();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.5707963267948966d) + "'", double31 == (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.5707963267948966d) + "'", double36 == (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.7853981633974483d, 1.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex16 = complex14.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex16.pow(complex24);
        java.lang.Object obj26 = complex25.readResolve();
        org.apache.commons.math.complex.Complex complex27 = complex11.multiply(complex25);
        boolean boolean28 = complex27.isInfinite();
        java.lang.String str29 = complex27.toString();
        org.apache.commons.math.complex.Complex complex30 = complex27.tan();
        java.lang.Object obj31 = complex30.readResolve();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0.9973488516012596, 1.0461675449109649)" + "'", str29, "(0.9973488516012596, 1.0461675449109649)");
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "(0.24619673533805186, 1.0777683984121003)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "(0.24619673533805186, 1.0777683984121003)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "(0.24619673533805186, 1.0777683984121003)");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math.complex.Complex complex26 = complex23.acos();
        org.apache.commons.math.complex.Complex complex27 = complex23.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex27.nthRoot((int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08120236107192619d + "'", double24 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex4 = complex1.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) 'a', 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex6.asin();
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        org.apache.commons.math.complex.Complex complex28 = complex26.cos();
        java.lang.Object obj29 = complex26.readResolve();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "(-0.9999999999999998, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "(-0.9999999999999998, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "(-0.9999999999999998, 1.0)");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex0.add(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = complex18.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex29.log();
        org.apache.commons.math.complex.Complex complex31 = complex15.subtract(complex29);
        org.apache.commons.math.complex.Complex complex34 = complex15.createComplex((double) (byte) 0, (-0.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex11.createComplex((double) '4', (double) 100.0f);
        double double17 = complex16.getArgument();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0912770348023004d + "'", double17 == 1.0912770348023004d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex5.sin();
        double double10 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex21 = complex13.subtract(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex5.subtract(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex2.divide(complex5);
        java.lang.Class<?> wildcardClass24 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 100L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex2.cos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex2.divide(complex17);
        java.lang.String str19 = complex2.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(-1.0, 1.0)" + "'", str19, "(-1.0, 1.0)");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.6220932580717584d, (double) 10.0f);
        boolean boolean3 = complex2.isNaN();
        java.lang.Class<?> wildcardClass4 = complex2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10L);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        java.lang.Class<?> wildcardClass20 = complex19.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex2.add((double) (short) 100);
        org.apache.commons.math.complex.Complex complex27 = complex2.subtract((double) 10L);
        org.apache.commons.math.complex.Complex complex28 = complex2.exp();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 'a', (double) (short) 100);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.getArgument();
        java.lang.Class<?> wildcardClass17 = complex13.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7853981633974483d + "'", double16 == 0.7853981633974483d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) (-1));
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex(32.0d, (double) (byte) 1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex23.nthRoot(10);
        org.apache.commons.math.complex.Complex complex26 = complex16.multiply(complex23);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex33 = complex32.tan();
        org.apache.commons.math.complex.Complex complex34 = complex23.subtract(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex32.createComplex(2.7584404568273957d, 11013.232874703393d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.356194490192345d + "'", double31 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        java.lang.Object obj7 = null;
        boolean boolean8 = complex2.equals(obj7);
        org.apache.commons.math.complex.Complex complex9 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1L, 0.11065722117389565d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex16 = complex14.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex16.pow(complex24);
        java.lang.Object obj26 = complex25.readResolve();
        org.apache.commons.math.complex.Complex complex27 = complex11.multiply(complex25);
        java.lang.Class<?> wildcardClass28 = complex27.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex2.cos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex2.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex2.createComplex(0.4429679074828777d, 0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(0.7861513777574233d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex23.nthRoot((int) '#');
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(10.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        double double9 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex12.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex4.cos();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex1.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex33);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.356194490192345d + "'", double9 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex8.add((double) (byte) 1);
        double double11 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex8.atan();
        org.apache.commons.math.complex.Complex complex13 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex2.multiply(complex8);
        org.apache.commons.math.complex.Complex complex15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex16 = complex14.divide(complex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex11.getImaginary();
        double double14 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.141592653589793d) + "'", double14 == (-3.141592653589793d));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 1);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10);
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract((double) 10.0f);
        java.lang.Class<?> wildcardClass4 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        java.lang.Class<?> wildcardClass20 = complex17.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', (double) 1L);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (byte) 1);
        double double18 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex19 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = complex15.acos();
        boolean boolean21 = complex9.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = complex2.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex20.exp();
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex6.sin();
        org.apache.commons.math.complex.Complex complex10 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex2.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex10.negate();
        double double13 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.divide((double) 0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.createComplex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex2.getField();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.602036160225165d, 1.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex7.subtract(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        java.lang.Object obj12 = complex11.readResolve();
        java.lang.Object obj13 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex14 = complex11.log();
        org.apache.commons.math.complex.Complex complex15 = complex9.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex9.exp();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.7853981633974483d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(2.718281828459045d);
        java.lang.Class<?> wildcardClass4 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.sin();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(2.7649306308923087d, 0.761594155955765d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex10.nthRoot(1);
        org.apache.commons.math.complex.Complex complex15 = complex10.pow(10.0d);
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.tan();
        double double11 = complex9.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0939075288148181d + "'", double11 == 1.0939075288148181d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        boolean boolean12 = complex6.equals((java.lang.Object) double11);
        org.apache.commons.math.complex.Complex complex13 = complex6.negate();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) 1);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex24.sin();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex39 = complex31.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex28.divide(complex39);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex43.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        boolean boolean47 = complex28.equals((java.lang.Object) complex46);
        org.apache.commons.math.complex.Complex complex48 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex50 = complex6.multiply(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex51.divide((-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex54 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex55 = complex51.sinh();
        double double56 = complex51.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.32821152988188157d) + "'", double56 == (-0.32821152988188157d));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.03219512195121951d, (-0.04251371856656924d));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        double double23 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex24 = complex21.negate();
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.asin();
        org.apache.commons.math.complex.Complex complex28 = complex24.tan();
        org.apache.commons.math.complex.Complex complex29 = complex13.divide(complex24);
        java.lang.Class<?> wildcardClass30 = complex13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.356194490192345d + "'", double23 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.0032914947529734d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) (-1));
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(32.0d, (double) (byte) 1);
        double double6 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex7 = complex2.cosh();
        java.lang.Class<?> wildcardClass8 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) -1);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex7.sinh();
        boolean boolean11 = complex1.equals((java.lang.Object) complex10);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-1.0d), 0.6220932580717584d);
        java.lang.Object obj3 = complex2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(-1.0, 0.6220932580717584)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(-1.0, 0.6220932580717584)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(-1.0, 0.6220932580717584)");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(10.0d, 0.4429679074828777d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.tan();
        org.apache.commons.math.complex.Complex complex6 = complex4.add(2.718281828459045d);
        double double7 = complex6.abs();
        java.lang.Class<?> wildcardClass8 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.718281828459045d + "'", double7 == 2.718281828459045d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.6220932580717584d, (double) 10.0f);
        org.apache.commons.math.complex.Complex complex4 = complex2.add((-2.356194490192345d));
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex32.sin();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex43.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex47 = complex39.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex36.divide(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex29.pow(complex47);
        org.apache.commons.math.complex.Complex complex51 = complex29.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex52 = complex2.subtract(complex29);
        org.apache.commons.math.complex.Complex complex54 = complex29.pow((double) 10);
        java.lang.String str55 = complex29.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(0.0, -1.0)" + "'", str55, "(0.0, -1.0)");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex8.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex18.subtract(0.6349639147847361d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.multiply(1.4142135623730951d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        double double18 = complex17.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.5700866977435435d + "'", double18 == 1.5700866977435435d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex2.cos();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex27 = complex20.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex20.tan();
        boolean boolean29 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex20.add(Double.NaN);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(2.718281828459045d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex6 = complex1.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.atan();
        double double5 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        java.lang.String str2 = complex0.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(1.0, 0.0)" + "'", str2, "(1.0, 0.0)");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.atan();
        org.apache.commons.math.complex.Complex complex6 = complex0.sinh();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex18 = complex5.log();
        org.apache.commons.math.complex.Complex complex20 = complex5.multiply((-1.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex11 = complex6.subtract(complex10);
        boolean boolean12 = complex6.isInfinite();
        java.lang.String str13 = complex6.toString();
        org.apache.commons.math.complex.Complex complex14 = complex6.sqrt();
        java.lang.Object obj15 = complex14.readResolve();
        org.apache.commons.math.complex.Complex complex18 = complex14.createComplex(3.141592653589793d, (double) 1.0f);
        java.lang.Object obj19 = complex18.readResolve();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(-1.2984575814159773, 0.6349639147847361)" + "'", str13, "(-1.2984575814159773, 0.6349639147847361)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "(0.27105257353719425, 1.1712929091551412)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "(0.27105257353719425, 1.1712929091551412)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "(0.27105257353719425, 1.1712929091551412)");
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(3.141592653589793, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(3.141592653589793, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(3.141592653589793, 1.0)");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.sin();
        double double4 = complex0.getReal();
        boolean boolean5 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) -1, 0.4429679074828777d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex3.add(1.4953487812212205d);
        org.apache.commons.math.complex.Complex complex6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex7 = complex5.subtract(complex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = complex4.multiply(complex8);
        java.lang.Object obj10 = null;
        boolean boolean11 = complex4.equals(obj10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.atan();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex19.acos();
        org.apache.commons.math.complex.ComplexField complexField22 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = complex19.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex25 = complex0.subtract(complex19);
        org.apache.commons.math.complex.Complex complex26 = complex0.acos();
        org.apache.commons.math.complex.Complex complex27 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex0.pow(32.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex2.multiply(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex12.add(5.0990195135927845d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.06429984768735961d, 1.5726835322493407d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-2.5969151628319547d), 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) 1.0f, 0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex9 = complex4.tanh();
        double double10 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex21 = complex17.sin();
        boolean boolean23 = complex21.equals((java.lang.Object) 9.0d);
        org.apache.commons.math.complex.Complex complex25 = complex21.subtract((double) 0.0f);
        org.apache.commons.math.complex.Complex complex26 = complex21.sin();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(2.6867724202798433d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 100, (double) (-1.0f));
        org.apache.commons.math.complex.Complex complex23 = complex17.subtract(complex22);
        double double24 = complex17.getImaginary();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) (-1));
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex(32.0d, (double) (byte) 1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex23.nthRoot(10);
        org.apache.commons.math.complex.Complex complex26 = complex16.multiply(complex23);
        double double27 = complex26.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexList25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.1719284454208705d) + "'", double27 == (-1.1719284454208705d));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex2.cos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex2.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.conjugate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex6.cosh();
        double double27 = complex26.getReal();
        boolean boolean28 = complex26.isNaN();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.5846623006681895d + "'", double27 == 1.5846623006681895d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract((double) 10.0f);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex8.acos();
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex16);
        double double19 = complex16.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.476011660988725d + "'", double19 == 2.476011660988725d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.ComplexField complexField14 = complex13.getField();
        boolean boolean15 = complex13.isInfinite();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex2.cos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex18 = complex2.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex2.createComplex(0.4429679074828777d, 0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(0.7861513777574233d);
        org.apache.commons.math.complex.Complex complex26 = complex21.createComplex(Double.NaN, 1.602020942307271d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex21.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.5700866977435435d, 0.19540692462289833d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        java.lang.Object obj2 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(-1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(-1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(-1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        double double9 = complex8.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6014567574430342d + "'", double9 == 0.6014567574430342d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        java.lang.Class<?> wildcardClass14 = complex13.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        double double11 = complex9.getReal();
        double double12 = complex9.getImaginary();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        java.lang.Class<?> wildcardClass5 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.11065722117389565d, (-0.04251371856656924d));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex13.log();
        double double20 = complex13.getArgument();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex13.nthRoot(10);
        org.apache.commons.math.complex.Complex complex23 = complex13.sinh();
        java.lang.Class<?> wildcardClass24 = complex23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.356194490192345d + "'", double20 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        double double5 = complex4.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.4142135623730951d + "'", double5 == 1.4142135623730951d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.log();
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double23 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex22.subtract(complex29);
        double double31 = complex30.getArgument();
        boolean boolean32 = complex17.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex34 = complex30.divide(0.9888977057628651d);
        org.apache.commons.math.complex.Complex complex35 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        double double40 = complex38.getArgument();
        org.apache.commons.math.complex.Complex complex41 = complex38.negate();
        org.apache.commons.math.complex.Complex complex42 = complex38.negate();
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex45.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex49 = complex45.sin();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex60 = complex52.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex49.divide(complex60);
        org.apache.commons.math.complex.Complex complex64 = complex60.createComplex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex65 = complex42.multiply(complex60);
        boolean boolean66 = complex42.isNaN();
        org.apache.commons.math.complex.Complex complex67 = complex42.cos();
        boolean boolean68 = complex30.equals((java.lang.Object) complex67);
        java.lang.Class<?> wildcardClass69 = complex67.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.5707963267948966d) + "'", double31 == (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 2.356194490192345d + "'", double40 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(0.0d, 2.6867724202798433d);
        org.apache.commons.math.complex.Complex complex7 = complex2.divide((double) (short) 0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = complex2.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(0.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex27.nthRoot((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08120236107192619d + "'", double24 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(2.356194490192345d);
        org.apache.commons.math.complex.Complex complex9 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.acos();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 10, (double) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex9.add(complex19);
        org.apache.commons.math.complex.Complex complex25 = complex9.subtract(0.19540692462289833d);
        org.apache.commons.math.complex.Complex complex26 = complex9.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.ComplexField complexField12 = complex2.getField();
        org.apache.commons.math.complex.Complex complex13 = complex2.acos();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex0.getField();
        org.apache.commons.math.complex.Complex complex5 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide(2.0d);
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.03219512195121951d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.5726835322493407d + "'", double5 == 1.5726835322493407d);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.8337300251311491d, (double) 0L);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex2.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex2.tanh();
        org.junit.Assert.assertNotNull(complexList4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex2.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math.complex.Complex complex27 = complex25.divide((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08120236107192619d + "'", double24 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex2.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex1.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.pow(1.0912770348023004d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.exp();
        java.lang.String str15 = complex14.toString();
        org.apache.commons.math.complex.Complex complex16 = complex4.add(complex14);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex22.asin();
        org.apache.commons.math.complex.Complex complex26 = complex14.subtract(complex22);
        org.apache.commons.math.complex.Complex complex27 = complex26.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0.30689362367529766, 0.2028585393422162)" + "'", str15, "(0.30689362367529766, 0.2028585393422162)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex11.exp();
        double double17 = complex11.getReal();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.2195121951219514d + "'", double17 == 3.2195121951219514d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex2.cos();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex23.pow(complex24);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double29 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex30 = complex23.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex28.add((double) 10);
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex33.divide((double) 1);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex46 = complex39.divide(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex50 = complex45.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex51 = complex50.log();
        org.apache.commons.math.complex.Complex complex52 = complex36.subtract(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex20.divide(complex36);
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex60 = complex56.sqrt1z();
        org.apache.commons.math.complex.Complex complex62 = complex56.pow((double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex53.multiply(complex56);
        org.apache.commons.math.complex.Complex complex64 = complex63.tanh();
        org.apache.commons.math.complex.Complex complex65 = complex64.sin();
        org.apache.commons.math.complex.Complex complex66 = complex65.sqrt();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1L), 100.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double7 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex6.subtract(complex13);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        double double21 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex14.multiply(complex17);
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex23.negate();
        org.apache.commons.math.complex.Complex complex25 = complex2.pow(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.cos();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.356194490192345d + "'", double19 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.ComplexField complexField16 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex13.conjugate();
        boolean boolean20 = complex13.isInfinite();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        org.apache.commons.math.complex.Complex complex22 = complex5.pow((double) '4');
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) '4');
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex10.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex(9.0d, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract(complex14);
        org.apache.commons.math.complex.ComplexField complexField16 = complex11.getField();
        double double17 = complex11.getArgument();
        double double18 = complex11.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.131386956531369d + "'", double17 == 2.131386956531369d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.253068130003108d + "'", double18 == 1.253068130003108d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(0.30689362367529766d);
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex11.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.log();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math.complex.Complex complex9 = complex5.negate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex4.subtract(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = complex18.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex29.log();
        org.apache.commons.math.complex.Complex complex31 = complex15.subtract(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex29.sqrt1z();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        boolean boolean7 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = complex4.tanh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex19.nthRoot((int) (short) 10);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexList21);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(32.0d, 0.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex5.sin();
        double double10 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex21 = complex13.subtract(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex5.subtract(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex2.divide(complex5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex23.nthRoot((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        boolean boolean12 = complex7.isNaN();
        boolean boolean13 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex16.divide(complex22);
        boolean boolean24 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex25 = complex16.asin();
        org.apache.commons.math.complex.Complex complex26 = complex16.cos();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math.complex.Complex complex29 = complex27.tan();
        org.apache.commons.math.complex.Complex complex31 = complex29.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex32 = complex16.divide(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex7.subtract(complex33);
        double double35 = complex33.getArgument();
        boolean boolean36 = complex33.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.40059690294250294d) + "'", double35 == (-0.40059690294250294d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double7 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex6.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex6.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex19.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex28 = complex23.subtract(complex27);
        boolean boolean29 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        double double32 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex33 = complex2.pow(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex33.sinh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.6867724202798433d + "'", double32 == 2.6867724202798433d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex21 = complex17.sin();
        boolean boolean23 = complex21.equals((java.lang.Object) 9.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex21.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (-3.141592653589793d));
        java.lang.Object obj3 = complex2.readResolve();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(0.0, -3.141592653589793)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(0.0, -3.141592653589793)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(0.0, -3.141592653589793)");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex22.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex34 = complex19.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex34.atan();
        org.apache.commons.math.complex.Complex complex38 = complex34.createComplex((double) 10, 2.0d);
        org.apache.commons.math.complex.Complex complex39 = complex38.acos();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.sinh();
        java.lang.Object obj42 = complex41.readResolve();
        double double43 = complex41.abs();
        org.apache.commons.math.complex.Complex complex44 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex45 = complex39.pow(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex45.add(0.9888977057628651d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex13 = complex2.multiply((double) (byte) -1);
        java.lang.String str14 = complex13.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1.0, -1.0)" + "'", str14, "(1.0, -1.0)");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide((double) 10L);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        double double5 = complex4.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.4953487812212205d + "'", double5 == 1.4953487812212205d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex11 = complex6.subtract(complex10);
        boolean boolean12 = complex10.isNaN();
        double double13 = complex10.abs();
        org.apache.commons.math.complex.Complex complex14 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex20 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        org.apache.commons.math.complex.Complex complex22 = complex14.add(complex20);
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex20.nthRoot((int) '4');
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4142135623730951d + "'", double13 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexList24);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        boolean boolean12 = complex6.equals((java.lang.Object) double11);
        org.apache.commons.math.complex.Complex complex13 = complex6.negate();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) 1);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex24.sin();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex39 = complex31.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex28.divide(complex39);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex43.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        boolean boolean47 = complex28.equals((java.lang.Object) complex46);
        org.apache.commons.math.complex.Complex complex48 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex50 = complex6.multiply(complex49);
        java.util.List<org.apache.commons.math.complex.Complex> complexList52 = complex6.nthRoot((int) (byte) 10);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complexList52);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(2.356194490192345d);
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.atan();
        org.apache.commons.math.complex.Complex complex11 = complex5.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex5.acos();
        boolean boolean13 = complex12.isInfinite();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-0.029281239368487505d));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex2.subtract(2.0256165601048464d);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt1z();
        double double15 = complex14.abs();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0610919937463827d + "'", double15 == 3.0610919937463827d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex7.sin();
        org.apache.commons.math.complex.Complex complex11 = complex3.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt1z();
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex17 = complex12.createComplex((-1.1719284454208705d), 100.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(1.4142135623730951d, 1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex16 = complex11.subtract(2.0256165601048464d);
        double double17 = complex11.abs();
        java.lang.Class<?> wildcardClass18 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.253068130003108d + "'", double17 == 1.253068130003108d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 100);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        double double8 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex7.pow((-2.5969151628319547d));
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.25651428512162844d + "'", double8 == 0.25651428512162844d);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex15.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex5.pow(complex23);
        double double26 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex23.acos();
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex(1.0912770348023004d, 2.0256165601048464d);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex40 = complex33.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        double double42 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex46 = complex44.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = complex46.atan();
        org.apache.commons.math.complex.Complex complex49 = complex40.add(complex46);
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex56 = complex52.sin();
        double double57 = complex52.getArgument();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double61 = complex60.getReal();
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex67 = complex64.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex68 = complex60.subtract(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex52.subtract(complex67);
        java.lang.Object obj70 = complex69.readResolve();
        org.apache.commons.math.complex.Complex complex71 = complex46.subtract(complex69);
        org.apache.commons.math.complex.Complex complex72 = complex71.negate();
        boolean boolean73 = complex71.isInfinite();
        org.apache.commons.math.complex.Complex complex74 = complex30.pow(complex71);
        boolean boolean75 = complex74.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.141592653589793d + "'", double26 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.03024390243902439d + "'", double42 == 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 2.356194490192345d + "'", double57 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "(0.0, -31.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "(0.0, -31.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "(0.0, -31.0)");
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex0.getField();
        org.apache.commons.math.complex.Complex complex5 = complex0.sqrt1z();
        double double6 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex8.tanh();
        double double16 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.8931627737962193d + "'", double16 == 2.8931627737962193d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        double double4 = complex3.getReal();
        java.lang.Object obj5 = null;
        boolean boolean6 = complex3.equals(obj5);
        org.apache.commons.math.complex.Complex complex8 = complex3.divide(9.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.718281828459045d + "'", double4 == 1.718281828459045d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = complex11.divide((double) (short) 0);
        double double15 = complex11.abs();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.4453965766582497d + "'", double15 == 1.4453965766582497d);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        double double6 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.subtract(0.03024390243902439d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double12 = complex11.getReal();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = complex11.subtract(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex11.sin();
        boolean boolean21 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex33 = complex31.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex25.pow(complex33);
        java.lang.Object obj35 = complex34.readResolve();
        org.apache.commons.math.complex.Complex complex36 = complex20.multiply(complex34);
        boolean boolean37 = complex36.isInfinite();
        java.lang.String str38 = complex36.toString();
        org.apache.commons.math.complex.Complex complex39 = complex8.divide(complex36);
        java.lang.Class<?> wildcardClass40 = complex36.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.356194490192345d + "'", double6 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(0.9973488516012596, 1.0461675449109649)" + "'", str38, "(0.9973488516012596, 1.0461675449109649)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        boolean boolean19 = complex9.equals((java.lang.Object) complex18);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.356194490192345d) + "'", double11 == (-2.356194490192345d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex15.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex5.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = complex5.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex29 = complex27.subtract((-1.0d));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex22 = complex20.divide((double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex14.subtract(complex20);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        boolean boolean30 = complex28.isNaN();
        java.lang.Object obj31 = complex28.readResolve();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex42 = complex34.subtract(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex34.sin();
        org.apache.commons.math.complex.Complex complex44 = complex28.divide(complex34);
        org.apache.commons.math.complex.Complex complex45 = complex34.negate();
        org.apache.commons.math.complex.Complex complex46 = complex14.multiply(complex45);
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex49.pow(complex50);
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double55 = complex54.getReal();
        org.apache.commons.math.complex.Complex complex56 = complex49.add(complex54);
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt();
        org.apache.commons.math.complex.Complex complex59 = complex57.pow(0.7861513777574233d);
        org.apache.commons.math.complex.Complex complex60 = complex14.subtract(complex59);
        java.lang.String str61 = complex59.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.356194490192345d + "'", double19 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(0.9042688906786354, 1.2028515989371318)" + "'", str61, "(0.9042688906786354, 1.2028515989371318)");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.getArgument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex13.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7853981633974483d + "'", double16 == 0.7853981633974483d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        java.lang.Class<?> wildcardClass9 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.negate();
        org.apache.commons.math.complex.Complex complex24 = complex23.tanh();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        java.lang.Class<?> wildcardClass13 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        double double11 = complex9.getImaginary();
        org.apache.commons.math.complex.Complex complex12 = complex9.asin();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.03024390243902439d + "'", double11 == 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        org.apache.commons.math.complex.Complex complex21 = complex5.exp();
        org.apache.commons.math.complex.Complex complex22 = complex5.negate();
        org.apache.commons.math.complex.Complex complex24 = complex5.pow((-2.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-1.0612750619050357d));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(1.4142135623730951d, 1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex16 = complex11.subtract(2.0256165601048464d);
        org.apache.commons.math.complex.Complex complex17 = complex11.negate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(11013.232874703393d);
        java.lang.Class<?> wildcardClass9 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.createComplex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex24.sin();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex39 = complex31.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex28.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex39.exp();
        org.apache.commons.math.complex.Complex complex43 = complex41.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex47.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex50 = complex43.multiply(complex47);
        boolean boolean51 = complex21.equals((java.lang.Object) complex43);
        org.apache.commons.math.complex.Complex complex53 = complex21.multiply(2.770618290769386d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex6.sin();
        org.apache.commons.math.complex.Complex complex10 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex2.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, 3.79966999576974d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 10.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double7 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex6.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex6.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.divide((double) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        double double23 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex24 = complex21.negate();
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex18.subtract(complex24);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = complex32.tan();
        boolean boolean34 = complex32.isNaN();
        java.lang.Object obj35 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double39 = complex38.getReal();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex46 = complex38.subtract(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex38.sin();
        org.apache.commons.math.complex.Complex complex48 = complex32.divide(complex38);
        org.apache.commons.math.complex.Complex complex49 = complex38.negate();
        org.apache.commons.math.complex.Complex complex50 = complex18.multiply(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex3.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex3.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.356194490192345d + "'", double23 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        boolean boolean12 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex7.sqrt();
        double double14 = complex13.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        double double4 = complex3.getArgument();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5707963267948966d + "'", double4 == 2.5707963267948966d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        double double23 = complex10.getReal();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.03219512195121951d + "'", double23 == 0.03219512195121951d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = complex18.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex30 = complex29.log();
        org.apache.commons.math.complex.Complex complex31 = complex15.subtract(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.log();
        org.apache.commons.math.complex.ComplexField complexField33 = complex31.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexField33);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex3.pow(complex11);
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.8774892469777613d) + "'", double14 == (-1.8774892469777613d));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex5.subtract(0.25651428512162844d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex11.sin();
        double double16 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double20 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex27 = complex19.subtract(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex11.subtract(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex26.negate();
        org.apache.commons.math.complex.Complex complex30 = complex5.add(complex26);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.356194490192345d + "'", double16 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        java.lang.Object obj6 = complex4.readResolve();
        org.apache.commons.math.complex.Complex complex7 = complex4.log();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        double double19 = complex17.getArgument();
        boolean boolean20 = complex14.equals((java.lang.Object) double19);
        org.apache.commons.math.complex.Complex complex21 = complex14.negate();
        org.apache.commons.math.complex.Complex complex22 = complex14.acos();
        org.apache.commons.math.complex.Complex complex23 = complex7.pow(complex14);
        org.apache.commons.math.complex.Complex complex24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex25 = complex14.multiply(complex24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "(-1.557407724654902, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "(-1.557407724654902, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "(-1.557407724654902, -0.0)");
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.356194490192345d + "'", double19 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) 1.0f, 0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex9 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex10.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        double double26 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex6.atan();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.6867724202798433d + "'", double26 == 2.6867724202798433d);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.ComplexField complexField22 = complex20.getField();
        org.apache.commons.math.complex.Complex complex24 = complex20.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        double double29 = complex27.getArgument();
        boolean boolean30 = complex24.equals((java.lang.Object) double29);
        org.apache.commons.math.complex.Complex complex31 = complex24.negate();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        double double36 = complex34.getArgument();
        org.apache.commons.math.complex.Complex complex37 = complex34.negate();
        org.apache.commons.math.complex.Complex complex39 = complex37.divide((double) 1);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex46 = complex42.sin();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex52 = complex49.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex53.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex57 = complex49.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex46.divide(complex57);
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex63 = complex61.pow(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex63.cosh();
        boolean boolean65 = complex46.equals((java.lang.Object) complex64);
        org.apache.commons.math.complex.Complex complex66 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex67 = complex39.add(complex46);
        org.apache.commons.math.complex.Complex complex68 = complex24.multiply(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex67.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex69.divide((-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex72 = complex69.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex69.sinh();
        org.apache.commons.math.complex.Complex complex74 = complex14.pow(complex73);
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex80 = complex77.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex81 = complex77.sin();
        org.apache.commons.math.complex.Complex complex84 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex87 = complex84.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex88 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex91 = complex88.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex92 = complex84.add(complex91);
        org.apache.commons.math.complex.Complex complex93 = complex81.divide(complex92);
        org.apache.commons.math.complex.Complex complex94 = complex92.exp();
        org.apache.commons.math.complex.Complex complex96 = complex94.multiply((double) 100L);
        boolean boolean97 = complex14.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2.356194490192345d + "'", double29 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.356194490192345d + "'", double36 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complex92);
        org.junit.Assert.assertNotNull(complex93);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertNotNull(complex96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        boolean boolean9 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex5.divide((double) '4');
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 0, 2.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex14 = complex6.add(complex13);
        org.apache.commons.math.complex.ComplexField complexField15 = complex14.getField();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply((double) '4');
        org.apache.commons.math.complex.Complex complex18 = complex3.add(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math.complex.Complex complex20 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex18.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex16 = complex10.subtract((double) 1L);
        java.lang.String str17 = complex10.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0.0, 0.0)" + "'", str17, "(0.0, 0.0)");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        double double18 = complex17.getArgument();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.8682488092848555d) + "'", double18 == (-0.8682488092848555d));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.tan();
        org.apache.commons.math.complex.Complex complex6 = complex4.add(2.718281828459045d);
        double double7 = complex6.abs();
        org.apache.commons.math.complex.Complex complex8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex9 = complex6.multiply(complex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.718281828459045d + "'", double7 == 2.718281828459045d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-2.5969151628319547d), (double) ' ');
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex16 = complex3.multiply(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex3.negate();
        double double18 = complex3.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex20 = complex17.pow((-0.32821152988188157d));
        java.lang.Object obj21 = complex20.readResolve();
        java.lang.Object obj22 = complex20.readResolve();
        boolean boolean23 = complex20.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "(0.6386494596612876, 0.6234181326229822)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) -1, 0.06429984768735961d);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        boolean boolean4 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.log();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        boolean boolean6 = complex4.isNaN();
        java.lang.Object obj7 = complex4.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        java.lang.Object obj9 = complex4.readResolve();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(1.272019649514069, 0.7861513777574233)");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.602036160225165d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex12.subtract(1.0000000000000002d);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex19 = complex18.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex12.sin();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex19.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex16.divide(complex27);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex31.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        boolean boolean35 = complex16.equals((java.lang.Object) complex34);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.ComplexField complexField40 = complex38.getField();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean42 = complex38.equals((java.lang.Object) complex41);
        double double43 = complex38.getArgument();
        boolean boolean44 = complex16.equals((java.lang.Object) complex38);
        org.apache.commons.math.complex.Complex complex45 = complex2.pow(complex16);
        double double46 = complex45.getImaginary();
        java.lang.Class<?> wildcardClass47 = complex45.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complexField40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.356194490192345d + "'", double43 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.04251371856656924d) + "'", double46 == (-0.04251371856656924d));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(0.11065722117389565d);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = complex12.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex19.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex24 = complex23.exp();
        org.apache.commons.math.complex.Complex complex25 = complex23.asin();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double29 = complex28.getReal();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex28.subtract(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex28.sin();
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        boolean boolean39 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex40 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex40.asin();
        org.apache.commons.math.complex.Complex complex42 = complex23.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex9.subtract(complex41);
        double double44 = complex41.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.2984575814159773d) + "'", double44 == (-1.2984575814159773d));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 10.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double7 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex6.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex6.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.divide((double) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        double double23 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex24 = complex21.negate();
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex18.subtract(complex24);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = complex32.tan();
        boolean boolean34 = complex32.isNaN();
        java.lang.Object obj35 = complex32.readResolve();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double39 = complex38.getReal();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex46 = complex38.subtract(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex38.sin();
        org.apache.commons.math.complex.Complex complex48 = complex32.divide(complex38);
        org.apache.commons.math.complex.Complex complex49 = complex38.negate();
        org.apache.commons.math.complex.Complex complex50 = complex18.multiply(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex3.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex55 = complex53.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex58 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex61 = complex58.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex62.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex66 = complex58.add(complex65);
        org.apache.commons.math.complex.ComplexField complexField67 = complex66.getField();
        org.apache.commons.math.complex.Complex complex69 = complex66.multiply((double) '4');
        org.apache.commons.math.complex.Complex complex70 = complex55.add(complex66);
        boolean boolean71 = complex3.equals((java.lang.Object) complex55);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.356194490192345d + "'", double23 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complexField67);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, 2.131386956531369d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.cos();
        org.apache.commons.math.complex.Complex complex10 = complex5.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        boolean boolean6 = complex0.equals((java.lang.Object) complex4);
        org.apache.commons.math.complex.Complex complex9 = complex4.createComplex((double) (byte) -1, (double) 10);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        java.lang.Class<?> wildcardClass20 = complex17.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.8337300251311491d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        org.apache.commons.math.complex.Complex complex16 = complex13.cos();
        org.apache.commons.math.complex.Complex complex18 = complex13.pow(1.0939075288148181d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.atan();
        org.apache.commons.math.complex.Complex complex5 = complex2.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex6.sin();
        org.apache.commons.math.complex.Complex complex10 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex2.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex10.negate();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        java.lang.Class<?> wildcardClass14 = complex12.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1L, 2.0256165601048464d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        boolean boolean10 = complex7.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex11 = complex2.divide(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        boolean boolean15 = complex13.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(10.0d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        double double9 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex12.subtract(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex4.cos();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex26.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex1.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply(1.4953487812212205d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.356194490192345d + "'", double9 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(2.718281828459045d);
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex15.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex5.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex28 = complex26.multiply(complex27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 0);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex18.sin();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex33 = complex25.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.exp();
        org.apache.commons.math.complex.Complex complex37 = complex35.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex46 = complex43.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex47 = complex40.divide(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex47.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex51 = complex47.multiply((double) (-1.0f));
        org.apache.commons.math.complex.ComplexField complexField52 = complex51.getField();
        org.apache.commons.math.complex.Complex complex53 = complex37.subtract(complex51);
        boolean boolean54 = complex15.equals((java.lang.Object) complex53);
        org.apache.commons.math.complex.Complex complex56 = complex15.pow(0.0d);
        org.apache.commons.math.complex.Complex complex57 = complex15.acos();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complexField52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) -1, 0.06429984768735961d);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        double double7 = complex6.getReal();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.272019649514069d + "'", double7 == 1.272019649514069d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1));
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex6.tanh();
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex11 = complex9.atan();
        org.apache.commons.math.complex.Complex complex12 = complex4.subtract(complex11);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.ComplexField complexField17 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean19 = complex15.equals((java.lang.Object) complex18);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        boolean boolean23 = complex20.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex24 = complex15.divide(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex15.sinh();
        boolean boolean26 = complex12.equals((java.lang.Object) complex15);
        org.apache.commons.math.complex.Complex complex27 = complex0.subtract(complex12);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = complex28.cos();
        org.apache.commons.math.complex.ComplexField complexField32 = complex28.getField();
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double36 = complex35.getReal();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex43 = complex35.subtract(complex42);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex52 = complex49.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex53 = complex46.divide(complex52);
        java.util.List<org.apache.commons.math.complex.Complex> complexList55 = complex53.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex56 = complex35.pow(complex53);
        org.apache.commons.math.complex.Complex complex57 = complex53.negate();
        org.apache.commons.math.complex.Complex complex58 = complex57.sqrt1z();
        org.apache.commons.math.complex.Complex complex59 = complex28.multiply(complex57);
        boolean boolean60 = complex12.equals((java.lang.Object) complex59);
        org.apache.commons.math.complex.Complex complex61 = complex59.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.761594155955765d + "'", double10 == 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complexField32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complexList55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex61);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) (short) 0);
        org.apache.commons.math.complex.Complex complex7 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex18 = complex10.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex7.multiply(complex20);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.atan();
        org.apache.commons.math.complex.Complex complex11 = complex5.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex5.tan();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math.complex.Complex complex9 = complex5.tan();
        java.lang.Class<?> wildcardClass10 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex2.subtract(2.0256165601048464d);
        java.lang.String str14 = complex13.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(-3.0256165601048464, 1.0)" + "'", str14, "(-3.0256165601048464, 1.0)");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.atan();
        double double5 = complex3.abs();
        org.apache.commons.math.complex.Complex complex6 = complex3.acos();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.010309278350515464d + "'", double5 == 0.010309278350515464d);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex6 = complex3.pow((-1.0d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.atan();
        org.apache.commons.math.complex.Complex complex10 = complex5.acos();
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex12 = complex10.sin();
        org.apache.commons.math.complex.Complex complex14 = complex10.multiply((double) 100);
        java.lang.Class<?> wildcardClass15 = complex14.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.602020942307271d + "'", double11 == 1.602020942307271d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow(100.0d);
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(32.0d, (double) 10);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.valueOf(0.04417261042993862d, 0.9473574487656714d);
        org.apache.commons.math.complex.Complex complex8 = complex4.pow(complex7);
        java.lang.Class<?> wildcardClass9 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex2.createComplex((double) (short) 100, (double) (-1.0f));
        double double11 = complex10.getImaginary();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.sin();
        double double4 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex0.pow(complex9);
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.ComplexField complexField16 = complex14.getField();
        org.apache.commons.math.complex.Complex complex18 = complex14.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        double double23 = complex21.getArgument();
        boolean boolean24 = complex18.equals((java.lang.Object) double23);
        double double25 = complex18.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex10.add(complex18);
        org.apache.commons.math.complex.Complex complex27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex28 = complex10.add(complex27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.356194490192345d + "'", double23 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0000000000000002d + "'", double25 == 1.0000000000000002d);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex13.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        double double22 = complex21.abs();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.8891397050194616d + "'", double22 == 0.8891397050194616d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        java.util.List<org.apache.commons.math.complex.Complex> complexList16 = complex14.nthRoot((int) '4');
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexList16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        boolean boolean2 = complex1.isNaN();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex(2.6867724202798433d, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = complex7.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex11.cos();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        double double11 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex14.negate();
        org.apache.commons.math.complex.Complex complex18 = complex14.negate();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        boolean boolean20 = complex9.equals((java.lang.Object) complex19);
        double double21 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex9.pow(1.718281828459045d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.356194490192345d + "'", double16 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.0d);
        org.apache.commons.math.complex.Complex complex2 = complex1.negate();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) 0L);
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex2.pow((-2.0d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex1.createComplex(0.7853981633974483d, 11013.232874703393d);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.ComplexField complexField16 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.multiply((double) 1.0f);
        org.apache.commons.math.complex.Complex complex19 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow(100.0d);
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt();
        java.lang.String str7 = complex6.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0.45508986056222733, 1.09868411346781)" + "'", str7, "(0.45508986056222733, 1.09868411346781)");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex13 = complex2.multiply((double) (byte) -1);
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex13.nthRoot((int) (byte) 1);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((-2.0d));
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        boolean boolean16 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex15.multiply(0.6220932580717584d);
        boolean boolean19 = complex10.equals((java.lang.Object) 0.6220932580717584d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.multiply(1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex13.nthRoot((int) 'a');
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.761594155955765d, (-2.0d));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex3.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        double double17 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex24 = complex20.sin();
        org.apache.commons.math.complex.Complex complex25 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex16.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex29 = complex27.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6220932580717584d + "'", double17 == 0.6220932580717584d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex12 = complex4.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        double double14 = complex12.abs();
        org.apache.commons.math.complex.Complex complex15 = complex1.divide(complex12);
        double double16 = complex12.abs();
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        boolean boolean12 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        double double6 = complex3.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2934544550420957d + "'", double6 == 1.2934544550420957d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex13 = complex9.add((double) (-1));
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply(0.5751325350545315d);
        java.lang.Class<?> wildcardClass16 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        org.apache.commons.math.complex.Complex complex22 = complex20.subtract(2.718281828459045d);
        double double23 = complex20.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex23 = complex19.subtract(0.08120236107192619d);
        double double24 = complex19.getArgument();
        java.lang.Object obj25 = complex19.readResolve();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "(0.1353352832366127, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "(0.1353352832366127, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "(0.1353352832366127, 0.0)");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        double double4 = complex3.getReal();
        org.apache.commons.math.complex.Complex complex5 = complex3.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.718281828459045d + "'", double4 == 1.718281828459045d);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.9888977057628652d), (double) 100.0f);
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract((-0.9888977057628652d));
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.subtract(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.negate();
        org.apache.commons.math.complex.Complex complex21 = complex17.sin();
        boolean boolean23 = complex21.equals((java.lang.Object) 9.0d);
        org.apache.commons.math.complex.Complex complex25 = complex21.subtract((double) 0.0f);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = complex28.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex38 = complex33.add((double) 10);
        org.apache.commons.math.complex.Complex complex39 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex21.multiply(complex38);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex(2.7649306308923087d, (double) (-1));
        org.apache.commons.math.complex.Complex complex45 = complex41.divide(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.log();
        org.apache.commons.math.complex.Complex complex47 = complex46.tanh();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        org.apache.commons.math.complex.Complex complex10 = complex6.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex13.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex18 = complex13.add(1.718281828459045d);
        org.apache.commons.math.complex.Complex complex19 = complex3.add(complex13);
        boolean boolean20 = complex3.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = complex15.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex24 = complex19.subtract(complex23);
        boolean boolean25 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex11.add(complex19);
        double double27 = complex26.getReal();
        org.apache.commons.math.complex.Complex complex28 = complex26.negate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex28.nthRoot((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-2.5969151628319547d) + "'", double27 == (-2.5969151628319547d));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexList30);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex19.multiply(complex25);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.ComplexField complexField31 = complex29.getField();
        org.apache.commons.math.complex.Complex complex33 = complex29.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        double double38 = complex36.getArgument();
        boolean boolean39 = complex33.equals((java.lang.Object) double38);
        org.apache.commons.math.complex.Complex complex40 = complex33.negate();
        org.apache.commons.math.complex.Complex complex41 = complex33.acos();
        boolean boolean42 = complex26.equals((java.lang.Object) complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complexField31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.356194490192345d + "'", double38 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex6.asin();
        org.apache.commons.math.complex.Complex complex27 = complex26.log();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex11.cosh();
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex21.subtract((double) ' ');
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1L), 100.0d);
        org.apache.commons.math.complex.Complex complex27 = complex23.add(complex26);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double31 = complex30.getReal();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = complex30.subtract(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex30.sin();
        org.apache.commons.math.complex.Complex complex40 = complex39.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.divide((double) 1);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        double double47 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex48 = complex45.negate();
        org.apache.commons.math.complex.Complex complex50 = complex48.divide((double) 1);
        org.apache.commons.math.complex.Complex complex51 = complex42.subtract(complex48);
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex55 = complex54.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = complex56.tan();
        boolean boolean58 = complex56.isNaN();
        java.lang.Object obj59 = complex56.readResolve();
        org.apache.commons.math.complex.Complex complex62 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double63 = complex62.getReal();
        org.apache.commons.math.complex.Complex complex66 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex69 = complex66.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex70 = complex62.subtract(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex62.sin();
        org.apache.commons.math.complex.Complex complex72 = complex56.divide(complex62);
        org.apache.commons.math.complex.Complex complex73 = complex62.negate();
        org.apache.commons.math.complex.Complex complex74 = complex42.multiply(complex73);
        boolean boolean75 = complex23.equals((java.lang.Object) complex73);
        org.apache.commons.math.complex.Complex complex76 = complex14.pow(complex23);
        java.lang.Object obj77 = complex76.readResolve();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2.356194490192345d + "'", double47 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "(0.030632233564861985, 0.061256882031107365)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "(0.030632233564861985, 0.061256882031107365)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "(0.030632233564861985, 0.061256882031107365)");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex13.log();
        org.apache.commons.math.complex.Complex complex20 = complex13.asin();
        java.lang.String str21 = complex20.toString();
        org.apache.commons.math.complex.Complex complex24 = complex20.createComplex(32.0d, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex20.atan();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(-0.6662394324925153, 1.0612750619050355)" + "'", str21, "(-0.6662394324925153, 1.0612750619050355)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex11.multiply(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex11.exp();
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(1.0939075288148181d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex(2.6867724202798433d, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = complex7.pow(complex11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex7.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((-1.0612750619050357d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex24.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex32.sin();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex43.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex47 = complex39.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex36.divide(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex29.pow(complex47);
        org.apache.commons.math.complex.Complex complex51 = complex29.pow((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex52 = complex2.subtract(complex29);
        org.apache.commons.math.complex.Complex complex54 = complex29.pow((double) 10);
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex56 = complex54.conjugate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex2.divide((-1.0d));
        org.apache.commons.math.complex.Complex complex21 = complex2.createComplex(0.30689362367529766d, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        boolean boolean23 = complex21.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.6220932580717584d, 1.4953487812212205d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.add((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex9.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex18 = complex13.subtract(complex17);
        boolean boolean19 = complex13.isInfinite();
        java.lang.String str20 = complex13.toString();
        org.apache.commons.math.complex.Complex complex21 = complex6.multiply(complex13);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex21.divide(complex28);
        org.apache.commons.math.complex.Complex complex32 = complex28.pow((-0.9888977057628652d));
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(-1.2984575814159773, 0.6349639147847361)" + "'", str20, "(-1.2984575814159773, 0.6349639147847361)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.08120236107192619d, 100.0d);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex6.asin();
        org.apache.commons.math.complex.Complex complex27 = complex6.asin();
        java.lang.Class<?> wildcardClass28 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        java.lang.Object obj10 = complex8.readResolve();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "(-1.0, 1.0)");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex4 = complex1.cosh();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList6 = complex4.nthRoot((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex7.sin();
        org.apache.commons.math.complex.Complex complex11 = complex3.add(complex7);
        boolean boolean12 = complex3.isNaN();
        boolean boolean13 = complex3.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex3.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract((double) ' ');
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1L), 100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex7.add(complex10);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double15 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex14.subtract(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex14.sin();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex26 = complex24.divide((double) 1);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        double double31 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex29.negate();
        org.apache.commons.math.complex.Complex complex34 = complex32.divide((double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex26.subtract(complex32);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex40.tan();
        boolean boolean42 = complex40.isNaN();
        java.lang.Object obj43 = complex40.readResolve();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double47 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex53 = complex50.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex54 = complex46.subtract(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex46.sin();
        org.apache.commons.math.complex.Complex complex56 = complex40.divide(complex46);
        org.apache.commons.math.complex.Complex complex57 = complex46.negate();
        org.apache.commons.math.complex.Complex complex58 = complex26.multiply(complex57);
        boolean boolean59 = complex7.equals((java.lang.Object) complex57);
        java.lang.Object obj60 = complex57.readResolve();
        org.apache.commons.math.complex.Complex complex61 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex62 = complex61.cos();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.356194490192345d + "'", double31 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "(1.0, -1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "(1.0, -1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "(1.0, -1.0)");
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex2.pow(complex20);
        double double24 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex23.cos();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow(0.0d);
        org.apache.commons.math.complex.Complex complex28 = complex27.asin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08120236107192619d + "'", double24 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.asin();
        org.apache.commons.math.complex.Complex complex3 = complex0.exp();
        boolean boolean4 = complex3.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex8 = complex5.add((double) '4');
        boolean boolean9 = complex5.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex9.sin();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex24 = complex16.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex13.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex24.createComplex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex29 = complex6.multiply(complex24);
        boolean boolean30 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex6.cos();
        org.apache.commons.math.complex.Complex complex33 = complex6.multiply((double) 100L);
        org.apache.commons.math.complex.Complex complex34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex35 = complex33.multiply(complex34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex(9.0d, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex11.multiply((double) (-1L));
        org.apache.commons.math.complex.Complex complex19 = complex17.add((-0.04251371856656924d));
        boolean boolean20 = complex17.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex9.nthRoot((int) (short) 100);
        double double12 = complex9.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03024390243902439d + "'", double12 == 0.03024390243902439d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.718281828459045d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math.complex.Complex complex5 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.subtract((double) (byte) 100);
        double double11 = complex10.getImaginary();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.661006041483763d + "'", double11 == 0.661006041483763d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex2.sin();
        org.apache.commons.math.complex.Complex complex16 = complex2.tanh();
        double double17 = complex16.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.5464416775357993E-87d + "'", double17 == 2.5464416775357993E-87d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.apache.commons.math.complex.Complex complex20 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex20.log();
        org.apache.commons.math.complex.Complex complex22 = complex20.log();
        double double23 = complex20.getArgument();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.5707963267948966d + "'", double23 == 1.5707963267948966d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.9888977057628652d), (double) 100.0f);
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((double) 1L);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow((double) 10);
        double double14 = complex11.abs();
        org.apache.commons.math.complex.Complex complex16 = complex11.add(0.0d);
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.253068130003108d + "'", double14 == 1.253068130003108d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(0.11065722117389565d);
        java.lang.Class<?> wildcardClass10 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.4142135623730951d, 10.019331316097812d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex8 = complex6.add(2.356194490192345d);
        java.lang.String str9 = complex8.toString();
        org.apache.commons.math.complex.Complex complex10 = complex8.log();
        double double11 = complex10.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(-7.643805509807655, -10.0)" + "'", str9, "(-7.643805509807655, -10.0)");
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.2234376401506473d) + "'", double11 == (-2.2234376401506473d));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        double double11 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex14.negate();
        org.apache.commons.math.complex.Complex complex18 = complex14.negate();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        boolean boolean20 = complex9.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex(1.602036160225165d);
        org.apache.commons.math.complex.Complex complex23 = complex19.add(complex22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.356194490192345d + "'", double16 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.9473574487656714d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) 100L, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        boolean boolean16 = complex15.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex15 = complex7.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField21 = complex20.getField();
        org.apache.commons.math.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex15.divide(complex20);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex26 = complex23.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex3.pow(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex3.subtract((double) (-1));
        org.apache.commons.math.complex.Complex complex33 = complex3.createComplex(1.0000000000000002d, 0.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexField21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex5.divide(0.04417261042993862d);
        org.apache.commons.math.complex.Complex complex9 = complex8.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField9 = complex8.getField();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        boolean boolean13 = complex4.equals((java.lang.Object) complex11);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex16.divide(complex22);
        boolean boolean24 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex25 = complex16.asin();
        org.apache.commons.math.complex.Complex complex26 = complex25.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        java.lang.Object obj31 = complex30.readResolve();
        double double32 = complex30.abs();
        org.apache.commons.math.complex.Complex complex33 = complex26.subtract(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex11.multiply(complex30);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 10.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract((double) ' ');
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1L), 100.0d);
        org.apache.commons.math.complex.Complex complex11 = complex7.add(complex10);
        java.lang.Object obj12 = complex7.readResolve();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(-33.0, 32.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(-33.0, 32.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(-33.0, 32.0)");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(0.7861513777574233d);
        double double7 = complex3.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.4453965766582497d + "'", double7 == 1.4453965766582497d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt1z();
        java.lang.Object obj8 = complex2.readResolve();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "(-1.0, 1.0)");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        java.lang.Object obj5 = complex2.readResolve();
        boolean boolean6 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "(-1.0, 100.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "(-1.0, 100.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "(-1.0, 100.0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        double double5 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex8.sin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex23 = complex15.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex27.pow(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        boolean boolean31 = complex12.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.ComplexField complexField36 = complex34.getField();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean38 = complex34.equals((java.lang.Object) complex37);
        double double39 = complex34.getArgument();
        boolean boolean40 = complex12.equals((java.lang.Object) complex34);
        org.apache.commons.math.complex.Complex complex41 = complex4.multiply(complex12);
        org.apache.commons.math.complex.Complex complex42 = complex4.sin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.761594155955765d + "'", double5 == 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexField36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.356194490192345d + "'", double39 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex4.divide(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        boolean boolean25 = complex6.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.Complex complex26 = complex6.asin();
        org.apache.commons.math.complex.Complex complex27 = complex6.acos();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) 100L);
        org.apache.commons.math.complex.Complex complex30 = complex27.divide(complex29);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex37 = complex33.sin();
        double double38 = complex33.getArgument();
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double42 = complex41.getReal();
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex45.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex49 = complex41.subtract(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex33.subtract(complex48);
        org.apache.commons.math.complex.Complex complex51 = complex48.negate();
        org.apache.commons.math.complex.Complex complex52 = complex48.sin();
        boolean boolean54 = complex52.equals((java.lang.Object) 9.0d);
        org.apache.commons.math.complex.Complex complex56 = complex52.subtract((double) 0.0f);
        org.apache.commons.math.complex.Complex complex59 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex61 = complex59.pow(complex60);
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double65 = complex64.getReal();
        org.apache.commons.math.complex.Complex complex66 = complex59.add(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex64.sqrt();
        org.apache.commons.math.complex.Complex complex69 = complex64.add((double) 10);
        org.apache.commons.math.complex.Complex complex70 = complex69.conjugate();
        org.apache.commons.math.complex.Complex complex71 = complex69.sqrt1z();
        org.apache.commons.math.complex.Complex complex72 = complex52.multiply(complex69);
        org.apache.commons.math.complex.Complex complex73 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex74 = complex29.pow(complex73);
        boolean boolean75 = complex73.isNaN();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.356194490192345d + "'", double38 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex11.cosh();
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex14.tan();
        org.apache.commons.math.complex.Complex complex17 = complex14.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex17.nthRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList19);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex9.add((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex9.multiply(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        boolean boolean10 = complex6.isInfinite();
        org.apache.commons.math.complex.ComplexField complexField11 = complex6.getField();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex21 = complex14.divide(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex22.createComplex((double) (-1), (double) (short) -1);
        boolean boolean26 = complex20.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex27 = complex22.atan();
        org.apache.commons.math.complex.Complex complex28 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex6.subtract(complex22);
        org.apache.commons.math.complex.Complex complex30 = complex22.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math.complex.Complex complex14 = complex11.divide(32.0d);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex(2.8931627737962193d, 0.6014567574430342d);
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(2.770618290769386d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.415677327731228d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.0000000000000002d, 1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, 32.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.divide(4.457450346548196d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex5.multiply(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        double double10 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        boolean boolean15 = complex4.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex16 = complex14.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex1.exp();
        double double5 = complex4.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.subtract((double) 100L);
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        double double5 = complex4.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex(0.6220932580717584d, (double) 10.0f);
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        java.lang.String str12 = complex4.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.5726835322493407d + "'", double5 == 1.5726835322493407d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(-0.009999166824129912, 5.2983923556150705)" + "'", str12, "(-0.009999166824129912, 5.2983923556150705)");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((double) 0);
        java.lang.Class<?> wildcardClass5 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex4 = complex1.createComplex(0.7853981633974483d, 11013.232874703393d);
        org.apache.commons.math.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.04251371856656924d));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex(1.718281828459045d, (double) (short) 0);
        double double19 = complex18.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((double) 1);
        org.apache.commons.math.complex.Complex complex15 = complex3.pow(complex12);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex18.sin();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex33 = complex25.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex33.getField();
        org.apache.commons.math.complex.Complex complex36 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex36.log();
        boolean boolean38 = complex12.equals((java.lang.Object) complex36);
        java.lang.Object obj39 = complex36.readResolve();
        org.apache.commons.math.complex.Complex complex40 = complex36.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "(0.0, 1.7320508075688772)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "(0.0, 1.7320508075688772)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "(0.0, 1.7320508075688772)");
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex22.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex34 = complex19.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex38 = complex36.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex38.atan();
        org.apache.commons.math.complex.Complex complex41 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex42 = complex33.add(complex38);
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.718281828459045d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', (double) 1L);
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex15.add((double) (byte) 1);
        double double18 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex19 = complex15.atan();
        org.apache.commons.math.complex.Complex complex20 = complex15.acos();
        boolean boolean21 = complex9.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex22 = complex2.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass4 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        double double11 = complex9.getArgument();
        boolean boolean12 = complex6.equals((java.lang.Object) double11);
        org.apache.commons.math.complex.Complex complex13 = complex6.negate();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        double double18 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = complex19.divide((double) 1);
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex24.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex24.sin();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex39 = complex31.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex28.divide(complex39);
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex43.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        boolean boolean47 = complex28.equals((java.lang.Object) complex46);
        org.apache.commons.math.complex.Complex complex48 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex50 = complex6.multiply(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex54 = complex51.divide((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = complex51.subtract(0.03024390243902439d);
        org.apache.commons.math.complex.ComplexField complexField57 = complex51.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complexField57);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.cos();
        java.lang.Class<?> wildcardClass10 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex3.atan();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex11.atan();
        org.apache.commons.math.complex.Complex complex16 = complex11.acos();
        boolean boolean17 = complex5.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex5.createComplex(0.0d, (-0.0d));
        double double21 = complex5.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-0.6204734365564791d), (-0.9888977057628652d));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        double double17 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex10.multiply(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex13.log();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        java.lang.String str22 = complex21.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.356194490192345d + "'", double17 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(0.5198891300277854, 0.7213076372263415)" + "'", str22, "(0.5198891300277854, 0.7213076372263415)");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex8.subtract(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex12.subtract(1.0000000000000002d);
        java.lang.Class<?> wildcardClass17 = complex12.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.ComplexField complexField4 = complex0.getField();
        org.apache.commons.math.complex.Complex complex7 = complex0.createComplex(1.4453965766582497d, (double) (short) 0);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        boolean boolean9 = complex7.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 10, 0.05410648776016571d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex7.subtract(0.08120236107192619d);
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        double double17 = complex15.getArgument();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.8931627737962193d + "'", double17 == 2.8931627737962193d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(0.0d, 2.6867724202798433d);
        org.apache.commons.math.complex.Complex complex6 = complex5.tan();
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        boolean boolean8 = complex6.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex22 = complex20.multiply(complex21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex(1.4142135623730951d, 1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(2.7649306308923087d);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex31 = complex23.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex20.subtract(complex31);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex39 = complex35.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex((double) 0L, (double) '4');
        boolean boolean43 = complex39.isInfinite();
        org.apache.commons.math.complex.Complex complex44 = complex20.subtract(complex39);
        org.apache.commons.math.complex.Complex complex45 = complex16.divide(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.asin();
        double double47 = complex46.abs();
        double double48 = complex46.getReal();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexField37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.06429984768735961d + "'", double47 == 0.06429984768735961d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-0.019160334372740458d) + "'", double48 == (-0.019160334372740458d));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex7.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex7.nthRoot(10);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex21.add(complex28);
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField35 = complex34.getField();
        org.apache.commons.math.complex.Complex complex36 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex29.divide(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex16.subtract(complex37);
        double double39 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex42 = complex16.multiply((-2.0d));
        org.apache.commons.math.complex.ComplexField complexField43 = complex16.getField();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complexField30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexField35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.356194490192345d + "'", double39 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complexField43);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (-3.141592653589793d));
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        java.lang.Class<?> wildcardClass4 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-3.141592653589793d));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.log();
        java.lang.Class<?> wildcardClass5 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex10.sin();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex25 = complex17.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex14.divide(complex25);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex29.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        boolean boolean33 = complex14.equals((java.lang.Object) complex32);
        org.apache.commons.math.complex.Complex complex34 = complex14.atan();
        boolean boolean35 = complex6.equals((java.lang.Object) complex34);
        org.apache.commons.math.complex.Complex complex36 = complex6.sqrt1z();
        java.lang.Class<?> wildcardClass37 = complex36.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        double double15 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.029281239368487505d) + "'", double15 == (-0.029281239368487505d));
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10, 1.253068130003108d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((-2.0d));
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        boolean boolean11 = complex7.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract(0.7861513777574233d);
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        double double9 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.6349639147847361d) + "'", double9 == (-0.6349639147847361d));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex9.sin();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex24 = complex16.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex13.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex24.createComplex((double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex29 = complex6.multiply(complex24);
        org.apache.commons.math.complex.Complex complex31 = complex6.pow(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex32 = complex6.negate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.6014567574430342d, 0.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f);
        org.apache.commons.math.complex.Complex complex3 = complex1.subtract(0.0d);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.add((double) 10);
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        java.lang.String str14 = complex12.toString();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow((double) (short) -1);
        org.apache.commons.math.complex.Complex complex18 = complex16.add((-0.3095598756531122d));
        org.apache.commons.math.complex.Complex complex20 = complex16.divide((-1.8774892469777613d));
        org.apache.commons.math.complex.ComplexField complexField21 = complex20.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(9.0, 1.0)" + "'", str14, "(9.0, 1.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexField21);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex21);
        double double23 = complex22.getArgument();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.50831665993436d) + "'", double23 == (-1.50831665993436d));
    }
}

