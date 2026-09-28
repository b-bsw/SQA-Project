package org.apache.commons.math.complex;

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
        org.apache.commons.math.complex.Complex complex31 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex1.cosh();
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
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        boolean boolean3 = complex0.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        double double9 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex7.negate();
        org.apache.commons.math.complex.Complex complex12 = complex10.divide((double) 1);
        org.apache.commons.math.complex.Complex complex13 = complex10.negate();
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex0.multiply(complex13);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.356194490192345d + "'", double9 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "(-1.0, 1.0)");
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.acos();
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        boolean boolean13 = complex11.isInfinite();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((-2.0d));
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math.complex.Complex complex13 = complex11.atan();
        double double14 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7853981633974481d + "'", double14 == 0.7853981633974481d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(10.019331316097812d, (-0.8682488092848555d));
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1L));
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getArgument();
        boolean boolean15 = complex9.equals((java.lang.Object) double14);
        org.apache.commons.math.complex.Complex complex16 = complex9.negate();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex27.sin();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex42 = complex34.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex31.divide(complex42);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex46.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        boolean boolean50 = complex31.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex51 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex24.add(complex31);
        org.apache.commons.math.complex.Complex complex53 = complex9.multiply(complex52);
        java.lang.String str54 = complex53.toString();
        org.apache.commons.math.complex.Complex complex55 = complex2.divide(complex53);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(0.6634936666312412, 0.06657850379928648)" + "'", str54, "(0.6634936666312412, 0.06657850379928648)");
        org.junit.Assert.assertNotNull(complex55);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(4.457450346548196d, 0.06429984768735961d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        org.apache.commons.math.complex.Complex complex22 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex30.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex34 = complex27.divide(complex33);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex27.multiply(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex27.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex42 = complex27.negate();
        org.apache.commons.math.complex.Complex complex45 = complex27.createComplex(1.5700866977435435d, (double) (-1));
        double double46 = complex45.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex45.sinh();
        java.lang.String str48 = complex45.toString();
        org.apache.commons.math.complex.Complex complex49 = complex23.subtract(complex45);
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.5671162280815564d) + "'", double46 == (-0.5671162280815564d));
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(1.5700866977435435, -1.0)" + "'", str48, "(1.5700866977435435, -1.0)");
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-1.0839233273386948d));
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex(2.8959439850959656d, (-2.5969151628319547d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex5.divide(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply((double) (short) 100);
        double double15 = complex12.getReal();
        double double16 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex18 = complex12.log();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, 32.0d);
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex29.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex23.pow(complex29);
        boolean boolean32 = complex18.equals((java.lang.Object) complex31);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.03219512195121951d + "'", double15 == 0.03219512195121951d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03024390243902439d + "'", double16 == 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.9888977057628652d) + "'", double30 == (-0.9888977057628652d));
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        java.lang.Object obj16 = complex15.readResolve();
        double double17 = complex15.abs();
        org.apache.commons.math.complex.Complex complex18 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex21.tanh();
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
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex16 = complex10.subtract((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex17 = complex10.sin();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex24.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex35 = complex31.multiply((double) (-1.0f));
        org.apache.commons.math.complex.ComplexField complexField36 = complex35.getField();
        org.apache.commons.math.complex.Complex complex37 = complex21.subtract(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((-0.04251371856656924d));
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex43 = complex42.cos();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double47 = complex46.getReal();
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex53 = complex50.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex54 = complex46.subtract(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex53.sqrt1z();
        boolean boolean56 = complex43.equals((java.lang.Object) complex53);
        org.apache.commons.math.complex.Complex complex58 = complex53.pow(3.050932766389048d);
        org.apache.commons.math.complex.Complex complex59 = complex53.cos();
        org.apache.commons.math.complex.Complex complex60 = complex37.pow(complex59);
        double double61 = complex59.getArgument();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexField36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math.complex.Complex complex13 = complex11.subtract(1.1572821586568314d);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt1z();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.5464416775357993E-87d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex3.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.add((-1.1719284454208705d));
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.4429679074828778d), 0.7861513777574233d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math.complex.Complex complex5 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double10 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex9.subtract(complex16);
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex27 = complex20.divide(complex26);
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex27.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex30 = complex9.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math.complex.Complex complex32 = complex30.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = complex3.divide(complex33);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexList29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        double double23 = complex21.getArgument();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.5401165937783299d + "'", double23 == 1.5401165937783299d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (double) (byte) 10);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.acos();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex2.divide(2.7649306308923087d);
        org.apache.commons.math.complex.Complex complex9 = complex7.divide(0.30689362367529766d);
        org.apache.commons.math.complex.Complex complex10 = complex7.cos();
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.conjugate();
        java.lang.Object obj9 = complex2.readResolve();
        org.apache.commons.math.complex.Complex complex10 = complex2.sinh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(-1.0, 1.0)");
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-0.40059690294250294d), 1.718281828459045d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        double double7 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex2.multiply(0.06429984768735961d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, 32.0d);
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract((double) (short) -1);
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(9327.56102338046d);
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double16 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex17 = complex10.add(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.pow(0.7861513777574233d);
        boolean boolean21 = complex20.isNaN();
        boolean boolean22 = complex4.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex45 = complex38.divide(complex44);
        boolean boolean46 = complex38.isInfinite();
        org.apache.commons.math.complex.Complex complex47 = complex38.asin();
        org.apache.commons.math.complex.Complex complex48 = complex47.tan();
        org.apache.commons.math.complex.Complex complex50 = complex48.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.sinh();
        java.lang.Object obj53 = complex52.readResolve();
        double double54 = complex52.abs();
        org.apache.commons.math.complex.Complex complex55 = complex48.subtract(complex52);
        org.apache.commons.math.complex.Complex complex56 = complex55.log();
        org.apache.commons.math.complex.Complex complex57 = complex56.cos();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex61 = complex60.sin();
        org.apache.commons.math.complex.Complex complex62 = complex60.asin();
        org.apache.commons.math.complex.Complex complex63 = complex56.divide(complex60);
        org.apache.commons.math.complex.Complex complex64 = complex63.asin();
        org.apache.commons.math.complex.Complex complex65 = complex34.add(complex63);
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
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex8.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex16 = complex13.add((double) 100.0f);
        java.lang.Class<?> wildcardClass17 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double14 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex21 = complex13.subtract(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex13.sin();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((double) 1);
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        double double30 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex28.negate();
        org.apache.commons.math.complex.Complex complex33 = complex31.divide((double) 1);
        org.apache.commons.math.complex.Complex complex34 = complex25.subtract(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex10.divide(complex25);
        org.apache.commons.math.complex.Complex complex37 = complex25.add(0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex44 = complex40.sin();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex45.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex49 = complex44.subtract(complex48);
        boolean boolean50 = complex48.isNaN();
        double double51 = complex48.abs();
        org.apache.commons.math.complex.Complex complex52 = complex48.conjugate();
        double double53 = complex52.abs();
        org.apache.commons.math.complex.Complex complex54 = complex25.subtract(complex52);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.356194490192345d + "'", double30 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.4142135623730951d + "'", double51 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.4142135623730951d + "'", double53 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex54);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow(0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex7 = complex4.sqrt1z();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        org.apache.commons.math.complex.Complex complex30 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex41 = complex33.subtract(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex33.sin();
        org.apache.commons.math.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex49 = complex46.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex50 = complex46.sin();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex51.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex55 = complex50.subtract(complex54);
        boolean boolean56 = complex50.isInfinite();
        org.apache.commons.math.complex.Complex complex57 = complex42.add(complex50);
        org.apache.commons.math.complex.Complex complex58 = complex57.conjugate();
        org.apache.commons.math.complex.Complex complex59 = complex29.subtract(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex61 = complex60.negate();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex2.divide(0.3000525987847908d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex22.negate();
        org.apache.commons.math.complex.Complex complex26 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex19.add(complex26);
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        double double11 = complex9.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex15 = complex13.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        org.apache.commons.math.complex.Complex complex18 = complex9.add(complex15);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = complex21.sin();
        double double26 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double30 = complex29.getReal();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex37 = complex29.subtract(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex21.subtract(complex36);
        java.lang.Object obj39 = complex38.readResolve();
        org.apache.commons.math.complex.Complex complex40 = complex15.subtract(complex38);
        org.apache.commons.math.complex.Complex complex41 = complex15.log();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        boolean boolean46 = complex44.isNaN();
        boolean boolean47 = complex44.isInfinite();
        org.apache.commons.math.complex.Complex complex48 = complex44.acos();
        org.apache.commons.math.complex.Complex complex49 = complex48.negate();
        org.apache.commons.math.complex.Complex complex50 = complex15.divide(complex49);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.03024390243902439d + "'", double11 == 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.356194490192345d + "'", double26 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "(0.0, -31.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "(0.0, -31.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "(0.0, -31.0)");
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 10.0f);
        org.apache.commons.math.complex.Complex complex3 = complex1.pow((-2.3871097261613063d));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex12.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex21 = complex16.subtract(complex20);
        boolean boolean22 = complex20.isNaN();
        double double23 = complex20.abs();
        org.apache.commons.math.complex.Complex complex24 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField29 = complex28.getField();
        org.apache.commons.math.complex.Complex complex30 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex30.asin();
        org.apache.commons.math.complex.Complex complex32 = complex24.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex34 = complex6.pow(complex33);
        java.lang.String str35 = complex34.toString();
        org.apache.commons.math.complex.Complex complex36 = complex34.log();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.4142135623730951d + "'", double23 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(0.102289071750222, 0.053371015965390824)" + "'", str35, "(0.102289071750222, 0.053371015965390824)");
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(4.969227722265613d);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        double double11 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex20 = complex18.add(2.356194490192345d);
        org.apache.commons.math.complex.Complex complex21 = complex20.exp();
        org.apache.commons.math.complex.Complex complex22 = complex9.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex22.divide(0.9473574487656714d);
        org.apache.commons.math.complex.Complex complex26 = complex24.pow(0.9888977057628651d);
        org.apache.commons.math.complex.Complex complex28 = complex24.multiply(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.apache.commons.math.complex.Complex complex13 = complex11.asin();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex23 = complex16.add(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex25 = complex13.add(complex24);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex13.divide(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.ComplexField complexField29 = complex27.getField();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        double double36 = complex34.getArgument();
        boolean boolean37 = complex31.equals((java.lang.Object) double36);
        org.apache.commons.math.complex.Complex complex38 = complex31.negate();
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double43 = complex42.getReal();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex49 = complex46.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex50 = complex42.subtract(complex49);
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex60 = complex53.divide(complex59);
        java.util.List<org.apache.commons.math.complex.Complex> complexList62 = complex60.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex63 = complex42.pow(complex60);
        double double64 = complex63.getImaginary();
        org.apache.commons.math.complex.Complex complex65 = complex63.cos();
        org.apache.commons.math.complex.Complex complex67 = complex63.pow(0.0d);
        org.apache.commons.math.complex.Complex complex68 = complex38.add(complex63);
        org.apache.commons.math.complex.Complex complex71 = complex68.createComplex(Double.NaN, 0.8337300251311491d);
        org.apache.commons.math.complex.Complex complex72 = complex68.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex24.add(complex68);
        double double74 = complex68.getImaginary();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.356194490192345d + "'", double36 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complexList62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.08120236107192619d + "'", double64 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.9187976389280741d) + "'", double74 == (-0.9187976389280741d));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        org.apache.commons.math.complex.Complex complex46 = complex39.cos();
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
        org.junit.Assert.assertNotNull(complex46);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        java.lang.Object obj4 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex5 = complex1.atan();
        boolean boolean6 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex9 = complex1.createComplex((-0.5671162280815564d), (-3.141592653589793d));
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex12.negate();
        double double16 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex12.subtract(0.03024390243902439d);
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex1.divide(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow(0.4429679074828777d);
        double double23 = complex20.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.356194490192345d + "'", double16 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        double double18 = complex4.getArgument();
        java.lang.Object obj19 = complex4.readResolve();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0.30689362367529766, 0.2028585393422162)" + "'", str15, "(0.30689362367529766, 0.2028585393422162)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "(-1.0, 1.0000000000000002)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "(-1.0, 1.0000000000000002)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "(-1.0, 1.0000000000000002)");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.0d), (-0.03024390243902439d));
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex8 = complex5.add((double) '4');
        org.apache.commons.math.complex.Complex complex10 = complex8.add(1.0912770348023004d);
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex13.sin();
        double double18 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex29 = complex21.subtract(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex13.subtract(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex28.negate();
        org.apache.commons.math.complex.Complex complex32 = complex28.sin();
        boolean boolean34 = complex32.equals((java.lang.Object) 9.0d);
        org.apache.commons.math.complex.Complex complex36 = complex32.subtract((double) 0.0f);
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double45 = complex44.getReal();
        org.apache.commons.math.complex.Complex complex46 = complex39.add(complex44);
        org.apache.commons.math.complex.Complex complex47 = complex44.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex44.add((double) 10);
        org.apache.commons.math.complex.Complex complex50 = complex49.conjugate();
        org.apache.commons.math.complex.Complex complex51 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = complex32.multiply(complex49);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex(2.7649306308923087d, (double) (-1));
        org.apache.commons.math.complex.Complex complex56 = complex52.divide(complex55);
        boolean boolean57 = complex10.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex58 = complex55.conjugate();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex62 = complex60.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex63 = complex62.asin();
        org.apache.commons.math.complex.Complex complex64 = complex62.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex62.divide(2.718281828459045d);
        org.apache.commons.math.complex.Complex complex67 = complex66.exp();
        org.apache.commons.math.complex.Complex complex68 = complex55.pow(complex66);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (byte) 0, (double) (-1));
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(0.03024390243902439d, (-2.356194490192345d));
        org.apache.commons.math.complex.Complex complex6 = complex2.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        java.lang.String str28 = complex27.toString();
        org.apache.commons.math.complex.Complex complex29 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex27.multiply((-56.33544305877831d));
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
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(1.9998828036967822, -6.3740884202662285)" + "'", str28, "(1.9998828036967822, -6.3740884202662285)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(3.21715051171181d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(2.718281828459045d);
        org.apache.commons.math.complex.Complex complex5 = complex1.subtract((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        double double8 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.exp();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex16 = complex13.cos();
        org.apache.commons.math.complex.Complex complex17 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex18 = complex12.tan();
        org.apache.commons.math.complex.Complex complex19 = complex6.pow(complex18);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex9.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex3.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex14.add((-1.1719284454208705d));
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex((double) (byte) -1, (double) ' ');
        boolean boolean52 = complex51.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex51.tan();
        org.apache.commons.math.complex.Complex complex54 = complex16.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex58 = complex55.pow(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex16.divide(complex55);
        org.apache.commons.math.complex.Complex complex60 = complex59.negate();
        org.apache.commons.math.complex.Complex complex61 = complex60.atan();
        double double62 = complex60.getImaginary();
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
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-1));
        java.lang.Object obj2 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex5 = complex1.createComplex(2.7649306308923087d, 0.7853981633974483d);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex8.multiply(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex1.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex1.tanh();
        boolean boolean24 = complex23.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(-1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(-1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(-1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex13 = complex2.multiply(complex10);
        org.apache.commons.math.complex.Complex complex15 = complex13.add((-1.0839233273386948d));
        org.apache.commons.math.complex.Complex complex16 = complex13.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex13 = complex9.multiply((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(0.75415832996718d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.apache.commons.math.complex.Complex complex16 = complex3.sin();
        org.apache.commons.math.complex.ComplexField complexField17 = complex3.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.356194490192345d + "'", double11 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        org.apache.commons.math.complex.Complex complex19 = complex2.pow((-0.45482023330994986d));
        org.apache.commons.math.complex.Complex complex20 = complex2.log();
        org.apache.commons.math.complex.ComplexField complexField21 = complex2.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complexField21);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex((double) (byte) -1, (double) ' ');
        boolean boolean52 = complex51.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex51.tan();
        org.apache.commons.math.complex.Complex complex54 = complex16.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex58 = complex55.pow(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex16.divide(complex55);
        org.apache.commons.math.complex.Complex complex60 = complex55.log();
        org.apache.commons.math.complex.Complex complex62 = complex60.add(1.5607961601707163d);
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
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex62);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, 1.0000000000000002d);
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract(0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        java.lang.String str36 = complex6.toString();
        java.lang.Class<?> wildcardClass37 = complex6.getClass();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(-10.0, -10.0)" + "'", str36, "(-10.0, -10.0)");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.cosh();
        boolean boolean7 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (-1.0f));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.0d, (double) (byte) 10);
        boolean boolean3 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        boolean boolean4 = complex2.isNaN();
        boolean boolean5 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex2.acos();
        org.apache.commons.math.complex.Complex complex7 = complex6.negate();
        double double8 = complex6.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex6.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.2370357592874117d + "'", double8 == 2.2370357592874117d);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) 100);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        double double13 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        org.apache.commons.math.complex.Complex complex16 = complex14.divide((double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.asin();
        org.apache.commons.math.complex.Complex complex18 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex21 = complex6.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex(1.718281828459045d, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex21.subtract(complex26);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = complex32.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.356194490192345d + "'", double13 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        double double10 = complex2.abs();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.ComplexField complexField12 = complex2.getField();
        org.apache.commons.math.complex.Complex complex13 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex13.cos();
        org.apache.commons.math.complex.Complex complex15 = complex13.atan();
        org.apache.commons.math.complex.Complex complex16 = complex13.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex6 = complex0.cos();
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(1.0000000000000002d);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex12.negate();
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) 1);
        org.apache.commons.math.complex.Complex complex18 = complex15.negate();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        boolean boolean21 = complex8.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex23 = complex19.subtract(1.602020942307271d);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex24.multiply(0.7861513777574233d);
        org.apache.commons.math.complex.Complex complex28 = complex23.add(complex27);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        org.apache.commons.math.complex.Complex complex19 = complex18.cos();
        org.apache.commons.math.complex.Complex complex21 = complex18.subtract((double) 0);
        org.apache.commons.math.complex.Complex complex22 = complex18.atan();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) 100L, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex33 = complex18.divide(complex32);
        boolean boolean34 = complex18.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.4142135623730951d + "'", double10 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex5.divide(0.04417261042993862d);
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.multiply((-0.8703274249911195d));
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex8.nthRoot((int) (byte) 100);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexList13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((-1.0d), 1.5700866977435435d);
        org.apache.commons.math.complex.Complex complex11 = complex7.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double16 = complex15.getReal();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex15.subtract(complex22);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex33 = complex26.divide(complex32);
        java.util.List<org.apache.commons.math.complex.Complex> complexList35 = complex33.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex36 = complex15.pow(complex33);
        double double37 = complex36.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex36.cos();
        org.apache.commons.math.complex.Complex complex39 = complex36.acos();
        org.apache.commons.math.complex.Complex complex40 = complex36.sin();
        org.apache.commons.math.complex.Complex complex41 = complex36.exp();
        org.apache.commons.math.complex.Complex complex42 = complex12.subtract(complex36);
        org.apache.commons.math.complex.Complex complex43 = complex12.sinh();
        double double44 = complex43.getImaginary();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complexList35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.08120236107192619d + "'", double37 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.2002123183184283d) + "'", double44 == (-0.2002123183184283d));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        org.apache.commons.math.complex.Complex complex18 = complex9.atan();
        org.apache.commons.math.complex.Complex complex19 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex23 = complex21.divide((double) 'a');
        java.lang.Object obj24 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex23.atan();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) 0L);
        org.apache.commons.math.complex.Complex complex29 = complex19.divide(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex19.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        double double5 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex4.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.761594155955765d + "'", double5 == 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex24 = complex22.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex3.add(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex3.negate();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double31 = complex30.getReal();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = complex30.subtract(complex37);
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        double double43 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex41.negate();
        double double45 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex38.multiply(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex41.log();
        double double48 = complex41.getArgument();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex41.nthRoot(10);
        org.apache.commons.math.complex.Complex complex52 = complex41.multiply((-0.8682488092848555d));
        org.apache.commons.math.complex.Complex complex53 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex58 = complex56.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex61 = complex56.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex63 = complex56.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex64 = complex55.pow(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex64.asin();
        org.apache.commons.math.complex.Complex complex68 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex71 = complex68.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex75 = complex72.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex76 = complex68.add(complex75);
        org.apache.commons.math.complex.Complex complex77 = complex76.sin();
        org.apache.commons.math.complex.Complex complex78 = complex77.sinh();
        double double79 = complex77.getImaginary();
        org.apache.commons.math.complex.Complex complex81 = complex77.subtract((double) '4');
        org.apache.commons.math.complex.Complex complex82 = complex81.tan();
        org.apache.commons.math.complex.Complex complex83 = complex65.subtract(complex81);
        org.apache.commons.math.complex.Complex complex84 = complex41.add(complex83);
        org.apache.commons.math.complex.Complex complex85 = complex27.add(complex83);
        org.apache.commons.math.complex.Complex complex86 = complex85.sinh();
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
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.356194490192345d + "'", double43 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 2.356194490192345d + "'", double45 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2.356194490192345d + "'", double48 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complexList50);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-0.0d) + "'", double79 == (-0.0d));
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = complex36.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex40 = complex38.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList42 = complex38.nthRoot(10);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex45.pow(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex47.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex60 = complex52.add(complex59);
        org.apache.commons.math.complex.ComplexField complexField61 = complex60.getField();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex62.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField66 = complex65.getField();
        org.apache.commons.math.complex.Complex complex67 = complex65.cosh();
        org.apache.commons.math.complex.Complex complex68 = complex60.divide(complex65);
        org.apache.commons.math.complex.Complex complex69 = complex47.subtract(complex68);
        double double70 = complex47.getArgument();
        org.apache.commons.math.complex.Complex complex71 = complex38.multiply(complex47);
        org.apache.commons.math.complex.Complex complex73 = complex47.multiply((-2.0d));
        org.apache.commons.math.complex.Complex complex74 = complex30.pow(complex47);
        org.apache.commons.math.complex.Complex complex75 = complex47.cos();
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
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complexList42);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complexField61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complexField66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2.356194490192345d + "'", double70 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex3.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        org.apache.commons.math.complex.Complex complex40 = complex36.createComplex((double) 0.0f, 1.2984575814159773d);
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex(1.1708356379124094d, 0.9888977057628652d);
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
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double26 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex33 = complex25.subtract(complex32);
        double double34 = complex32.getReal();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex(2.6867724202798433d, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex38 = complex37.asin();
        org.apache.commons.math.complex.Complex complex39 = complex32.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex38.asin();
        double double41 = complex40.abs();
        org.apache.commons.math.complex.Complex complex42 = complex22.multiply(complex40);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.5587308105803555d + "'", double41 == 1.5587308105803555d);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getArgument();
        boolean boolean15 = complex9.equals((java.lang.Object) double14);
        org.apache.commons.math.complex.Complex complex16 = complex9.negate();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex27.sin();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex42 = complex34.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex31.divide(complex42);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex46.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        boolean boolean50 = complex31.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex51 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex24.add(complex31);
        org.apache.commons.math.complex.Complex complex53 = complex9.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex56 = complex54.divide((-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex57 = complex54.sinh();
        org.apache.commons.math.complex.Complex complex58 = complex0.multiply(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex0.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-0.3095598756531122d), 0.6349639147847361d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        org.apache.commons.math.complex.Complex complex52 = complex51.sqrt1z();
        org.apache.commons.math.complex.Complex complex53 = complex52.sqrt();
        org.apache.commons.math.complex.Complex complex54 = complex52.asin();
        org.apache.commons.math.complex.Complex complex56 = complex54.divide(32.01562118716424d);
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
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex7.subtract(2.718281828459045d);
        org.apache.commons.math.complex.Complex complex11 = complex7.sin();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex14.sin();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex29 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex18.divide(complex29);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        boolean boolean37 = complex18.equals((java.lang.Object) complex36);
        boolean boolean38 = complex7.equals((java.lang.Object) boolean37);
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex7.nthRoot((int) (short) 100);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complexList40);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        double double26 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex24.negate();
        org.apache.commons.math.complex.Complex complex29 = complex27.divide((double) 1);
        org.apache.commons.math.complex.Complex complex30 = complex18.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex18.sin();
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex33 = complex13.multiply(complex32);
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.356194490192345d + "'", double26 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        org.apache.commons.math.complex.Complex complex34 = complex30.cos();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.valueOf(2.6867724202798433d);
        org.apache.commons.math.complex.Complex complex37 = complex34.multiply(complex36);
        double double38 = complex36.getImaginary();
        org.apache.commons.math.complex.Complex complex39 = complex36.tan();
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
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        boolean boolean6 = complex4.isNaN();
        java.lang.Object obj7 = complex4.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double17 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex18 = complex11.add(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex16.add((double) 10);
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex21.divide((double) 1);
        org.apache.commons.math.complex.Complex complex25 = complex21.acos();
        org.apache.commons.math.complex.Complex complex26 = complex8.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.272019649514069, 0.7861513777574233)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.6349639147847361d);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex2.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex10 = complex1.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex16 = complex12.log();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex20 = complex18.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex28 = complex26.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex29 = complex20.pow(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex12.subtract(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex10.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex10.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex2.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex19 = complex2.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math.complex.Complex complex22 = complex19.add(2.5768045625339715d);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double26 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex33 = complex25.subtract(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex25.sin();
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex39 = complex37.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex47 = complex45.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex39.pow(complex47);
        java.lang.Object obj49 = complex48.readResolve();
        org.apache.commons.math.complex.Complex complex50 = complex34.multiply(complex48);
        boolean boolean51 = complex22.equals((java.lang.Object) complex34);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        double double2 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.ComplexField complexField7 = complex5.getField();
        org.apache.commons.math.complex.Complex complex9 = complex5.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        double double14 = complex12.getArgument();
        boolean boolean15 = complex9.equals((java.lang.Object) double14);
        org.apache.commons.math.complex.Complex complex16 = complex9.negate();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex19.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex22.divide((double) 1);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex27.sin();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex42 = complex34.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex31.divide(complex42);
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex46.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        boolean boolean50 = complex31.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex51 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex24.add(complex31);
        org.apache.commons.math.complex.Complex complex53 = complex9.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex56 = complex54.divide((-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex57 = complex54.sinh();
        org.apache.commons.math.complex.Complex complex58 = complex0.multiply(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex57.subtract(1.602020942307271d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex2.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex19 = complex18.acos();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.19540692462289833d, 10.019331316097812d);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex8 = complex3.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex9 = complex3.acos();
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex(0.0d, 0.9473574487656714d);
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex19 = complex17.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) 100);
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double26 = complex25.getReal();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex33 = complex25.subtract(complex32);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        double double38 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex39 = complex36.negate();
        double double40 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex41 = complex33.multiply(complex36);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double45 = complex44.getReal();
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex52 = complex44.subtract(complex51);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex58 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex61 = complex58.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex62 = complex55.divide(complex61);
        java.util.List<org.apache.commons.math.complex.Complex> complexList64 = complex62.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex65 = complex44.pow(complex62);
        org.apache.commons.math.complex.Complex complex66 = complex65.acos();
        boolean boolean67 = complex33.equals((java.lang.Object) complex66);
        double double68 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex69 = complex21.divide(complex33);
        org.apache.commons.math.complex.Complex complex71 = complex33.multiply(5.0990195135927845d);
        org.apache.commons.math.complex.Complex complex72 = complex14.pow(complex33);
        org.apache.commons.math.complex.Complex complex73 = complex2.pow(complex14);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.356194490192345d + "'", double38 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 2.356194490192345d + "'", double40 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complexList64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        java.lang.Object obj4 = complex3.readResolve();
        org.apache.commons.math.complex.Complex complex5 = complex3.atan();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        double double10 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        org.apache.commons.math.complex.Complex complex15 = complex5.add(complex11);
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex44 = complex40.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex47 = complex45.pow((double) 0);
        java.util.List<org.apache.commons.math.complex.Complex> complexList49 = complex47.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex50 = complex34.add(complex47);
        boolean boolean51 = complex34.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex34.add(1.0d);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex57 = complex56.sin();
        org.apache.commons.math.complex.Complex complex58 = complex56.asin();
        boolean boolean59 = complex56.isNaN();
        org.apache.commons.math.complex.Complex complex60 = complex56.sqrt();
        org.apache.commons.math.complex.Complex complex61 = complex56.sqrt();
        org.apache.commons.math.complex.Complex complex62 = complex56.cos();
        org.apache.commons.math.complex.Complex complex63 = complex53.pow(complex62);
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
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complexList49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.11065722117389565d);
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex5.sin();
        double double10 = complex5.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex5.tan();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double15 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex14.subtract(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex14.sin();
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex28 = complex26.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex28.pow(complex36);
        java.lang.Object obj38 = complex37.readResolve();
        org.apache.commons.math.complex.Complex complex39 = complex23.multiply(complex37);
        boolean boolean40 = complex39.isInfinite();
        java.lang.String str41 = complex39.toString();
        org.apache.commons.math.complex.Complex complex42 = complex39.tan();
        org.apache.commons.math.complex.Complex complex43 = complex5.add(complex39);
        org.apache.commons.math.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math.complex.Complex complex45 = complex1.add(complex43);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex49 = complex48.conjugate();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.exp();
        org.apache.commons.math.complex.Complex complex52 = complex50.sqrt1z();
        org.apache.commons.math.complex.Complex complex53 = complex50.cos();
        org.apache.commons.math.complex.Complex complex54 = complex49.add(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex50.atan();
        java.lang.String str56 = complex55.toString();
        org.apache.commons.math.complex.Complex complex57 = complex55.atan();
        org.apache.commons.math.complex.Complex complex58 = complex1.add(complex55);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.356194490192345d + "'", double10 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(0.9973488516012596, 1.0461675449109649)" + "'", str41, "(0.9973488516012596, 1.0461675449109649)");
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(0.7853981633974483, 0.0)" + "'", str56, "(0.7853981633974483, 0.0)");
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        double double28 = complex23.abs();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9416679725568717d + "'", double28 == 0.9416679725568717d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        boolean boolean24 = complex23.isInfinite();
        org.apache.commons.math.complex.Complex complex26 = complex23.multiply(1.5707963267948966d);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex17 = complex15.divide((double) 'a');
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex17.atan();
        org.apache.commons.math.complex.Complex complex20 = complex13.divide(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "(0.010309278350515464, 0.0)");
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        double double6 = complex5.getReal();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.apache.commons.math.complex.Complex complex20 = complex16.add((double) (-1));
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        org.apache.commons.math.complex.Complex complex27 = complex23.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        double double32 = complex30.getArgument();
        boolean boolean33 = complex27.equals((java.lang.Object) double32);
        org.apache.commons.math.complex.Complex complex34 = complex27.negate();
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        double double39 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex37.negate();
        org.apache.commons.math.complex.Complex complex42 = complex40.divide((double) 1);
        org.apache.commons.math.complex.Complex complex45 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex48 = complex45.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex49 = complex45.sin();
        org.apache.commons.math.complex.Complex complex52 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex60 = complex52.add(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex49.divide(complex60);
        org.apache.commons.math.complex.Complex complex64 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex66 = complex64.pow(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex66.cosh();
        boolean boolean68 = complex49.equals((java.lang.Object) complex67);
        org.apache.commons.math.complex.Complex complex69 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex70 = complex42.add(complex49);
        org.apache.commons.math.complex.Complex complex71 = complex27.multiply(complex70);
        org.apache.commons.math.complex.Complex complex72 = complex70.sqrt();
        double double73 = complex72.getImaginary();
        org.apache.commons.math.complex.Complex complex74 = complex16.subtract(complex72);
        org.apache.commons.math.complex.Complex complex75 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex76 = complex5.pow(complex16);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.9999999999999997d) + "'", double6 == (-0.9999999999999997d));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.356194490192345d + "'", double32 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.356194490192345d + "'", double39 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.6204734365564791d) + "'", double73 == (-0.6204734365564791d));
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex12 = complex5.divide(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex11.createComplex((double) (byte) 0, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = complex16.log();
        org.apache.commons.math.complex.Complex complex18 = complex2.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex3 = complex0.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex4 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex8 = complex6.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex14.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex8.pow(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex0.subtract(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex20.pow(0.0d);
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.04417261042993862d, (double) '4');
        java.lang.String str3 = complex2.toString();
        org.apache.commons.math.complex.Complex complex5 = complex2.add(0.30689362367529766d);
        org.apache.commons.math.complex.Complex complex7 = complex2.subtract((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0.04417261042993862, 52.0)" + "'", str3, "(0.04417261042993862, 52.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.4499610440276412d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.37076031045626007d, 0.9391185397711626d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex13.divide(complex20);
        org.apache.commons.math.complex.Complex complex26 = complex13.createComplex((-0.6204734365564791d), 0.8927973450252138d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.5735600064310544d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(100.0d);
        org.apache.commons.math.complex.Complex complex8 = complex0.createComplex(1.4453965766582497d, (-3.141592653589793d));
        org.apache.commons.math.complex.ComplexField complexField9 = complex0.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complexField9);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean6 = complex2.equals((java.lang.Object) complex5);
        org.apache.commons.math.complex.Complex complex8 = complex2.subtract((-0.32821152988188157d));
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.ComplexField complexField13 = complex11.getField();
        org.apache.commons.math.complex.Complex complex15 = complex11.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        double double20 = complex18.getArgument();
        boolean boolean21 = complex15.equals((java.lang.Object) double20);
        org.apache.commons.math.complex.Complex complex22 = complex15.negate();
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double27 = complex26.getReal();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex30.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex34 = complex26.subtract(complex33);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex40 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex44 = complex37.divide(complex43);
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex44.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex47 = complex26.pow(complex44);
        double double48 = complex47.getImaginary();
        org.apache.commons.math.complex.Complex complex49 = complex47.cos();
        org.apache.commons.math.complex.Complex complex51 = complex47.pow(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex22.add(complex47);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex(Double.NaN, 0.8337300251311491d);
        org.apache.commons.math.complex.Complex complex56 = complex52.sinh();
        org.apache.commons.math.complex.Complex complex58 = new org.apache.commons.math.complex.Complex((double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math.complex.Complex complex60 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex61 = complex58.tanh();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.valueOf(2.6867724202798433d);
        org.apache.commons.math.complex.Complex complex64 = complex63.negate();
        org.apache.commons.math.complex.Complex complex66 = complex64.multiply((double) (-1.0f));
        double double67 = complex66.getImaginary();
        org.apache.commons.math.complex.Complex complex68 = complex61.divide(complex66);
        double double69 = complex66.getArgument();
        org.apache.commons.math.complex.Complex complex70 = complex56.multiply(complex66);
        org.apache.commons.math.complex.Complex complex71 = complex2.add(complex66);
        org.apache.commons.math.complex.Complex complex72 = complex71.cos();
        org.apache.commons.math.complex.Complex complex73 = complex72.cosh();
        org.apache.commons.math.complex.Complex complex75 = complex72.divide(1.1174700207060706d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.356194490192345d + "'", double20 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complexList46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.08120236107192619d + "'", double48 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex75);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-0.40059690294250294d));
        org.apache.commons.math.complex.Complex complex3 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex5 = complex3.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex8.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex11.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex5.pow(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex5.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex5.nthRoot(1);
        org.apache.commons.math.complex.Complex complex18 = complex1.pow(complex5);
        double double19 = complex1.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.141592653589793d + "'", double19 == 3.141592653589793d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex80 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex83 = complex80.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex84 = complex77.divide(complex83);
        boolean boolean85 = complex77.isInfinite();
        org.apache.commons.math.complex.Complex complex86 = complex77.asin();
        org.apache.commons.math.complex.Complex complex87 = complex77.cos();
        org.apache.commons.math.complex.Complex complex88 = complex74.multiply(complex77);
        org.apache.commons.math.complex.Complex complex89 = complex88.negate();
        org.apache.commons.math.complex.Complex complex90 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex91 = complex90.exp();
        org.apache.commons.math.complex.Complex complex92 = complex90.tan();
        org.apache.commons.math.complex.Complex complex94 = complex92.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex96 = complex94.multiply((double) 100);
        org.apache.commons.math.complex.Complex complex97 = complex89.multiply(complex94);
        java.lang.String str98 = complex97.toString();
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
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complex92);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertNotNull(complex96);
        org.junit.Assert.assertNotNull(complex97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "(NaN, NaN)" + "'", str98, "(NaN, NaN)");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.476011660988725d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList3 = complex1.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex5 = complex1.add(1.5846623006681895d);
        org.apache.commons.math.complex.Complex complex7 = complex1.add(1.1572821586568314d);
        org.junit.Assert.assertNotNull(complexList3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        double double19 = complex17.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-3.0243902439024297d) + "'", double19 == (-3.0243902439024297d));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.ComplexField complexField26 = complex24.getField();
        org.apache.commons.math.complex.Complex complex28 = complex24.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex24.subtract(complex36);
        org.apache.commons.math.complex.Complex complex40 = complex24.divide((-1.0d));
        org.apache.commons.math.complex.Complex complex43 = complex24.createComplex(0.30689362367529766d, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex44 = complex24.acos();
        org.apache.commons.math.complex.Complex complex45 = complex17.add(complex44);
        org.apache.commons.math.complex.Complex complex47 = complex45.add(0.5113252103366474d);
        org.apache.commons.math.complex.Complex complex48 = complex45.sinh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sinh();
        java.lang.Object obj51 = complex50.readResolve();
        double double52 = complex50.abs();
        org.apache.commons.math.complex.Complex complex53 = complex50.tanh();
        org.apache.commons.math.complex.ComplexField complexField54 = complex53.getField();
        org.apache.commons.math.complex.Complex complex55 = complex53.sin();
        org.apache.commons.math.complex.Complex complex56 = complex45.divide(complex53);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.356194490192345d + "'", double7 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexField26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complexField54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        boolean boolean6 = complex0.equals((java.lang.Object) complex4);
        double double7 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex8 = complex4.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex4.negate();
        org.apache.commons.math.complex.Complex complex28 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double32 = complex31.getReal();
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex39 = complex31.subtract(complex38);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        double double44 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex42.negate();
        double double46 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex39.multiply(complex42);
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex48.log();
        org.apache.commons.math.complex.Complex complex50 = complex28.subtract(complex49);
        org.apache.commons.math.complex.Complex complex52 = complex50.subtract((double) 1L);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2.356194490192345d + "'", double44 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2.356194490192345d + "'", double46 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean14 = complex10.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        boolean boolean18 = complex15.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex19 = complex10.divide(complex15);
        org.apache.commons.math.complex.Complex complex20 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double25 = complex24.getReal();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex31 = complex28.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex32 = complex24.subtract(complex31);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex42 = complex35.divide(complex41);
        java.util.List<org.apache.commons.math.complex.Complex> complexList44 = complex42.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex45 = complex24.pow(complex42);
        double double46 = complex45.getImaginary();
        boolean boolean47 = complex21.equals((java.lang.Object) complex45);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double51 = complex50.getReal();
        org.apache.commons.math.complex.Complex complex54 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex57 = complex54.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex58 = complex50.subtract(complex57);
        org.apache.commons.math.complex.Complex complex59 = complex50.sin();
        org.apache.commons.math.complex.Complex complex60 = complex59.acos();
        boolean boolean61 = complex59.isNaN();
        org.apache.commons.math.complex.Complex complex64 = complex59.createComplex((double) '4', (double) 100.0f);
        boolean boolean65 = complex21.equals((java.lang.Object) 100.0f);
        org.apache.commons.math.complex.Complex complex66 = complex21.sinh();
        boolean boolean67 = complex7.equals((java.lang.Object) complex21);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complexList44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.08120236107192619d + "'", double46 == 0.08120236107192619d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        org.apache.commons.math.complex.Complex complex9 = complex5.exp();
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double20 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex27 = complex19.subtract(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex19.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex32.sin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex41 = complex36.subtract(complex40);
        boolean boolean42 = complex36.isInfinite();
        org.apache.commons.math.complex.Complex complex43 = complex28.add(complex36);
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        double double45 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex15.pow(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex43.cos();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.valueOf(2.6867724202798433d);
        org.apache.commons.math.complex.Complex complex50 = complex47.multiply(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex11.add(complex47);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 2.6867724202798433d + "'", double45 == 2.6867724202798433d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract((-0.0d));
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        java.lang.Object obj17 = complex16.readResolve();
        double double18 = complex16.abs();
        org.apache.commons.math.complex.Complex complex19 = complex12.subtract(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex19.log();
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex24.asin();
        org.apache.commons.math.complex.Complex complex27 = complex20.divide(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex24.multiply((-0.7853981633974483d));
        org.apache.commons.math.complex.ComplexField complexField30 = complex29.getField();
        org.apache.commons.math.complex.Complex complex31 = complex29.tanh();
        org.apache.commons.math.complex.Complex complex32 = complex29.tan();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complexField30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex5.atan();
        org.apache.commons.math.complex.Complex complex11 = complex5.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex5.acos();
        org.apache.commons.math.complex.Complex complex13 = complex12.exp();
        boolean boolean14 = complex12.isInfinite();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        org.apache.commons.math.complex.Complex complex61 = complex59.atan();
        org.apache.commons.math.complex.Complex complex63 = complex59.multiply((-0.029281239368487505d));
        org.apache.commons.math.complex.ComplexField complexField64 = complex59.getField();
        org.apache.commons.math.complex.Complex complex66 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex68 = complex66.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex69 = complex68.asin();
        org.apache.commons.math.complex.Complex complex70 = complex69.sqrt1z();
        org.apache.commons.math.complex.Complex complex73 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double74 = complex73.getReal();
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex80 = complex77.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex81 = complex73.subtract(complex80);
        org.apache.commons.math.complex.Complex complex82 = complex73.sin();
        org.apache.commons.math.complex.Complex complex83 = complex82.acos();
        boolean boolean84 = complex82.isNaN();
        org.apache.commons.math.complex.Complex complex87 = complex82.createComplex((double) '4', (double) 100.0f);
        org.apache.commons.math.complex.Complex complex88 = complex82.atan();
        org.apache.commons.math.complex.Complex complex89 = complex70.add(complex82);
        boolean boolean90 = complex59.equals((java.lang.Object) complex89);
        org.apache.commons.math.complex.Complex complex91 = complex59.atan();
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
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complexField64);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(complex91);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        org.apache.commons.math.complex.Complex complex75 = complex71.sinh();
        org.apache.commons.math.complex.Complex complex76 = complex71.negate();
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
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex10.createComplex((double) (-1), (double) (short) -1);
        boolean boolean14 = complex8.equals((java.lang.Object) complex10);
        org.apache.commons.math.complex.Complex complex15 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex17 = complex16.log();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        java.lang.Class<?> wildcardClass19 = complex16.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        double double25 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex23.subtract(3.79966999576974d);
        org.apache.commons.math.complex.Complex complex28 = complex23.tan();
        java.lang.String str29 = complex23.toString();
        org.apache.commons.math.complex.Complex complex31 = complex23.multiply(0.9416679725568717d);
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5751325350545315d + "'", double25 == 0.5751325350545315d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(9242.376843891576, 5991.220190357721)" + "'", str29, "(9242.376843891576, 5991.220190357721)");
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 10L, 32.0d);
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract((double) (short) -1);
        org.apache.commons.math.complex.Complex complex5 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (byte) 1);
        double double20 = complex17.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = complex17.atan();
        org.apache.commons.math.complex.Complex complex22 = complex17.acos();
        boolean boolean23 = complex11.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex24 = complex11.log();
        java.lang.String str25 = complex11.toString();
        org.apache.commons.math.complex.Complex complex26 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.asin();
        org.apache.commons.math.complex.Complex complex28 = complex2.add(complex27);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(1.0, -0.0)" + "'", str25, "(1.0, -0.0)");
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(0.0d);
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((-1.5707963267948966d), 100.0d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex23 = complex13.divide(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.ComplexField complexField29 = complex27.getField();
        org.apache.commons.math.complex.Complex complex31 = complex27.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        double double36 = complex34.getArgument();
        boolean boolean37 = complex31.equals((java.lang.Object) double36);
        org.apache.commons.math.complex.Complex complex38 = complex31.negate();
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double43 = complex42.getReal();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex49 = complex46.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex50 = complex42.subtract(complex49);
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex60 = complex53.divide(complex59);
        java.util.List<org.apache.commons.math.complex.Complex> complexList62 = complex60.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex63 = complex42.pow(complex60);
        double double64 = complex63.getImaginary();
        org.apache.commons.math.complex.Complex complex65 = complex63.cos();
        org.apache.commons.math.complex.Complex complex67 = complex63.pow(0.0d);
        org.apache.commons.math.complex.Complex complex68 = complex38.add(complex63);
        org.apache.commons.math.complex.Complex complex71 = complex68.createComplex(Double.NaN, 0.8337300251311491d);
        org.apache.commons.math.complex.Complex complex72 = complex68.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex24.add(complex68);
        org.apache.commons.math.complex.Complex complex76 = complex68.createComplex(5.2983923556150705d, (double) 0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexList22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.356194490192345d + "'", double36 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complexList62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.08120236107192619d + "'", double64 == 0.08120236107192619d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double4 = complex3.getReal();
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex11 = complex3.subtract(complex10);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        double double16 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex14.negate();
        double double18 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex19 = complex11.multiply(complex14);
        org.apache.commons.math.complex.Complex complex20 = complex14.log();
        double double21 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex14.log();
        org.apache.commons.math.complex.Complex complex23 = complex0.multiply(complex14);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double32 = complex31.getReal();
        org.apache.commons.math.complex.Complex complex33 = complex26.add(complex31);
        double double34 = complex26.abs();
        org.apache.commons.math.complex.Complex complex35 = complex26.asin();
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex(9.0d, (double) (short) 10);
        org.apache.commons.math.complex.Complex complex39 = complex35.subtract(complex38);
        org.apache.commons.math.complex.Complex complex41 = complex35.multiply((double) (-1L));
        org.apache.commons.math.complex.Complex complex43 = complex41.add((-0.04251371856656924d));
        org.apache.commons.math.complex.Complex complex44 = complex14.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.log();
        java.util.List<org.apache.commons.math.complex.Complex> complexList47 = complex43.nthRoot((int) (byte) 1);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.356194490192345d + "'", double16 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.356194490192345d + "'", double18 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.4142135623730951d + "'", double34 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexList47);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        org.apache.commons.math.complex.Complex complex9 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(32.63632863309239d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(1.2872739127080917, -0.6480372940022747)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(1.2872739127080917, -0.6480372940022747)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(1.2872739127080917, -0.6480372940022747)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex2.subtract(2.0256165601048464d);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double23 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex24 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex22.add((double) 10);
        double double28 = complex27.getReal();
        org.apache.commons.math.complex.Complex complex29 = complex14.pow(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex14.add((-0.7909802397860244d));
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 9.0d + "'", double28 == 9.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.ComplexField complexField14 = complex12.getField();
        org.apache.commons.math.complex.Complex complex16 = complex12.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        double double21 = complex19.getArgument();
        boolean boolean22 = complex16.equals((java.lang.Object) double21);
        org.apache.commons.math.complex.Complex complex23 = complex16.negate();
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        double double28 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex29 = complex26.negate();
        org.apache.commons.math.complex.Complex complex31 = complex29.divide((double) 1);
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex38 = complex34.sin();
        org.apache.commons.math.complex.Complex complex41 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex45.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex49 = complex41.add(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex38.divide(complex49);
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex53.pow(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        boolean boolean57 = complex38.equals((java.lang.Object) complex56);
        org.apache.commons.math.complex.Complex complex58 = complex38.cosh();
        org.apache.commons.math.complex.Complex complex59 = complex31.add(complex38);
        org.apache.commons.math.complex.Complex complex60 = complex16.multiply(complex59);
        org.apache.commons.math.complex.Complex complex61 = complex59.tanh();
        org.apache.commons.math.complex.Complex complex62 = complex61.sqrt1z();
        org.apache.commons.math.complex.Complex complex65 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double66 = complex65.getReal();
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex72 = complex69.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex73 = complex65.subtract(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex72.sqrt1z();
        org.apache.commons.math.complex.Complex complex75 = complex61.divide(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex5.add(complex74);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexField14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.356194490192345d + "'", double21 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.356194490192345d + "'", double28 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) 1.0f, 0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex11.divide(complex17);
        boolean boolean19 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex11.asin();
        org.apache.commons.math.complex.Complex complex23 = complex20.createComplex(1.4142135623730951d, 1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex25 = complex23.pow(2.7649306308923087d);
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex35 = complex32.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex40 = complex32.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex29.subtract(complex40);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.ComplexField complexField46 = complex44.getField();
        org.apache.commons.math.complex.Complex complex48 = complex44.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex((double) 0L, (double) '4');
        boolean boolean52 = complex48.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex29.subtract(complex48);
        org.apache.commons.math.complex.Complex complex54 = complex25.divide(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex54.asin();
        boolean boolean56 = complex55.isNaN();
        org.apache.commons.math.complex.Complex complex57 = complex8.pow(complex55);
        org.apache.commons.math.complex.Complex complex59 = complex8.divide(2.8931627737962193d);
        double double60 = complex59.getArgument();
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
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complexField46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.08102458586398381d + "'", double60 == 0.08102458586398381d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 1);
        org.apache.commons.math.complex.ComplexField complexField2 = complex1.getField();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex1.sqrt();
        double double5 = complex1.abs();
        org.junit.Assert.assertNotNull(complexField2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((-0.4277859821569294d), 0.75415832996718d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.pow(0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex8 = complex4.subtract(1.0939075288148181d);
        org.apache.commons.math.complex.Complex complex9 = complex4.conjugate();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        org.apache.commons.math.complex.Complex complex40 = complex36.divide((double) 10);
        org.apache.commons.math.complex.Complex complex41 = complex36.cos();
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
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        org.apache.commons.math.complex.Complex complex38 = complex36.subtract(1.602020942307271d);
        org.apache.commons.math.complex.Complex complex41 = complex36.createComplex(1.718281828459045d, 0.0d);
        org.apache.commons.math.complex.Complex complex42 = complex41.tanh();
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
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex8.createComplex((double) (byte) 0, (double) ' ');
        double double14 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt1z();
        double double17 = complex15.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.602036160225165d + "'", double14 == 1.602036160225165d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8508958333444909d + "'", double17 == 0.8508958333444909d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        org.apache.commons.math.complex.Complex complex24 = complex22.tan();
        org.apache.commons.math.complex.Complex complex25 = complex22.cos();
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        org.apache.commons.math.complex.Complex complex26 = complex25.log();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply(9.055385138137417d);
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
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) ' ');
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex(0.0d, (-1.0d));
        org.apache.commons.math.complex.Complex complex6 = complex0.acos();
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex(0.0d, 0.9473574487656714d);
        org.apache.commons.math.complex.Complex complex11 = complex6.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        org.apache.commons.math.complex.Complex complex32 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex32.pow(complex33);
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double38 = complex37.getReal();
        org.apache.commons.math.complex.Complex complex39 = complex32.add(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex42 = complex37.add((double) 10);
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math.complex.Complex complex45 = complex42.divide((double) 1);
        org.apache.commons.math.complex.Complex complex46 = complex42.acos();
        org.apache.commons.math.complex.Complex complex47 = complex29.add(complex42);
        org.apache.commons.math.complex.Complex complex49 = complex29.add(0.0d);
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
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        double double4 = complex1.abs();
        org.apache.commons.math.complex.Complex complex5 = complex1.tanh();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex7.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex16 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex20 = complex12.subtract(complex19);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        double double25 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex23.negate();
        double double27 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex20.multiply(complex23);
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        double double33 = complex31.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex31.negate();
        org.apache.commons.math.complex.Complex complex36 = complex34.divide((double) 1);
        org.apache.commons.math.complex.Complex complex37 = complex34.asin();
        org.apache.commons.math.complex.Complex complex38 = complex34.tan();
        org.apache.commons.math.complex.Complex complex39 = complex23.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex9.add(complex23);
        org.apache.commons.math.complex.Complex complex41 = complex23.sqrt();
        boolean boolean42 = complex1.equals((java.lang.Object) complex41);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "(0.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.356194490192345d + "'", double25 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.356194490192345d + "'", double27 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.356194490192345d + "'", double33 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        double double18 = complex17.getReal();
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(0.11065722117389565d);
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.07791954153215667d) + "'", double18 == (-0.07791954153215667d));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex4.negate();
        double double28 = complex27.abs();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex31.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex36 = complex34.add((double) (byte) 1);
        double double37 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex34.atan();
        org.apache.commons.math.complex.Complex complex39 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex27.multiply(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex27.cos();
        org.apache.commons.math.complex.Complex complex43 = complex41.subtract(10.019331316097812d);
        boolean boolean44 = complex43.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.4142135623730951d + "'", double28 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 32.0d + "'", double37 == 32.0d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.9888977057628652d), (double) 100.0f);
        org.apache.commons.math.complex.Complex complex4 = complex2.subtract((-0.9888977057628652d));
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex7.subtract(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex7.sin();
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex19 = complex17.divide((double) 1);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        double double24 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex25 = complex22.negate();
        org.apache.commons.math.complex.Complex complex27 = complex25.divide((double) 1);
        org.apache.commons.math.complex.Complex complex28 = complex19.subtract(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex19.negate();
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex31 = complex2.multiply(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex29.tan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex32.nthRoot((int) (short) 1);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean36 = complex35.isInfinite();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.valueOf((double) '4');
        org.apache.commons.math.complex.Complex complex40 = complex37.pow(complex39);
        double double41 = complex39.getImaginary();
        org.apache.commons.math.complex.Complex complex42 = complex35.pow(complex39);
        org.apache.commons.math.complex.Complex complex45 = complex39.createComplex(1.0612750619050355d, (-0.45482023330994986d));
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt1z();
        org.apache.commons.math.complex.Complex complex47 = complex45.tan();
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex53 = complex50.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex54 = complex50.sin();
        org.apache.commons.math.complex.Complex complex57 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex60 = complex57.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex64 = complex61.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex65 = complex57.add(complex64);
        org.apache.commons.math.complex.Complex complex66 = complex54.divide(complex65);
        org.apache.commons.math.complex.Complex complex69 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex71 = complex69.pow(complex70);
        org.apache.commons.math.complex.Complex complex72 = complex71.cosh();
        boolean boolean73 = complex54.equals((java.lang.Object) complex72);
        org.apache.commons.math.complex.Complex complex74 = complex54.asin();
        org.apache.commons.math.complex.Complex complex75 = complex54.acos();
        org.apache.commons.math.complex.Complex complex76 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex77 = complex54.conjugate();
        org.apache.commons.math.complex.Complex complex78 = complex77.conjugate();
        org.apache.commons.math.complex.Complex complex79 = complex78.tan();
        org.apache.commons.math.complex.Complex complex80 = complex45.pow(complex79);
        boolean boolean81 = complex32.equals((java.lang.Object) complex80);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.356194490192345d + "'", double24 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.770618290769386d + "'", double30 == 2.770618290769386d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        double double5 = complex4.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(11013.232874703393d);
        org.apache.commons.math.complex.Complex complex9 = complex4.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.761594155955765d + "'", double5 == 0.761594155955765d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = complex2.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex7.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex11 = complex6.subtract(complex10);
        boolean boolean12 = complex10.isNaN();
        double double13 = complex10.abs();
        org.apache.commons.math.complex.Complex complex14 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex10.cos();
        org.apache.commons.math.complex.Complex complex17 = complex10.subtract(11013.232874703393d);
        org.apache.commons.math.complex.Complex complex18 = complex17.acos();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.4142135623730951d + "'", double13 == 1.4142135623730951d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(1.4142135623730951d);
        org.apache.commons.math.complex.Complex complex16 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex2.subtract(complex16);
        java.lang.Object obj18 = complex2.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "(0.0, 0.0)");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (short) 100, (double) ' ');
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex13 = complex5.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex2.subtract(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex2.sin();
        java.lang.Object obj16 = complex2.readResolve();
        org.apache.commons.math.complex.Complex complex17 = complex2.log();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "(100.0, 32.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "(100.0, 32.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "(100.0, 32.0)");
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
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
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        org.apache.commons.math.complex.Complex complex18 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex14.conjugate();
        java.lang.String str20 = complex14.toString();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex34 = complex32.add((double) (byte) 1);
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex32.atan();
        org.apache.commons.math.complex.Complex complex37 = complex32.acos();
        boolean boolean38 = complex26.equals((java.lang.Object) complex37);
        org.apache.commons.math.complex.Complex complex41 = complex26.createComplex(0.0d, (-0.0d));
        org.apache.commons.math.complex.Complex complex42 = complex26.exp();
        org.apache.commons.math.complex.Complex complex43 = complex14.multiply(complex42);
        double double44 = complex43.getReal();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0.0, 32.0)" + "'", str20, "(0.0, 32.0)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 32.0d + "'", double35 == 32.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) 1.0f, 0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex9 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex9.divide(0.6349639147847361d);
        java.lang.Object obj12 = complex9.readResolve();
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
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(0.0, 0.0)");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.valueOf(0.11065722117389565d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex3.nthRoot(10);
        org.apache.commons.math.complex.Complex complex7 = complex3.divide((-1.1719284454208705d));
        org.apache.commons.math.complex.Complex complex8 = complex1.multiply(complex7);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexList5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(2.6867724202798433d, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(0.03024390243902439d);
        double double7 = complex3.abs();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.ComplexField complexField12 = complex10.getField();
        org.apache.commons.math.complex.Complex complex14 = complex10.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex20.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = complex10.subtract(complex22);
        org.apache.commons.math.complex.ComplexField complexField25 = complex10.getField();
        org.apache.commons.math.complex.Complex complex26 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex3.pow(complex10);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0959495779016417d + "'", double7 == 2.0959495779016417d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex8 = complex5.subtract(0.25651428512162844d);
        org.apache.commons.math.complex.Complex complex9 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex12.sin();
        org.apache.commons.math.complex.Complex complex17 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        double double19 = complex17.getReal();
        org.apache.commons.math.complex.Complex complex20 = complex9.multiply(complex17);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.272019649514069d + "'", double19 == 1.272019649514069d);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.9998828036967822d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        java.lang.Object obj56 = complex51.readResolve();
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
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "(-0.32821152988188157, -0.3458010721341096)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "(-0.32821152988188157, -0.3458010721341096)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "(-0.32821152988188157, -0.3458010721341096)");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.sin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.asin();
        org.apache.commons.math.complex.Complex complex13 = complex2.multiply((double) (byte) -1);
        org.apache.commons.math.complex.Complex complex14 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex14.add((double) (-1L));
        double double17 = complex16.getArgument();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0119200785809124d + "'", double17 == 3.0119200785809124d);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.asin();
        boolean boolean9 = complex5.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex5.negate();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex5.subtract(0.7861513777574233d);
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        org.apache.commons.math.complex.Complex complex9 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        double double11 = complex9.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2022464708445808d + "'", double11 == 1.2022464708445808d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        double double54 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex55 = complex36.acos();
        java.lang.Class<?> wildcardClass56 = complex55.getClass();
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
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.11065722117389565d + "'", double54 == 0.11065722117389565d);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        org.apache.commons.math.complex.Complex complex35 = complex17.sqrt();
        boolean boolean36 = complex17.isInfinite();
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
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(45.276925690687094d, 0.4023594781085251d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.multiply((double) (short) 100);
        double double12 = complex9.getReal();
        org.apache.commons.math.complex.Complex complex13 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex9.negate();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03219512195121951d + "'", double12 == 0.03219512195121951d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex40 = complex33.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) (-1), (double) (short) -1);
        boolean boolean45 = complex39.equals((java.lang.Object) complex41);
        org.apache.commons.math.complex.Complex complex46 = complex41.atan();
        org.apache.commons.math.complex.Complex complex47 = complex41.sqrt1z();
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex21.add(complex47);
        org.apache.commons.math.complex.Complex complex50 = complex21.tan();
        org.apache.commons.math.complex.Complex complex51 = complex50.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = complex50.conjugate();
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
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 1.0f, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot(1);
        org.apache.commons.math.complex.Complex complex6 = complex2.cos();
        java.lang.String str7 = complex6.toString();
        org.apache.commons.math.complex.Complex complex9 = complex6.divide(1.244366477504623d);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexList5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0.8337300251311491, -0.9888977057628651)" + "'", str7, "(0.8337300251311491, -0.9888977057628651)");
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        org.apache.commons.math.complex.Complex complex24 = complex13.sinh();
        java.lang.Object obj25 = complex13.readResolve();
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "(-1.0, 1.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "(-1.0, 1.0)");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-2.772341431144364d));
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-0.03652449342863152d));
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.divide(0.19876611034641298d);
        boolean boolean13 = complex9.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        boolean boolean17 = complex14.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex18 = complex14.exp();
        org.apache.commons.math.complex.Complex complex19 = complex9.subtract(complex18);
        boolean boolean21 = complex19.equals((java.lang.Object) (-2.2234376401506473d));
        org.apache.commons.math.complex.Complex complex22 = complex19.sqrt();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = complex22.subtract((-9625.540360093091d));
        org.apache.commons.math.complex.Complex complex27 = complex25.subtract(1.1708356379124094d);
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.34564249514653655d), 1.5607961601707163d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.6220932580717584d);
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex5 = complex3.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex6 = complex3.log();
        java.lang.Object obj7 = complex6.readResolve();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex18 = complex10.subtract(complex17);
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        double double23 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex24 = complex21.negate();
        double double25 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex18.multiply(complex21);
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex27.log();
        org.apache.commons.math.complex.Complex complex29 = complex6.multiply(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply(2.910310816666896d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(0.2573165113878535, -0.8703274249911193)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(0.2573165113878535, -0.8703274249911193)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(0.2573165113878535, -0.8703274249911193)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.356194490192345d + "'", double23 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.356194490192345d + "'", double25 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex29.multiply((double) (short) 10);
        double double32 = complex31.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex31.divide((-1.1719284454208705d));
        org.apache.commons.math.complex.Complex complex37 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.ComplexField complexField39 = complex37.getField();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean41 = complex37.equals((java.lang.Object) complex40);
        double double42 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex43 = complex37.sin();
        org.apache.commons.math.complex.Complex complex44 = complex31.add(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex43.subtract(0.0d);
        org.apache.commons.math.complex.Complex complex47 = complex43.acos();
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
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.648507588312288d + "'", double32 == 0.648507588312288d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexField39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.356194490192345d + "'", double42 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(11013.232874703393d);
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(36.071404402473284d);
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.1892071150027212d, 2.3045168878666735d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        org.apache.commons.math.complex.ComplexField complexField15 = complex12.getField();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complexField15);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex4.negate();
        org.apache.commons.math.complex.Complex complex28 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double32 = complex31.getReal();
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = complex35.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex39 = complex31.subtract(complex38);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        double double44 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex45 = complex42.negate();
        double double46 = complex42.getArgument();
        org.apache.commons.math.complex.Complex complex47 = complex39.multiply(complex42);
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex49 = complex48.log();
        org.apache.commons.math.complex.Complex complex50 = complex28.subtract(complex49);
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = complex53.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex57 = complex53.sin();
        double double58 = complex53.getArgument();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double62 = complex61.getReal();
        org.apache.commons.math.complex.Complex complex65 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex68 = complex65.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex69 = complex61.subtract(complex68);
        org.apache.commons.math.complex.Complex complex70 = complex53.subtract(complex68);
        org.apache.commons.math.complex.Complex complex71 = complex68.negate();
        org.apache.commons.math.complex.Complex complex72 = complex68.sin();
        boolean boolean74 = complex72.equals((java.lang.Object) 9.0d);
        org.apache.commons.math.complex.Complex complex77 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex80 = complex77.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex82 = complex80.subtract((double) ' ');
        boolean boolean83 = complex82.isInfinite();
        org.apache.commons.math.complex.Complex complex84 = complex72.divide(complex82);
        boolean boolean85 = complex82.isInfinite();
        org.apache.commons.math.complex.Complex complex87 = complex82.pow(0.0d);
        org.apache.commons.math.complex.Complex complex88 = complex50.divide(complex87);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2.356194490192345d + "'", double44 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2.356194490192345d + "'", double46 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 2.356194490192345d + "'", double58 == 2.356194490192345d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.apache.commons.math.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.divide((double) 1);
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
        org.apache.commons.math.complex.Complex complex34 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex7.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField36 = complex7.getField();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double40 = complex39.getReal();
        org.apache.commons.math.complex.Complex complex43 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex46 = complex43.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex47 = complex39.subtract(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex39.sin();
        boolean boolean49 = complex48.isNaN();
        org.apache.commons.math.complex.Complex complex51 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex53 = complex51.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex59 = complex56.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex61 = complex59.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex62 = complex53.pow(complex61);
        java.lang.Object obj63 = complex62.readResolve();
        org.apache.commons.math.complex.Complex complex64 = complex48.multiply(complex62);
        org.apache.commons.math.complex.Complex complex65 = complex62.sqrt1z();
        org.apache.commons.math.complex.Complex complex66 = complex7.multiply(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex65.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
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
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexField36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "(-0.3019075308784773, -0.9533372135812497)");
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((-0.029281239368487505d), (-1.5707963267948966d));
        org.apache.commons.math.complex.Complex complex14 = complex9.multiply(2.7584404568273957d);
        org.apache.commons.math.complex.Complex complex15 = complex9.cos();
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex9.nthRoot(100);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexList17);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.06429984768735961d, 2.8931627737962193d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double9 = complex8.getReal();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex8.subtract(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex8.sin();
        org.apache.commons.math.complex.Complex complex18 = complex17.acos();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex21.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex25 = complex21.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex30 = complex25.subtract(complex29);
        boolean boolean31 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex17.add(complex25);
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex32.subtract(32.0d);
        boolean boolean36 = complex2.equals((java.lang.Object) complex35);
        org.apache.commons.math.complex.Complex complex37 = complex2.sin();
        org.apache.commons.math.complex.Complex complex38 = complex2.exp();
        double double39 = complex2.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.4142135623730951d + "'", double39 == 1.4142135623730951d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex31 = complex24.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex31.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex35 = complex31.multiply((double) (-1.0f));
        org.apache.commons.math.complex.ComplexField complexField36 = complex35.getField();
        org.apache.commons.math.complex.Complex complex37 = complex21.subtract(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex37.multiply((-0.04251371856656924d));
        boolean boolean40 = complex39.isNaN();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complexField36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        org.apache.commons.math.complex.Complex complex27 = complex23.multiply((double) 100);
        org.apache.commons.math.complex.Complex complex29 = complex23.multiply(1.602020942307271d);
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
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.0d);
        org.apache.commons.math.complex.ComplexField complexField2 = complex1.getField();
        org.junit.Assert.assertNotNull(complexField2);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.apache.commons.math.complex.Complex complex7 = complex4.createComplex((double) (short) 100, (double) 1);
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.atan();
        org.apache.commons.math.complex.Complex complex11 = complex9.add(2.6867724202798433d);
        java.lang.String str12 = complex11.toString();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(4.247570080088165, 9.998000533168412E-5)" + "'", str12, "(4.247570080088165, 9.998000533168412E-5)");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        org.apache.commons.math.complex.Complex complex6 = complex2.negate();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        boolean boolean13 = complex9.equals((java.lang.Object) complex12);
        double double14 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex2.divide(complex15);
        double double17 = complex16.abs();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.356194490192345d + "'", double14 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        double double13 = complex11.abs();
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract((-0.9187976389280741d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.031204327661634d + "'", double13 == 32.031204327661634d);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((-1.0839233273386948d));
        org.apache.commons.math.complex.Complex complex3 = complex1.divide((double) (short) 100);
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.exp();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        org.apache.commons.math.complex.Complex complex17 = complex16.negate();
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = complex18.cosh();
        double double21 = complex18.getImaginary();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-10.235281566160843d) + "'", double21 == (-10.235281566160843d));
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex10 = complex2.add(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex9.divide(0.19876611034641298d);
        boolean boolean13 = complex9.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        boolean boolean17 = complex14.equals((java.lang.Object) (short) 1);
        org.apache.commons.math.complex.Complex complex18 = complex14.exp();
        org.apache.commons.math.complex.Complex complex19 = complex9.subtract(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(1.2934544550420957d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.exp();
        java.lang.Class<?> wildcardClass6 = complex4.getClass();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10);
        double double2 = complex1.abs();
        org.apache.commons.math.complex.Complex complex3 = complex1.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.sinh();
        java.lang.Object obj6 = complex5.readResolve();
        java.lang.Object obj7 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex8 = complex5.log();
        org.apache.commons.math.complex.Complex complex9 = complex3.subtract(complex5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(0.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.pow((double) (short) 0);
        org.apache.commons.math.complex.Complex complex10 = complex7.sin();
        org.apache.commons.math.complex.Complex complex11 = complex3.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(2.7649306308923087d);
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) 100L);
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex6.sin();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex21 = complex13.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex10.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.exp();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = complex24.divide(0.30689362367529766d);
        org.apache.commons.math.complex.Complex complex29 = complex23.divide(complex24);
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = complex35.cos();
        org.apache.commons.math.complex.Complex complex39 = complex34.add(complex35);
        org.apache.commons.math.complex.Complex complex40 = complex30.subtract(complex35);
        org.apache.commons.math.complex.Complex complex41 = complex35.negate();
        java.lang.String str42 = complex41.toString();
        org.apache.commons.math.complex.Complex complex43 = complex1.add(complex41);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(-1.0, -0.0)" + "'", str42, "(-1.0, -0.0)");
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.19876611034641298d, 1.1892071150027212d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        double double15 = complex13.getArgument();
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.pow((-2.0d));
        org.apache.commons.math.complex.Complex complex21 = complex18.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex9.divide(complex22);
        double double24 = complex9.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.356194490192345d + "'", double15 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0284274681713461d + "'", double24 == 1.0284274681713461d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.add((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex4 = complex1.acos();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex1.multiply(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        org.apache.commons.math.complex.Complex complex24 = complex23.cos();
        double double25 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex23.subtract(3.79966999576974d);
        org.apache.commons.math.complex.Complex complex28 = complex23.tan();
        org.apache.commons.math.complex.ComplexField complexField29 = complex23.getField();
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
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5751325350545315d + "'", double25 == 0.5751325350545315d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complexField29);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(2.5707963267948966d, (-5.551115123125783E-17d));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.exp();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.divide((double) (-1.0f));
        org.apache.commons.math.complex.Complex complex6 = complex4.multiply((double) 100);
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        double double13 = complex11.getArgument();
        org.apache.commons.math.complex.Complex complex14 = complex11.negate();
        org.apache.commons.math.complex.Complex complex16 = complex14.divide((double) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.asin();
        org.apache.commons.math.complex.Complex complex18 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex18.divide(0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex21 = complex6.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = complex23.multiply((double) (short) 1);
        org.apache.commons.math.complex.Complex complex26 = complex23.exp();
        org.apache.commons.math.complex.Complex complex29 = complex26.createComplex(1.718281828459045d, (double) 1);
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex32 = complex21.subtract(complex26);
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex38 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex42 = complex35.divide(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        double double44 = complex42.getImaginary();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) (short) 1);
        org.apache.commons.math.complex.Complex complex48 = complex46.divide((double) 'a');
        org.apache.commons.math.complex.Complex complex49 = complex48.atan();
        org.apache.commons.math.complex.Complex complex50 = complex48.atan();
        org.apache.commons.math.complex.Complex complex51 = complex42.add(complex48);
        org.apache.commons.math.complex.Complex complex52 = complex48.sin();
        org.apache.commons.math.complex.Complex complex53 = complex26.add(complex48);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.356194490192345d + "'", double13 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.03024390243902439d + "'", double44 == 0.03024390243902439d);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex6 = complex3.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        double double4 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex2.negate();
        double double6 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex8 = complex2.subtract(0.03024390243902439d);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(1.4453965766582497d);
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex19 = complex17.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex20 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex19.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex19.nthRoot(10);
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex41 = complex33.add(complex40);
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex43.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField47 = complex46.getField();
        org.apache.commons.math.complex.Complex complex48 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex41.divide(complex46);
        org.apache.commons.math.complex.Complex complex50 = complex28.subtract(complex49);
        double double51 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex52 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex55 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.ComplexField complexField57 = complex55.getField();
        org.apache.commons.math.complex.Complex complex59 = complex55.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex62 = complex59.createComplex((double) 0L, (double) '4');
        org.apache.commons.math.complex.Complex complex63 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex62.add((double) (byte) -1);
        boolean boolean66 = complex65.isNaN();
        org.apache.commons.math.complex.Complex complex67 = complex52.subtract(complex65);
        org.apache.commons.math.complex.Complex complex69 = complex67.pow(0.9888977057628651d);
        org.apache.commons.math.complex.Complex complex70 = complex69.sin();
        boolean boolean71 = complex11.equals((java.lang.Object) complex69);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.356194490192345d + "'", double4 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.356194490192345d + "'", double6 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexList23);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complexField42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complexField47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2.356194490192345d + "'", double51 == 2.356194490192345d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complexField57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        java.lang.Object obj2 = complex1.readResolve();
        double double3 = complex1.abs();
        org.apache.commons.math.complex.Complex complex4 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) 1.0f, 0.08120236107192619d);
        org.apache.commons.math.complex.Complex complex9 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex12.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex16 = complex12.sqrt1z();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.add(0.761594155955765d);
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        boolean boolean26 = complex20.equals((java.lang.Object) complex24);
        org.apache.commons.math.complex.ComplexField complexField27 = complex20.getField();
        boolean boolean28 = complex9.equals((java.lang.Object) complexField27);
        java.lang.Object obj29 = complex9.readResolve();
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
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(complexField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "(1.0, 0.0)");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex5.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex9 = complex5.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex30.log();
        org.apache.commons.math.complex.Complex complex35 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.add((double) (short) 0);
        org.apache.commons.math.complex.Complex complex42 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex45 = complex42.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex46 = complex42.sin();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex47.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex51 = complex46.subtract(complex50);
        boolean boolean52 = complex46.isInfinite();
        java.lang.String str53 = complex46.toString();
        org.apache.commons.math.complex.Complex complex54 = complex39.multiply(complex46);
        org.apache.commons.math.complex.Complex complex55 = complex54.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex32.add(complex55);
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
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(-1.2984575814159773, 0.6349639147847361)" + "'", str53, "(-1.2984575814159773, 0.6349639147847361)");
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        org.apache.commons.math.complex.Complex complex26 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double27 = complex26.getReal();
        org.apache.commons.math.complex.Complex complex30 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex33 = complex30.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex34 = complex26.subtract(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex26.sin();
        org.apache.commons.math.complex.Complex complex36 = complex35.acos();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex42 = complex39.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex43 = complex39.sin();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex44.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex48 = complex43.subtract(complex47);
        boolean boolean49 = complex43.isInfinite();
        org.apache.commons.math.complex.Complex complex50 = complex35.add(complex43);
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex53 = complex50.subtract(32.0d);
        org.apache.commons.math.complex.Complex complex54 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex54.multiply((-1.1719284454208705d));
        org.apache.commons.math.complex.Complex complex57 = complex21.divide(complex54);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(0.03024390243902439d);
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = new org.apache.commons.math.complex.Complex(0.08120236107192619d);
        org.apache.commons.math.complex.ComplexField complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex14 = complex11.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex15 = complex8.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex15.multiply((double) (short) 100);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex4.subtract(complex17);
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex21.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.valueOf((-1.0d), (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex27.asin();
        org.apache.commons.math.complex.Complex complex31 = complex29.pow(0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex33 = complex29.divide(0.19540692462289833d);
        org.apache.commons.math.complex.Complex complex34 = complex29.tan();
        org.apache.commons.math.complex.Complex complex36 = complex29.pow(1.4453965766582497d);
        org.apache.commons.math.complex.Complex complex37 = complex24.multiply(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex24.exp();
        org.apache.commons.math.complex.Complex complex39 = complex2.pow(complex38);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(3.2195121951219514d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double6 = complex5.getReal();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = complex5.subtract(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex5.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex21 = complex18.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex18.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex27 = complex22.subtract(complex26);
        boolean boolean28 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex29 = complex14.add(complex22);
        org.apache.commons.math.complex.Complex complex31 = complex29.add((-1.0d));
        org.apache.commons.math.complex.Complex complex32 = complex2.multiply(complex31);
        org.apache.commons.math.complex.Complex complex34 = complex32.pow(1.4453965766582497d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex34);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.08120236107192619d, (double) (short) 1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0032914947529734d + "'", double3 == 1.0032914947529734d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math.complex.ComplexField complexField4 = complex2.getField();
        org.apache.commons.math.complex.Complex complex6 = complex2.pow((double) (short) 1);
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex14 = complex12.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex2.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex19 = complex2.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math.complex.Complex complex22 = complex19.add(2.5768045625339715d);
        boolean boolean23 = complex22.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex8);
        boolean boolean10 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex2.subtract(2.0256165601048464d);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double23 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex24 = complex17.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex22.add((double) 10);
        double double28 = complex27.getReal();
        org.apache.commons.math.complex.Complex complex29 = complex14.pow(complex27);
        double double30 = complex14.getReal();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 9.0d + "'", double28 == 9.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0525988374963946d + "'", double30 == 1.0525988374963946d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex7 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double8 = complex7.getReal();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex9.pow(2.5707963267948966d);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex0.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex5.pow((-0.8703274249911193d));
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex7 = complex5.add((double) (byte) 1);
        org.apache.commons.math.complex.Complex complex8 = complex5.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        boolean boolean11 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex13 = complex9.divide(complex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(11013.232874703393d, 0.04417261042993862d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex31 = complex28.add(0.03219512195121951d);
        org.apache.commons.math.complex.Complex complex32 = complex28.atan();
        boolean boolean33 = complex32.isNaN();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
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
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex10 = complex2.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex2.sin();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        boolean boolean13 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex11.createComplex((double) '4', (double) 100.0f);
        org.apache.commons.math.complex.Complex complex17 = complex11.atan();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        double double19 = complex18.getArgument();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.8555273286638765d + "'", double19 == 2.8555273286638765d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (byte) 1);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) (byte) -1, (double) ' ');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.Complex complex17 = complex9.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex17.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) (-1), (double) (short) -1);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex17.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex4.subtract(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex4.negate();
        org.apache.commons.math.complex.Complex complex28 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complexField23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        org.apache.commons.math.complex.Complex complex55 = complex51.cos();
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
    }
}

