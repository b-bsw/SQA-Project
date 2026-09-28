package org.apache.commons.math.fraction;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract(bigInteger1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction(bigInteger0, bigInteger1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: numerator");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.add(bigInteger2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction1.subtract(bigFraction4);
        boolean boolean6 = bigFraction0.equals((java.lang.Object) bigFraction5);
        byte byte7 = bigFraction5.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_FIFTH;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.pow(bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        java.lang.String str4 = bigFraction2.toString();
        java.lang.Class<?> wildcardClass5 = bigFraction2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 1L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction4.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        float float4 = bigFraction3.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        long long4 = bigFraction3.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        java.lang.String str4 = bigFraction0.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction5.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long11 = bigFraction10.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction10.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction9.subtract(bigFraction12);
        int int14 = bigFraction8.compareTo(bigFraction9);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long17 = bigFraction16.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction16.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction15.subtract(bigFraction18);
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction15.pow((long) '4');
        int int22 = bigFraction21.getNumeratorAsInt();
        java.math.BigInteger bigInteger23 = bigFraction21.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction9.multiply(bigInteger23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction0.pow(bigInteger23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        boolean boolean3 = bigFraction0.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.divide(2L);
        long long6 = bigFraction5.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (short) 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.reduce();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigFraction0.bigDecimalValue((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        java.lang.String str4 = bigFraction0.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.add((int) (short) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.subtract(2L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        boolean boolean3 = bigFraction0.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.divide(2L);
        double double6 = bigFraction0.percentageValue();
        org.apache.commons.math.fraction.BigFractionField bigFractionField7 = bigFraction0.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(bigFractionField7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide((long) (byte) -1);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long11 = bigFraction10.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction10.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction15 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long16 = bigFraction15.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction15.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction14.subtract(bigFraction17);
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction20 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long21 = bigFraction20.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction20.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction25 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long26 = bigFraction25.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction25.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction24.subtract(bigFraction27);
        int int29 = bigFraction23.compareTo(bigFraction24);
        org.apache.commons.math.fraction.BigFraction bigFraction30 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction31 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long32 = bigFraction31.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction31.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction30.subtract(bigFraction33);
        org.apache.commons.math.fraction.BigFraction bigFraction36 = bigFraction30.pow((long) '4');
        int int37 = bigFraction36.getNumeratorAsInt();
        java.math.BigInteger bigInteger38 = bigFraction36.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction39 = bigFraction24.multiply(bigInteger38);
        org.apache.commons.math.fraction.BigFraction bigFraction40 = bigFraction19.multiply(bigInteger38);
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction17.subtract(bigInteger38);
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction13.subtract(bigInteger38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction43 = bigFraction8.pow(bigInteger38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        long long5 = bigFraction4.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 10L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction29 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long30 = bigFraction29.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction29.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction28.subtract(bigFraction31);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction34 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long35 = bigFraction34.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction34.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction38 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction39 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long40 = bigFraction39.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction39.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction38.subtract(bigFraction41);
        int int43 = bigFraction37.compareTo(bigFraction38);
        org.apache.commons.math.fraction.BigFraction bigFraction44 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction45 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long46 = bigFraction45.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction47 = bigFraction45.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction48 = bigFraction44.subtract(bigFraction47);
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction44.pow((long) '4');
        int int51 = bigFraction50.getNumeratorAsInt();
        java.math.BigInteger bigInteger52 = bigFraction50.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction53 = bigFraction38.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction54 = bigFraction33.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction31.subtract(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction27.multiply(bigFraction55);
        java.math.BigDecimal bigDecimal59 = bigFraction56.bigDecimalValue((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 2L + "'", long35 == 2L);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigDecimal59);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        int int7 = bigFraction6.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        java.lang.Class<?> wildcardClass10 = bigFraction3.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction1.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction5.subtract(bigFraction8);
        int int10 = bigFraction4.compareTo(bigFraction5);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.subtract(bigFraction14);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction11.pow((long) '4');
        int int18 = bigFraction17.getNumeratorAsInt();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction5.multiply(bigInteger19);
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction0.multiply(bigInteger19);
        byte byte22 = bigFraction21.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction3.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction(1, (int) '#');
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(0L);
        java.math.BigDecimal bigDecimal2 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger11 = bigFraction10.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = new org.apache.commons.math.fraction.BigFraction(bigInteger8, bigInteger11);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction13.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long19 = bigFraction18.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction18.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction17.subtract(bigFraction20);
        int int22 = bigFraction16.compareTo(bigFraction17);
        org.apache.commons.math.fraction.BigFraction bigFraction23 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction24 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long25 = bigFraction24.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction24.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction23.subtract(bigFraction26);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction23.pow((long) '4');
        int int30 = bigFraction29.getNumeratorAsInt();
        java.math.BigInteger bigInteger31 = bigFraction29.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction17.multiply(bigInteger31);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = new org.apache.commons.math.fraction.BigFraction(bigInteger31);
        org.apache.commons.math.fraction.BigFraction bigFraction34 = new org.apache.commons.math.fraction.BigFraction(bigInteger31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction35 = bigFraction12.pow(bigInteger31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigFraction32);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        int int5 = bigFraction3.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.multiply((long) (byte) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        boolean boolean10 = bigFraction0.equals((java.lang.Object) bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction(10.0d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction2.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.subtract(bigFraction9);
        int int11 = bigFraction5.compareTo(bigFraction6);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction15);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction12.pow((long) '4');
        int int19 = bigFraction18.getNumeratorAsInt();
        java.math.BigInteger bigInteger20 = bigFraction18.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction6.multiply(bigInteger20);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction1.pow(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.pow(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.pow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFractionField bigFractionField7 = bigFraction6.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFractionField7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) 0, (double) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction1.subtract(bigFraction4);
        boolean boolean6 = bigFraction0.equals((java.lang.Object) bigFraction5);
        int int7 = bigFraction0.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction8.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction15);
        int int17 = bigFraction11.compareTo(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction18.pow((long) '4');
        int int25 = bigFraction24.getNumeratorAsInt();
        java.math.BigInteger bigInteger26 = bigFraction24.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction12.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction7.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction0.subtract(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction0.subtract((long) 10);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction31);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((long) (byte) 1);
        int int2 = bigFraction1.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = bigFraction1.compareTo(bigFraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        java.math.BigInteger bigInteger6 = bigFraction3.getDenominator();
        byte byte7 = bigFraction3.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(1);
        float float2 = bigFraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) '#', (long) 'a');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.MINUS_ONE;
        double double1 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        java.lang.String str4 = bigFraction0.toString();
        double double5 = bigFraction0.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction4.subtract(bigFraction7);
        int int9 = bigFraction3.compareTo(bigFraction4);
        double double11 = bigFraction4.pow((double) 0L);
        double double12 = bigFraction4.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.THREE_QUARTERS;
        float float1 = bigFraction0.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.75f + "'", float1 == 0.75f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (-1), 2L);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction2.abs();
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.subtract(10);
        java.math.BigInteger bigInteger7 = bigFraction6.getNumerator();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        java.lang.String str9 = bigFraction6.toString();
        byte byte10 = bigFraction6.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4503599627370496" + "'", str9, "1 / 4503599627370496");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction5.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        double double9 = bigFraction6.doubleValue();
        float float10 = bigFraction6.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.220446049250313E-16d + "'", double9 == 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.220446E-16f + "'", float10 == 2.220446E-16f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((long) (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction29 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long30 = bigFraction29.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction29.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction28.subtract(bigFraction31);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction34 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long35 = bigFraction34.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction34.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction38 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction39 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long40 = bigFraction39.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction39.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction38.subtract(bigFraction41);
        int int43 = bigFraction37.compareTo(bigFraction38);
        org.apache.commons.math.fraction.BigFraction bigFraction44 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction45 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long46 = bigFraction45.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction47 = bigFraction45.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction48 = bigFraction44.subtract(bigFraction47);
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction44.pow((long) '4');
        int int51 = bigFraction50.getNumeratorAsInt();
        java.math.BigInteger bigInteger52 = bigFraction50.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction53 = bigFraction38.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction54 = bigFraction33.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction31.subtract(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction27.multiply(bigFraction55);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = bigFraction55.abs();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 2L + "'", long35 == 2L);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        int int10 = bigFraction9.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction3 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long4 = bigFraction3.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.subtract(bigFraction5);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction2.pow((long) '4');
        int int9 = bigFraction8.getNumeratorAsInt();
        java.math.BigInteger bigInteger10 = bigFraction8.getDenominator();
        boolean boolean11 = bigFraction1.equals((java.lang.Object) bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) 100, (int) (byte) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.add(100L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction2.multiply((int) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        int int2 = bigFraction0.getNumeratorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.divide((long) (short) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction0.add(bigFraction5);
        java.lang.Class<?> wildcardClass9 = bigFraction5.getClass();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction29 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long30 = bigFraction29.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction29.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction28.subtract(bigFraction31);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction34 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long35 = bigFraction34.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction34.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction38 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction39 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long40 = bigFraction39.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction39.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction38.subtract(bigFraction41);
        int int43 = bigFraction37.compareTo(bigFraction38);
        org.apache.commons.math.fraction.BigFraction bigFraction44 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction45 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long46 = bigFraction45.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction47 = bigFraction45.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction48 = bigFraction44.subtract(bigFraction47);
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction44.pow((long) '4');
        int int51 = bigFraction50.getNumeratorAsInt();
        java.math.BigInteger bigInteger52 = bigFraction50.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction53 = bigFraction38.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction54 = bigFraction33.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction31.subtract(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction27.multiply(bigFraction55);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long58 = bigFraction57.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction60 = bigFraction57.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction61 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction62 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long63 = bigFraction62.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction64 = bigFraction62.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction65 = bigFraction61.subtract(bigFraction64);
        int int66 = bigFraction60.compareTo(bigFraction61);
        org.apache.commons.math.fraction.BigFraction bigFraction67 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction68 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long69 = bigFraction68.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction70 = bigFraction68.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction71 = bigFraction67.subtract(bigFraction70);
        org.apache.commons.math.fraction.BigFraction bigFraction73 = bigFraction67.pow((long) '4');
        int int74 = bigFraction73.getNumeratorAsInt();
        java.math.BigInteger bigInteger75 = bigFraction73.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction76 = bigFraction61.multiply(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction77 = new org.apache.commons.math.fraction.BigFraction(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction78 = new org.apache.commons.math.fraction.BigFraction(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction79 = bigFraction55.multiply(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction80 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long81 = bigFraction80.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction83 = bigFraction80.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction85 = bigFraction83.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction86 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long87 = bigFraction86.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction88 = bigFraction86.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction89 = bigFraction83.add(bigFraction88);
        org.apache.commons.math.fraction.BigFraction bigFraction92 = new org.apache.commons.math.fraction.BigFraction((long) '4', (-1L));
        org.apache.commons.math.fraction.BigFraction bigFraction94 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger95 = bigFraction94.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction96 = bigFraction92.multiply(bigInteger95);
        org.apache.commons.math.fraction.BigFraction bigFraction97 = bigFraction83.multiply(bigInteger95);
        org.apache.commons.math.fraction.BigFraction bigFraction98 = new org.apache.commons.math.fraction.BigFraction(bigInteger75, bigInteger95);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 2L + "'", long35 == 2L);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 2L + "'", long63 == 2L);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 2L + "'", long69 == 2L);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction79);
        org.junit.Assert.assertNotNull(bigFraction80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertNotNull(bigFraction83);
        org.junit.Assert.assertNotNull(bigFraction85);
        org.junit.Assert.assertNotNull(bigFraction86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 2L + "'", long87 == 2L);
        org.junit.Assert.assertNotNull(bigFraction88);
        org.junit.Assert.assertNotNull(bigFraction89);
        org.junit.Assert.assertNotNull(bigInteger95);
        org.junit.Assert.assertNotNull(bigFraction96);
        org.junit.Assert.assertNotNull(bigFraction97);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction(10, 100);
        int int3 = bigFraction2.getNumeratorAsInt();
        double double4 = bigFraction2.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1d + "'", double4 == 0.1d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.MINUS_ONE;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        float float4 = bigFraction0.floatValue();
        float float5 = bigFraction0.floatValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigFraction0.bigDecimalValue((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_QUARTER;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.multiply((int) (short) 10);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        java.math.BigInteger bigInteger4 = bigFraction0.getNumerator();
        short short5 = bigInteger4.shortValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger2 = bigFraction1.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(2L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction0.subtract(bigFraction7);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.subtract(bigFraction14);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction7.add(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.divide((int) (short) -1);
        int int8 = bigFraction7.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.subtract(bigFraction9);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction6.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction14 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long15 = bigFraction14.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction14.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        int int23 = bigFraction17.compareTo(bigFraction18);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction25 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long26 = bigFraction25.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction25.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction24.subtract(bigFraction27);
        org.apache.commons.math.fraction.BigFraction bigFraction30 = bigFraction24.pow((long) '4');
        int int31 = bigFraction30.getNumeratorAsInt();
        java.math.BigInteger bigInteger32 = bigFraction30.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction18.multiply(bigInteger32);
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction13.multiply(bigInteger32);
        org.apache.commons.math.fraction.BigFraction bigFraction35 = bigFraction6.subtract(bigInteger32);
        org.apache.commons.math.fraction.BigFraction bigFraction36 = bigFraction5.multiply(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        java.lang.String str8 = bigFraction7.toString();
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "404804506614621236704990693437834614099113299528284236713802716054860679135990693783920767402874248990374155728633623822779617474771586953734026799881477019843034848553132722728933815484186432682479535356945490137124014966849385397236206711298319112681620113024717539104666829230461005064372655017292012526615415482186989567" + "'", str8, "404804506614621236704990693437834614099113299528284236713802716054860679135990693783920767402874248990374155728633623822779617474771586953734026799881477019843034848553132722728933815484186432682479535356945490137124014966849385397236206711298319112681620113024717539104666829230461005064372655017292012526615415482186989567");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction3 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long4 = bigFraction3.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.subtract(bigFraction5);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction8.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction15);
        int int17 = bigFraction11.compareTo(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction18.pow((long) '4');
        int int25 = bigFraction24.getNumeratorAsInt();
        java.math.BigInteger bigInteger26 = bigFraction24.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction12.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction7.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction5.subtract(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction30 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction31 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long32 = bigFraction31.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction31.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction30.subtract(bigFraction33);
        org.apache.commons.math.fraction.BigFraction bigFraction35 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction36 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long37 = bigFraction36.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction39 = bigFraction36.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction40 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction41 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long42 = bigFraction41.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction43 = bigFraction41.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction44 = bigFraction40.subtract(bigFraction43);
        int int45 = bigFraction39.compareTo(bigFraction40);
        org.apache.commons.math.fraction.BigFraction bigFraction46 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction47 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long48 = bigFraction47.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction49 = bigFraction47.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction46.subtract(bigFraction49);
        org.apache.commons.math.fraction.BigFraction bigFraction52 = bigFraction46.pow((long) '4');
        int int53 = bigFraction52.getNumeratorAsInt();
        java.math.BigInteger bigInteger54 = bigFraction52.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction40.multiply(bigInteger54);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction35.multiply(bigInteger54);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = bigFraction33.subtract(bigInteger54);
        org.apache.commons.math.fraction.BigFraction bigFraction58 = bigFraction29.multiply(bigFraction57);
        org.apache.commons.math.fraction.BigFraction bigFraction59 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long60 = bigFraction59.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction62 = bigFraction59.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction63 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction64 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long65 = bigFraction64.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction66 = bigFraction64.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction67 = bigFraction63.subtract(bigFraction66);
        int int68 = bigFraction62.compareTo(bigFraction63);
        org.apache.commons.math.fraction.BigFraction bigFraction69 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction70 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long71 = bigFraction70.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction72 = bigFraction70.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction73 = bigFraction69.subtract(bigFraction72);
        org.apache.commons.math.fraction.BigFraction bigFraction75 = bigFraction69.pow((long) '4');
        int int76 = bigFraction75.getNumeratorAsInt();
        java.math.BigInteger bigInteger77 = bigFraction75.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction78 = bigFraction63.multiply(bigInteger77);
        org.apache.commons.math.fraction.BigFraction bigFraction79 = new org.apache.commons.math.fraction.BigFraction(bigInteger77);
        org.apache.commons.math.fraction.BigFraction bigFraction80 = new org.apache.commons.math.fraction.BigFraction(bigInteger77);
        org.apache.commons.math.fraction.BigFraction bigFraction81 = bigFraction57.multiply(bigInteger77);
        org.apache.commons.math.fraction.BigFraction bigFraction82 = bigFraction1.add(bigInteger77);
        org.apache.commons.math.fraction.BigFraction bigFraction84 = bigFraction82.subtract((long) (short) 100);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 2L + "'", long48 == 2L);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 2L + "'", long60 == 2L);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 2L + "'", long65 == 2L);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 2L + "'", long71 == 2L);
        org.junit.Assert.assertNotNull(bigFraction72);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigFraction78);
        org.junit.Assert.assertNotNull(bigFraction81);
        org.junit.Assert.assertNotNull(bigFraction82);
        org.junit.Assert.assertNotNull(bigFraction84);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((int) 'a');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 2L);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 100);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction1.subtract(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ZERO;
        java.math.BigDecimal bigDecimal1 = bigFraction0.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction4 = new org.apache.commons.math.fraction.BigFraction((double) (-1L), (double) 1L, (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.multiply(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        java.lang.String str4 = bigFraction0.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow(0L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 2" + "'", str4, "1 / 2");
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_THIRD;
        java.lang.String str1 = bigFraction0.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 3" + "'", str1, "1 / 3");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.divide((long) (short) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.multiply((long) ' ');
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) 2, (double) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger2 = bigFraction1.getDenominator();
        java.math.BigInteger bigInteger3 = bigFraction1.getNumerator();
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        java.math.BigDecimal bigDecimal2 = bigFraction0.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) (short) 10, (long) 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        boolean boolean3 = bigFraction0.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction1.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction5.subtract(bigFraction8);
        int int10 = bigFraction4.compareTo(bigFraction5);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.subtract(bigFraction14);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction11.pow((long) '4');
        int int18 = bigFraction17.getNumeratorAsInt();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction5.multiply(bigInteger19);
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction0.multiply(bigInteger19);
        long long22 = bigFraction21.getNumeratorAsLong();
        float float23 = bigFraction21.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2251799813685248L + "'", long22 == 2251799813685248L);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 2.25179981E15f + "'", float23 == 2.25179981E15f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_THIRDS;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((double) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger2 = bigFraction1.getDenominator();
        short short3 = bigInteger2.shortValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) '#', (int) (short) 10);
        java.math.BigInteger bigInteger3 = bigFraction2.getDenominator();
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.multiply((int) (byte) 100);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction6.reciprocal();
        long long12 = bigFraction11.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4503599627370496L + "'", long12 == 4503599627370496L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) '#', (int) (short) 10);
        long long3 = bigFraction2.getDenominatorAsLong();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction3.divide(1);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.subtract((long) (byte) -1);
        int int14 = bigFraction11.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction3.divide(1);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction3.multiply((long) (byte) 1);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.subtract(10);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.subtract((int) (short) 1);
        java.lang.String str9 = bigFraction6.toString();
        int int10 = bigFraction6.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-10" + "'", str9, "-10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        boolean boolean3 = bigFraction0.equals((java.lang.Object) false);
        double double4 = bigFraction0.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        int int2 = bigFraction0.getNumeratorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.multiply((long) ' ');
        org.apache.commons.math.fraction.BigFractionField bigFractionField5 = bigFraction4.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFractionField5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.divide((int) (short) -1);
        int int8 = bigFraction5.getDenominatorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction5.subtract(0L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.FOUR_FIFTHS;
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        float float4 = bigFraction0.floatValue();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long8 = bigFraction7.longValue();
        java.lang.String str9 = bigFraction7.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction7.subtract((long) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction12.divide(100L);
        float float16 = bigFraction12.floatValue();
        double double17 = bigFraction12.percentageValue();
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction7.subtract(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction7.reduce();
        long long20 = bigFraction7.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction7.abs();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction0.add(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction8.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction15);
        int int17 = bigFraction11.compareTo(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction18.pow((long) '4');
        int int25 = bigFraction24.getNumeratorAsInt();
        java.math.BigInteger bigInteger26 = bigFraction24.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction12.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction7.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction0.subtract(bigInteger26);
        java.math.BigDecimal bigDecimal30 = bigFraction29.bigDecimalValue();
        byte byte31 = bigDecimal30.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getNumeratorAsLong();
        boolean boolean10 = bigFraction7.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction7.divide(2L);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction6.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction13.pow((long) (short) 10);
        long long17 = bigFraction13.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 10, (int) '#');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        long long4 = bigFraction3.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger11 = bigFraction10.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction8.add(bigInteger11);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.add((int) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction3.subtract(bigFraction12);
        float float16 = bigFraction12.floatValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + Float.POSITIVE_INFINITY + "'", float16 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) '4', (-1L));
        org.apache.commons.math.fraction.BigFraction bigFraction4 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger5 = bigFraction4.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.multiply(bigInteger5);
        int int7 = bigFraction2.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.divide((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (int) '4');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        long long2 = bigFraction0.getNumeratorAsLong();
        long long3 = bigFraction0.longValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = new org.apache.commons.math.fraction.BigFraction((long) '4', (-1L));
        org.apache.commons.math.fraction.BigFraction bigFraction14 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger15 = bigFraction14.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.multiply(bigInteger15);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction3.multiply(bigInteger15);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction18.negate();
        long long20 = bigFraction19.getNumeratorAsLong();
        java.math.BigInteger bigInteger21 = bigFraction19.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = new org.apache.commons.math.fraction.BigFraction(bigInteger15, bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.multiply((-1L));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_THIRD;
        long long1 = bigFraction0.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction2.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.subtract(bigFraction9);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction12.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        int int21 = bigFraction15.compareTo(bigFraction16);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction23 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long24 = bigFraction23.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction23.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction22.subtract(bigFraction25);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction22.pow((long) '4');
        int int29 = bigFraction28.getNumeratorAsInt();
        java.math.BigInteger bigInteger30 = bigFraction28.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction16.multiply(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction11.multiply(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction9.subtract(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction5.subtract(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction37 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction39 = bigFraction37.divide((long) (short) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction40 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction41 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long42 = bigFraction41.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction43 = bigFraction41.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction44 = bigFraction40.subtract(bigFraction43);
        org.apache.commons.math.fraction.BigFraction bigFraction46 = bigFraction40.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction47 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction48 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long49 = bigFraction48.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction51 = bigFraction48.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction52 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction53 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long54 = bigFraction53.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction53.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction52.subtract(bigFraction55);
        int int57 = bigFraction51.compareTo(bigFraction52);
        org.apache.commons.math.fraction.BigFraction bigFraction58 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction59 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long60 = bigFraction59.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction61 = bigFraction59.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction62 = bigFraction58.subtract(bigFraction61);
        org.apache.commons.math.fraction.BigFraction bigFraction64 = bigFraction58.pow((long) '4');
        int int65 = bigFraction64.getNumeratorAsInt();
        java.math.BigInteger bigInteger66 = bigFraction64.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction67 = bigFraction52.multiply(bigInteger66);
        org.apache.commons.math.fraction.BigFraction bigFraction68 = bigFraction47.multiply(bigInteger66);
        org.apache.commons.math.fraction.BigFraction bigFraction69 = bigFraction40.subtract(bigInteger66);
        org.apache.commons.math.fraction.BigFraction bigFraction70 = bigFraction39.multiply(bigInteger66);
        org.apache.commons.math.fraction.BigFraction bigFraction71 = new org.apache.commons.math.fraction.BigFraction(bigInteger30, bigInteger66);
        org.apache.commons.math.fraction.BigFraction bigFraction72 = bigFraction0.add(bigInteger66);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2L + "'", long54 == 2L);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 2L + "'", long60 == 2L);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction72);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        int int8 = bigFraction3.intValue();
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        long long8 = bigFraction6.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.multiply((int) (short) 10);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.multiply((long) (byte) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction9.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction9.add(bigFraction14);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = new org.apache.commons.math.fraction.BigFraction((long) '4', (-1L));
        org.apache.commons.math.fraction.BigFraction bigFraction20 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger21 = bigFraction20.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.multiply(bigInteger21);
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction9.multiply(bigInteger21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction5.multiply(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.divide((int) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction8.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger14 = bigFraction13.getDenominator();
        java.math.BigInteger bigInteger15 = bigFraction13.getNumerator();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction8.subtract(bigInteger15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction7.divide(bigInteger15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long12 = bigFraction11.longValue();
        java.lang.String str13 = bigFraction11.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.multiply((long) (byte) 10);
        int int16 = bigFraction11.intValue();
        boolean boolean17 = bigFraction6.equals((java.lang.Object) bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.multiply((int) (short) 0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction4.subtract(bigFraction7);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction4.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction12.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        int int21 = bigFraction15.compareTo(bigFraction16);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction23 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long24 = bigFraction23.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction23.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction22.subtract(bigFraction25);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction22.pow((long) '4');
        int int29 = bigFraction28.getNumeratorAsInt();
        java.math.BigInteger bigInteger30 = bigFraction28.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction16.multiply(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction11.multiply(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction4.subtract(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction2.add(bigInteger30);
        org.apache.commons.math.fraction.BigFraction bigFraction35 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long36 = bigFraction35.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction35.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction38 = bigFraction37.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction39 = bigFraction34.divide(bigFraction38);
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction34.multiply((int) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2L + "'", long36 == 2L);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction41);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_THIRD;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = bigFraction0.bigDecimalValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        float float4 = bigFraction0.floatValue();
        double double5 = bigFraction0.percentageValue();
        int int6 = bigFraction0.intValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        long long1 = bigFraction0.getDenominatorAsLong();
        byte byte2 = bigFraction0.byteValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction7.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction4.subtract(bigFraction7);
        int int9 = bigFraction3.compareTo(bigFraction4);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction10.pow((long) '4');
        int int17 = bigFraction16.getNumeratorAsInt();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction4.multiply(bigInteger18);
        int int20 = bigFraction19.getDenominatorAsInt();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((double) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        long long8 = bigFraction6.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.subtract((long) 1);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        boolean boolean3 = bigFraction0.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.divide(2L);
        double double6 = bigFraction0.percentageValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((long) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long10 = bigFraction9.getNumeratorAsLong();
        boolean boolean12 = bigFraction9.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction9.divide(2L);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction14.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction8.multiply(bigFraction15);
        boolean boolean17 = bigFraction0.equals((java.lang.Object) bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.multiply((long) (byte) 1);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction0.multiply(0L);
        java.math.BigDecimal bigDecimal8 = bigFraction0.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigDecimal8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction(1);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.subtract(1);
        org.junit.Assert.assertNotNull(bigFraction3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.multiply((int) (byte) 100);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction6.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction6.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        java.lang.String str4 = bigFraction2.toString();
        java.math.BigInteger bigInteger5 = bigFraction2.getDenominator();
        java.math.BigDecimal bigDecimal6 = bigFraction2.bigDecimalValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((long) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getNumeratorAsLong();
        boolean boolean5 = bigFraction2.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction2.divide(2L);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction7.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction1.multiply(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction9.add((long) '#');
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.subtract((-1L));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.divide((long) (short) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction4.negate();
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        double double5 = bigFraction3.pow((double) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = bigFraction0.negate();
        long long2 = bigFraction1.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long4 = bigFraction3.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction3.divide(100L);
        java.lang.String str7 = bigFraction3.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger10 = bigFraction9.getDenominator();
        java.math.BigInteger bigInteger11 = bigFraction9.getNumerator();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction3.multiply(bigInteger11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction1.divide(bigInteger11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.add((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction6.add((long) (byte) 100);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction(4503599627370496L, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((int) (short) 0, 0);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.subtract((int) '4');
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction4.subtract(bigFraction7);
        int int9 = bigFraction3.compareTo(bigFraction4);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction10.pow((long) '4');
        int int17 = bigFraction16.getNumeratorAsInt();
        java.math.BigInteger bigInteger18 = bigFraction16.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction4.multiply(bigInteger18);
        org.apache.commons.math.fraction.BigFraction bigFraction20 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction21 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long22 = bigFraction21.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction21.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction25 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction26 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long27 = bigFraction26.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction26.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction25.subtract(bigFraction28);
        int int30 = bigFraction24.compareTo(bigFraction25);
        org.apache.commons.math.fraction.BigFraction bigFraction31 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction32 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long33 = bigFraction32.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction32.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction35 = bigFraction31.subtract(bigFraction34);
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction31.pow((long) '4');
        int int38 = bigFraction37.getNumeratorAsInt();
        java.math.BigInteger bigInteger39 = bigFraction37.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction40 = bigFraction25.multiply(bigInteger39);
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction20.multiply(bigInteger39);
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction19.multiply(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2L + "'", long27 == 2L);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction1.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction5.subtract(bigFraction8);
        int int10 = bigFraction4.compareTo(bigFraction5);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.subtract(bigFraction14);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction11.pow((long) '4');
        int int18 = bigFraction17.getNumeratorAsInt();
        java.math.BigInteger bigInteger19 = bigFraction17.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction5.multiply(bigInteger19);
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction0.multiply(bigInteger19);
        long long22 = bigFraction21.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction21.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction21.add(1);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction25.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2251799813685248L + "'", long22 == 2251799813685248L);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.THREE_QUARTERS;
        double double1 = bigFraction0.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.0d + "'", double1 == 75.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        long long5 = bigFraction3.longValue();
        int int6 = bigFraction3.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.divide((int) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction5.add((long) '4');
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = new org.apache.commons.math.fraction.BigFraction((long) '4', (-1L));
        org.apache.commons.math.fraction.BigFraction bigFraction14 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger15 = bigFraction14.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.multiply(bigInteger15);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction3.multiply(bigInteger15);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction18.pow((int) (short) 0);
        boolean boolean25 = bigFraction3.equals((java.lang.Object) bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction2 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((long) 2, 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.multiply((int) (byte) 100);
        java.math.BigDecimal bigDecimal11 = bigFraction6.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigDecimal11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction0.abs();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((double) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.subtract((long) 1);
        int int4 = bigFraction3.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math.fraction.BigFraction bigFraction3 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger6 = bigFraction5.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.add(bigInteger6);
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.add((int) (short) -1);
        org.apache.commons.math.fraction.BigFractionField bigFractionField10 = bigFraction7.getField();
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFractionField10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.getNumeratorAsInt();
        java.math.BigInteger bigInteger8 = bigFraction6.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction6.multiply((int) (byte) 100);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction6.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction6.pow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction6.divide((long) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math.exception.ZeroException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction7.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction0.subtract(bigFraction7);
        double double11 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction8.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long14 = bigFraction13.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction13.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction12.subtract(bigFraction15);
        int int17 = bigFraction11.compareTo(bigFraction12);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long20 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction18.subtract(bigFraction21);
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction18.pow((long) '4');
        int int25 = bigFraction24.getNumeratorAsInt();
        java.math.BigInteger bigInteger26 = bigFraction24.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction12.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction7.multiply(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction0.subtract(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction30 = new org.apache.commons.math.fraction.BigFraction(bigInteger26);
        org.apache.commons.math.fraction.BigFraction bigFraction31 = new org.apache.commons.math.fraction.BigFraction(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((long) '4');
        int int7 = bigFraction6.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.add((long) (-1));
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction9.multiply((long) 2);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ZERO;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction1.subtract(bigFraction4);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction7.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction12 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long13 = bigFraction12.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction11.subtract(bigFraction14);
        int int16 = bigFraction10.compareTo(bigFraction11);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction18 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long19 = bigFraction18.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction18.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction17.subtract(bigFraction20);
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction17.pow((long) '4');
        int int24 = bigFraction23.getNumeratorAsInt();
        java.math.BigInteger bigInteger25 = bigFraction23.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction11.multiply(bigInteger25);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction6.multiply(bigInteger25);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction4.subtract(bigInteger25);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction30 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long31 = bigFraction30.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction30.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction33 = bigFraction29.subtract(bigFraction32);
        org.apache.commons.math.fraction.BigFraction bigFraction34 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction35 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long36 = bigFraction35.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction38 = bigFraction35.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction39 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction40 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long41 = bigFraction40.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction40.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction43 = bigFraction39.subtract(bigFraction42);
        int int44 = bigFraction38.compareTo(bigFraction39);
        org.apache.commons.math.fraction.BigFraction bigFraction45 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction46 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long47 = bigFraction46.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction48 = bigFraction46.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction49 = bigFraction45.subtract(bigFraction48);
        org.apache.commons.math.fraction.BigFraction bigFraction51 = bigFraction45.pow((long) '4');
        int int52 = bigFraction51.getNumeratorAsInt();
        java.math.BigInteger bigInteger53 = bigFraction51.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction54 = bigFraction39.multiply(bigInteger53);
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction34.multiply(bigInteger53);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction32.subtract(bigInteger53);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = bigFraction28.multiply(bigFraction56);
        org.apache.commons.math.fraction.BigFraction bigFraction58 = bigFraction0.multiply(bigFraction28);
        double double60 = bigFraction0.pow((double) 0.0f);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2L + "'", long36 == 2L);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2L + "'", long41 == 2L);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 2L + "'", long47 == 2L);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction2.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction1.subtract(bigFraction4);
        boolean boolean6 = bigFraction0.equals((java.lang.Object) bigFraction5);
        int int7 = bigFraction5.intValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction5.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bigFraction8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        java.lang.String str4 = bigFraction2.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.multiply((long) (byte) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long9 = bigFraction8.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction8.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction11 = bigFraction7.subtract(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction7.pow((long) '4');
        int int14 = bigFraction13.getNumeratorAsInt();
        java.math.BigInteger bigInteger15 = bigFraction13.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = new org.apache.commons.math.fraction.BigFraction((double) 2.0f);
        java.math.BigInteger bigInteger18 = bigFraction17.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = new org.apache.commons.math.fraction.BigFraction(bigInteger15, bigInteger18);
        org.apache.commons.math.fraction.BigFraction bigFraction21 = bigFraction19.subtract((long) 1);
        boolean boolean22 = bigFraction2.equals((java.lang.Object) bigFraction21);
        java.math.BigDecimal bigDecimal23 = bigFraction2.bigDecimalValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction(10, 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        double double2 = bigFraction0.percentageValue();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.pow((int) (byte) 0);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction28 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction29 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long30 = bigFraction29.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction31 = bigFraction29.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction32 = bigFraction28.subtract(bigFraction31);
        org.apache.commons.math.fraction.BigFraction bigFraction33 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction34 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long35 = bigFraction34.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction37 = bigFraction34.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction38 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction39 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long40 = bigFraction39.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction41 = bigFraction39.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction42 = bigFraction38.subtract(bigFraction41);
        int int43 = bigFraction37.compareTo(bigFraction38);
        org.apache.commons.math.fraction.BigFraction bigFraction44 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction45 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long46 = bigFraction45.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction47 = bigFraction45.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction48 = bigFraction44.subtract(bigFraction47);
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction44.pow((long) '4');
        int int51 = bigFraction50.getNumeratorAsInt();
        java.math.BigInteger bigInteger52 = bigFraction50.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction53 = bigFraction38.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction54 = bigFraction33.multiply(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction55 = bigFraction31.subtract(bigInteger52);
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction27.multiply(bigFraction55);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long58 = bigFraction57.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction60 = bigFraction57.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction61 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction62 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long63 = bigFraction62.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction64 = bigFraction62.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction65 = bigFraction61.subtract(bigFraction64);
        int int66 = bigFraction60.compareTo(bigFraction61);
        org.apache.commons.math.fraction.BigFraction bigFraction67 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction68 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long69 = bigFraction68.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction70 = bigFraction68.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction71 = bigFraction67.subtract(bigFraction70);
        org.apache.commons.math.fraction.BigFraction bigFraction73 = bigFraction67.pow((long) '4');
        int int74 = bigFraction73.getNumeratorAsInt();
        java.math.BigInteger bigInteger75 = bigFraction73.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction76 = bigFraction61.multiply(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction77 = new org.apache.commons.math.fraction.BigFraction(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction78 = new org.apache.commons.math.fraction.BigFraction(bigInteger75);
        org.apache.commons.math.fraction.BigFraction bigFraction79 = bigFraction55.multiply(bigInteger75);
        java.lang.String str80 = bigFraction55.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 2L + "'", long35 == 2L);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 2L + "'", long63 == 2L);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 2L + "'", long69 == 2L);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-9007199254740991 / 2" + "'", str80, "-9007199254740991 / 2");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction0.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getNumeratorAsLong();
        boolean boolean10 = bigFraction7.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction7.divide(2L);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction12.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction6.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction13.pow((long) (short) 10);
        org.apache.commons.math.fraction.BigFraction bigFraction18 = bigFraction16.add((long) '4');
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction18.divide(100L);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction20);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.fraction.BigFraction bigFraction1 = new org.apache.commons.math.fraction.BigFraction((long) 'a');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.subtract(0L);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = bigFraction3.subtract(0);
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction3.add(bigFraction8);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction10.pow((int) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getNumeratorAsLong();
        boolean boolean20 = bigFraction17.equals((java.lang.Object) false);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction17.divide(2L);
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction22.negate();
        org.apache.commons.math.fraction.BigFraction bigFraction24 = bigFraction16.subtract(bigFraction23);
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction23.abs();
        boolean boolean26 = bigFraction3.equals((java.lang.Object) bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        float float4 = bigFraction0.floatValue();
        double double5 = bigFraction0.percentageValue();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction6.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction8.reciprocal();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction0.multiply(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = new org.apache.commons.math.fraction.BigFraction((int) (byte) 0, (-1));
        long long3 = bigFraction2.longValue();
        java.lang.String str4 = bigFraction2.toString();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction2.subtract((long) (short) 0);
        org.apache.commons.math.fraction.BigFraction bigFraction7 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long8 = bigFraction7.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction10 = bigFraction7.divide(100L);
        float float11 = bigFraction7.floatValue();
        double double12 = bigFraction7.percentageValue();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction2.subtract(bigFraction7);
        double double14 = bigFraction7.percentageValue();
        byte byte15 = bigFraction7.byteValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.pow((long) (-1));
        long long4 = bigFraction3.longValue();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = new org.apache.commons.math.fraction.BigFraction((double) (-1.0f), 10.0d, (int) (byte) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = new org.apache.commons.math.fraction.BigFraction((double) (byte) 0);
        java.math.BigInteger bigInteger11 = bigFraction10.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction8.add(bigInteger11);
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction12.add((int) (short) -1);
        org.apache.commons.math.fraction.BigFraction bigFraction15 = bigFraction3.subtract(bigFraction12);
        long long16 = bigFraction3.getNumeratorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction3.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(bigFraction17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math.fraction.BigFraction bigFraction2 = org.apache.commons.math.fraction.BigFraction.getReducedFraction((-1), (int) ' ');
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction1 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long2 = bigFraction1.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction1.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction4 = bigFraction0.subtract(bigFraction3);
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction6 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long7 = bigFraction6.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction9 = bigFraction6.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction10 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction11 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long12 = bigFraction11.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction13 = bigFraction11.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction14 = bigFraction10.subtract(bigFraction13);
        int int15 = bigFraction9.compareTo(bigFraction10);
        org.apache.commons.math.fraction.BigFraction bigFraction16 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction17 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long18 = bigFraction17.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction19 = bigFraction17.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction20 = bigFraction16.subtract(bigFraction19);
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction16.pow((long) '4');
        int int23 = bigFraction22.getNumeratorAsInt();
        java.math.BigInteger bigInteger24 = bigFraction22.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction10.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction26 = bigFraction5.multiply(bigInteger24);
        org.apache.commons.math.fraction.BigFraction bigFraction27 = bigFraction3.subtract(bigInteger24);
        org.apache.commons.math.fraction.BigFractionField bigFractionField28 = bigFraction3.getField();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFractionField28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = bigFraction0.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction5 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long6 = bigFraction5.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction5.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction8 = bigFraction4.subtract(bigFraction7);
        int int9 = bigFraction3.compareTo(bigFraction4);
        double double10 = bigFraction3.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.005d + "'", double10 == 0.005d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math.fraction.BigFraction bigFraction0 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long1 = bigFraction0.getDenominatorAsLong();
        int int2 = bigFraction0.getNumeratorAsInt();
        org.apache.commons.math.fraction.BigFraction bigFraction3 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction4 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long5 = bigFraction4.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction6 = bigFraction4.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction7 = bigFraction3.subtract(bigFraction6);
        org.apache.commons.math.fraction.BigFraction bigFraction8 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction9 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long10 = bigFraction9.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction12 = bigFraction9.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction13 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction14 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long15 = bigFraction14.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction16 = bigFraction14.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction17 = bigFraction13.subtract(bigFraction16);
        int int18 = bigFraction12.compareTo(bigFraction13);
        org.apache.commons.math.fraction.BigFraction bigFraction19 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction20 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long21 = bigFraction20.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction22 = bigFraction20.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction23 = bigFraction19.subtract(bigFraction22);
        org.apache.commons.math.fraction.BigFraction bigFraction25 = bigFraction19.pow((long) '4');
        int int26 = bigFraction25.getNumeratorAsInt();
        java.math.BigInteger bigInteger27 = bigFraction25.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction28 = bigFraction13.multiply(bigInteger27);
        org.apache.commons.math.fraction.BigFraction bigFraction29 = bigFraction8.multiply(bigInteger27);
        org.apache.commons.math.fraction.BigFraction bigFraction30 = bigFraction6.subtract(bigInteger27);
        org.apache.commons.math.fraction.BigFraction bigFraction31 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction32 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long33 = bigFraction32.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction34 = bigFraction32.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction35 = bigFraction31.subtract(bigFraction34);
        org.apache.commons.math.fraction.BigFraction bigFraction36 = org.apache.commons.math.fraction.BigFraction.TWO_QUARTERS;
        org.apache.commons.math.fraction.BigFraction bigFraction37 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long38 = bigFraction37.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction40 = bigFraction37.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction41 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction42 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long43 = bigFraction42.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction44 = bigFraction42.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction45 = bigFraction41.subtract(bigFraction44);
        int int46 = bigFraction40.compareTo(bigFraction41);
        org.apache.commons.math.fraction.BigFraction bigFraction47 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction48 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long49 = bigFraction48.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction50 = bigFraction48.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction51 = bigFraction47.subtract(bigFraction50);
        org.apache.commons.math.fraction.BigFraction bigFraction53 = bigFraction47.pow((long) '4');
        int int54 = bigFraction53.getNumeratorAsInt();
        java.math.BigInteger bigInteger55 = bigFraction53.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction56 = bigFraction41.multiply(bigInteger55);
        org.apache.commons.math.fraction.BigFraction bigFraction57 = bigFraction36.multiply(bigInteger55);
        org.apache.commons.math.fraction.BigFraction bigFraction58 = bigFraction34.subtract(bigInteger55);
        org.apache.commons.math.fraction.BigFraction bigFraction59 = bigFraction30.multiply(bigFraction58);
        org.apache.commons.math.fraction.BigFraction bigFraction60 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long61 = bigFraction60.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction63 = bigFraction60.divide(100L);
        org.apache.commons.math.fraction.BigFraction bigFraction64 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction65 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long66 = bigFraction65.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction67 = bigFraction65.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction68 = bigFraction64.subtract(bigFraction67);
        int int69 = bigFraction63.compareTo(bigFraction64);
        org.apache.commons.math.fraction.BigFraction bigFraction70 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        org.apache.commons.math.fraction.BigFraction bigFraction71 = org.apache.commons.math.fraction.BigFraction.ONE_HALF;
        long long72 = bigFraction71.getDenominatorAsLong();
        org.apache.commons.math.fraction.BigFraction bigFraction73 = bigFraction71.reduce();
        org.apache.commons.math.fraction.BigFraction bigFraction74 = bigFraction70.subtract(bigFraction73);
        org.apache.commons.math.fraction.BigFraction bigFraction76 = bigFraction70.pow((long) '4');
        int int77 = bigFraction76.getNumeratorAsInt();
        java.math.BigInteger bigInteger78 = bigFraction76.getDenominator();
        org.apache.commons.math.fraction.BigFraction bigFraction79 = bigFraction64.multiply(bigInteger78);
        org.apache.commons.math.fraction.BigFraction bigFraction80 = new org.apache.commons.math.fraction.BigFraction(bigInteger78);
        org.apache.commons.math.fraction.BigFraction bigFraction81 = new org.apache.commons.math.fraction.BigFraction(bigInteger78);
        org.apache.commons.math.fraction.BigFraction bigFraction82 = bigFraction58.multiply(bigInteger78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.BigFraction bigFraction83 = bigFraction0.pow(bigInteger78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2L + "'", long38 == 2L);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 2L + "'", long61 == 2L);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 2L + "'", long66 == 2L);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 2L + "'", long72 == 2L);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigFraction74);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigFraction79);
        org.junit.Assert.assertNotNull(bigFraction82);
    }
}

